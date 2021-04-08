package com.goabdurauf.ecommerce.controllers.base

class BaseResponse {
    var success: Boolean? = false
    var message: String? = "Error"
    var code: Int? = 400

    constructor(success: Boolean, message: String, code: Int) {
        this.success = success
        this.message = message
        this.code = code
    }

    constructor()

}