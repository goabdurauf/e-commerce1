package com.goabdurauf.ecommerce.models.entity

import com.fasterxml.jackson.annotation.JsonProperty
import com.goabdurauf.ecommerce.models.common.Gender
import javax.persistence.*

@Entity
class UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        @JsonProperty("id")
        var id:Int? = null,

        @Column(name = "user_name")
        @JsonProperty("user_name")
        var userName:String? = null,

        @Column(name = "password")
        @JsonProperty("password")
        var password:String? = null,

        @Column(name = "gender")
        @JsonProperty("gender")
        var gender: Gender? = null,

        @Column(name = "phone_number")
        @JsonProperty("phone_number")
        var phoneNumber:String? = null,

        var state:Boolean = true
)