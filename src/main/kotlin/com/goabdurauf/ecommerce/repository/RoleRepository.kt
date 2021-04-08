package com.goabdurauf.ecommerce.repository

import com.goabdurauf.ecommerce.models.entity.RoleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository:JpaRepository<RoleEntity,Int> {
}