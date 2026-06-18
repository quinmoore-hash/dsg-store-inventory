package com.dsg.inventory

import jakarta.persistence.*

@Entity
@Table(name = "products")
data class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String = "",
    val category: String = "",
    val price: Double = 0.0,
    val stock: Int = 0
)
