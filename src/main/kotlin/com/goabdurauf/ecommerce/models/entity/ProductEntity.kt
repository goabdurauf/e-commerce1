package com.goabdurauf.ecommerce.models.entity

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.CreationTimestamp
import java.util.*
import javax.persistence.*

@Entity
class ProductEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        @JsonProperty("id")
        var id: Int? = null,
        @Column(name = "name")
        @JsonProperty("name")
        var name: String? = null,
        @Column(name = "description")
        @JsonProperty("description")
        var description: String? = null,
        @Column(name = "unit")
        @JsonProperty("unit")
        var unit: String? = null,
        @Column(name = "price")
        @JsonProperty("price")
        var price: Double? = null,
        @Column(name = "sale_price")
        @JsonProperty("sale_price")
        var salePrice: Double? = null,
        @Column(name = "discount_in_percent")
        @JsonProperty("discount_in_percent")
        var discountInPercent: Double? = 0.0,
        @Column(name = "quantity")
        @JsonProperty("quantity")
        var quantity: Int? = null,
        @ManyToMany
        @JoinTable(
                name = "product_category",
                joinColumns = [JoinColumn(name = "product_id")],
                inverseJoinColumns = [JoinColumn(name = "category_id")]
        )
        @JsonProperty("category")
        var category: List<CategoryEntity>? = null,
        @JsonProperty("user_id")
        var userId: Int? = null,
        @Column(name = "attachment_id")
        @JsonProperty("attachment_id")
        var attachmentId: Int? = null,
        @Column(name = "created_at")
        @JsonProperty("created_at")
        @CreationTimestamp
        var createdAt: Date? = null,
        @Column(name = "updated_at")
        @JsonProperty("updated_at")
        @CreationTimestamp
        var updatedat: Date? = null
) {
    init {
        if (discountInPercent != null && discountInPercent!! > 0.0) {
            salePrice = (price!! / 100) * discountInPercent!!
        }
    }
}