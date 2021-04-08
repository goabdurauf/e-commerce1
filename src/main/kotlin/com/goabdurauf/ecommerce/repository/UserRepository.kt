package com.goabdurauf.ecommerce.repository

import com.goabdurauf.ecommerce.models.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserEntity, Int> {
}