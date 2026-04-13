package com.isabel.expense_tracker.model
import jakarta.persistence.*


@Entity
@Table(name = "users")
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false, unique = true)
    var email: String = "",

    @Column(nullable = false, unique = true)
    var password: String = "",

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL])
    var expenses: List<Expense> = emptyList()

)