package com.maulana.adil.kotlin.restful.service

import com.maulana.adil.kotlin.restful.model.CreateProductRequest
import com.maulana.adil.kotlin.restful.model.ListProductRequest
import com.maulana.adil.kotlin.restful.model.ProductResponse
import com.maulana.adil.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

}