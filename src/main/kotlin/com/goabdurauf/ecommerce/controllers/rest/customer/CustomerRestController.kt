package com.goabdurauf.ecommerce.controllers.rest.customer

import com.goabdurauf.ecommerce.controllers.base.BaseResponse
import com.goabdurauf.ecommerce.models.entity.CustomerEntity
import com.goabdurauf.ecommerce.repository.CustomerRepository
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customer")
class CustomerRestController {

    var customerRepository: CustomerRepository? = null

    @RequestMapping(
            "/add",
            method = [RequestMethod.POST],
            produces = [MediaType.APPLICATION_JSON_VALUE],
            consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun customerAdd(
            @RequestBody customer: CustomerEntity
    ): BaseResponse? {
        var baseResponse: BaseResponse = BaseResponse();
        var customer = customerRepository?.save(customer)

        if (customer != null) {
            return baseResponse.apply {
                this.success = true
                this.message = "Success"
                this.code = 200
            }
        }
        return baseResponse
    }
}