package com.goabdurauf.ecommerce.repository

import com.goabdurauf.ecommerce.models.entity.CategoryEntity
import com.goabdurauf.ecommerce.models.entity.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


@Repository
interface CustomerRepository :JpaRepository<CustomerEntity,Int>{
    @Query("select u from CustomerEntity u where u.id=?1 and u.userName like %?2%")
    fun findByIdAndName(id: Int? = null, name:String? = null):List<CustomerEntity>
}