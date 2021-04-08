package com.goabdurauf.ecommerce.models.entity

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
class PurchaseEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        @JsonProperty("id")
        var id: Int? = null,
        @Column(name = "product_id")
        @JsonProperty("product_id")
        var productId: Int? = null,
        @Column(name = "customer_id")
        @JsonProperty("customer_id")
        var customerId: Int? = null,
        @Column(name = "quantity")
        @JsonProperty("quantity")
        var quantity: Int? = null,
        @Column(name = "cteated_at")
        @JsonProperty("created_at")
        @CreationTimestamp
        var createdAt: Date? = null

)