package com.goabdurauf.ecommerce.models.entity

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
class CategoryEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        @JsonProperty("id")
        var id: Int? = null,
        @Column(name = "name")
        @JsonProperty("name")
        var name: String? = null,
        @Column(name = "slug")
        @JsonProperty("slug")
        var slug: String? = null,
        @Column(name="parent_id")
        @JsonProperty("parent_id")
        var parentId: Int? = null
)
