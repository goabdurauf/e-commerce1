package com.goabdurauf.ecommerce.controllers.admin.category

import com.goabdurauf.ecommerce.controllers.base.BaseResponse
import com.goabdurauf.ecommerce.models.entity.CategoryEntity
import com.goabdurauf.ecommerce.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admin/category")
class CategoryController {

    @Autowired
    var categoryRepository: CategoryRepository? = null


    @RequestMapping(
            "/list",
            method = [RequestMethod.GET],
            produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun categoryList(
            @RequestParam id: Int? = null,
            @RequestParam name: String? = null
    ): List<CategoryEntity>? {
        var list = categoryRepository?.findByIdOrName(id = id, name = name)

        return list
    }

    @RequestMapping(
            "/add",
            method = [RequestMethod.POST],
            produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun categoryAdd(
            @RequestBody category: CategoryEntity
    ): BaseResponse? {
        var category = categoryRepository?.save(category)
        var response: BaseResponse? = null
        if (category != null) {
            response.apply {
                this?.success = true
                this?.message = "Success"
                this?.code = 200
            }
        }
        return response
    }


    @RequestMapping(
            "/edit",
            method = [RequestMethod.POST],
            produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun categoryEdit(
            @RequestBody category: CategoryEntity
    ): BaseResponse? {
        var category = categoryRepository?.save(category)
        var response: BaseResponse? = null
        if (category != null) {
            response.apply {
                this?.success = true
                this?.message = "Success"
                this?.code = 200
            }
        }
        return response
    }
}