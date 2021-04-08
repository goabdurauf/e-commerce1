package com.goabdurauf.ecommerce.repository

import com.goabdurauf.ecommerce.models.entity.CustomerEntity
import com.goabdurauf.ecommerce.models.entity.PurchaseEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PurchaseRepository:JpaRepository<PurchaseEntity,Int> {
    @Query("select u from PurchaseEntity u where u.id=?1")
    fun findByIdAndName(id: Int? = null):List<PurchaseEntity>
}