package com.isabel.expense_tracker.model
import jakarta.persistence.*

@Entity
@Table(name = "categories")
class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false, unique = true)
    var name: String = "",

    @OneToMany(mappedBy = "category", cascade = [CascadeType.ALL])
    var expenses: List<Expense> = emptyList()
)