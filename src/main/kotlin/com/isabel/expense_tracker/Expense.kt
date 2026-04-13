package com.isabel.expense_tracker.model
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "expense")
class Expense (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false)
    var amount: Double = 0.0,

    @Column(nullable = false)
    var description: String = "",

    @Column(nullable = false)
    var date: LocalDate = LocalDate.now(),

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    var user: User? = null,

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    var category: Category? = null


)