package com.goabdurauf.ecommerce.repository

import com.goabdurauf.ecommerce.models.entity.CategoryEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CategoryRepository : PagingAndSortingRepository<CategoryEntity, Int> {
    fun findByIdOrName(id: Int? = null, name:String? = null):List<CategoryEntity>
}