package com.goabdurauf.ecommerce.models.entity

import com.fasterxml.jackson.annotation.JsonProperty
import com.goabdurauf.ecommerce.models.common.Gender
import javax.persistence.*

@Entity
class CustomerEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    @JsonProperty("id")
    var id: Int? = null,

    @Column(name = "user_name")
    @JsonProperty("user_name")
    var userName:String? = null,

    @Column(name = "password")
    @JsonProperty("password")
    var password:String? = null,

    @Column(name = "email")
    @JsonProperty("email")
    var email:String? = null,

    @Column(name = "province")
    @JsonProperty("province")
    var province:String? = null,

    @Column(name = "region")
    @JsonProperty("region")
    var region:String? = null,

    @Column(name = "gender")
    @JsonProperty("gender")
    var gender:Gender? = null,

    @Column(name = "phone_number")
    @JsonProperty("phone_number")
    var phoneNumber:String? = null,

    @Column(name = "state")
    @JsonProperty("state")
    var state: Boolean = true

)