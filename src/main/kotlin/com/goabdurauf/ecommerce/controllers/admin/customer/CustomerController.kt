package com.goabdurauf.ecommerce.controllers.admin.customer

import com.goabdurauf.ecommerce.models.entity.CustomerEntity
import com.goabdurauf.ecommerce.repository.CustomerRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/admin/customer")
class CustomerController {

    var customerRepository:CustomerRepository? = null

    @RequestMapping("/list")
    fun customerList(): MutableList<CustomerEntity>? {
        var list = customerRepository?.findAll()
        return list
    }
}