package com.goabdurauf.ecommerce.controllers.rest.category

import com.goabdurauf.ecommerce.models.entity.CategoryEntity
import com.goabdurauf.ecommerce.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/category")
class CategoryRestController {
    @Autowired
    var categoryRepository: CategoryRepository? = null

    @RequestMapping(
            "/list",
            method = [RequestMethod.GET],
            produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun categoryList(): MutableIterable<CategoryEntity>? {
        var list = categoryRepository?.findAll()

        return list
    }
}