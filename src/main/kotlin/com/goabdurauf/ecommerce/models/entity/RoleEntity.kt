package com.goabdurauf.ecommerce.models.entity

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
class RoleEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        @JsonProperty("id")
        var id: Int? = null,

        @Column(name = "name")
        @JsonProperty("name")
        var name: String? = null,

        @Column(name = "state")
        @JsonProperty("state")
        var state: Boolean = true
)