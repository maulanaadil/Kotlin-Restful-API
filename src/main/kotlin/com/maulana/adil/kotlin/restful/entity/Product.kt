package com.maulana.adil.kotlin.restful.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "products")
@Entity
data class Product(
    @Id
    val id: String,

    @Column(name = "name")
    var name: String,

    @Column(name = "price")
    var price: Long,

    @Column(name = "quantity")
    var quantity: Int,

    @Column(name = "created_at")
    var createdAt: Date,

    @Column(name = "Updated_at")
    var updatedAt: Date?
)