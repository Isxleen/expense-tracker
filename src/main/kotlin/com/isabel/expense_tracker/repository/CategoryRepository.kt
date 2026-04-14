package com.isabel.expense_tracker.repository

import com.isabel.expense_tracker.model.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long> {

}