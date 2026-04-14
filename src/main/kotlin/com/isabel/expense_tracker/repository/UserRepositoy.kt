package com.isabel.expense_tracker.repository

import com.isabel.expense_tracker.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepositoy : JpaRepository<User, Long> {
    fun findByEmail(email : String): User?
}