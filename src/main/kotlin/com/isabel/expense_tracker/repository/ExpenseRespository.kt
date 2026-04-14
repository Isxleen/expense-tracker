package com.isabel.expense_tracker.repository

import com.isabel.expense_tracker.model.Expense
import org.springframework.data.jpa.repository.JpaRepository

interface ExpenseRespository : JpaRepository<Expense, Long> {
    fun findByUserId(userId: Long): List<Expense>
    fun findByUserIdAndCategory(userId: Long, categoryId: Long): List<Expense>
}