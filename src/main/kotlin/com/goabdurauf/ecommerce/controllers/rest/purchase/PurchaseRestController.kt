package com.goabdurauf.ecommerce.controllers.rest.purchase

import com.goabdurauf.ecommerce.controllers.base.BaseResponse
import com.goabdurauf.ecommerce.models.entity.PurchaseEntity
import com.goabdurauf.ecommerce.repository.PurchaseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PurchaseRestController {

    @Autowired
    var purchaseRepository: PurchaseRepository? = null

    @RequestMapping("/purchase")
    fun transaction(
            @RequestParam("product_id") productId: Int,
            @RequestParam("customer_id") customerId: Int,
            @RequestParam("quantity") quantity: Int,
    ): BaseResponse {
        var transaction = PurchaseEntity(
                productId = productId,
                customerId = customerId,
                quantity = quantity
        )
        val save = purchaseRepository?.save(transaction)
        return if (save != null) {
            BaseResponse(success = true, message = "Success", code = 200)
        } else {
            BaseResponse(success = false, message = "Error", code = 500)
        }

    }
}