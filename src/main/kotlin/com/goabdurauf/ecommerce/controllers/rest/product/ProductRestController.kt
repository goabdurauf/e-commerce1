package com.goabdurauf.ecommerce.controllers.rest.product

import com.goabdurauf.ecommerce.models.entity.ProductEntity
import com.goabdurauf.ecommerce.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductRestController {

    @Autowired
    var productRepository: ProductRepository? = null


    @RequestMapping(
            "/list",
            method = [RequestMethod.GET],
            produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun productList(
            @RequestParam("page", required = false, defaultValue = "1") page: Int = 1,
            @RequestParam("size", required = false, defaultValue = "2") size: Int = 3,
            @RequestParam("id", required = false) id: Int? = null,
            @RequestParam("name", required = false) name: String? = null
//            @RequestParam(required = false) categoryId: Int? = null
    ): List<ProductEntity>? {
        val paging: Pageable = PageRequest.of(page, size)
        var list = productRepository?.findAllByIdOrName(id = id, name = name,pageable = paging)
        return list
    }
}