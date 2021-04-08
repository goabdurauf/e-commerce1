package com.goabdurauf.ecommerce.repository

import com.goabdurauf.ecommerce.models.entity.ProductEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : PagingAndSortingRepository<ProductEntity, Int> {
    //    @Query("select u from ProductEntity u where u.id=?1 and u.name like %?2%")
    fun findByIdAndName(id: Int? = null, name: String? = null): List<ProductEntity>
    fun findAllByIdOrName(id: Int? = null, name: String? = null, pageable: Pageable? = null): List<ProductEntity>
}