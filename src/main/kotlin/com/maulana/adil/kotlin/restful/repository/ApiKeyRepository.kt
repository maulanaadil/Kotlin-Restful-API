package com.maulana.adil.kotlin.restful.repository

import com.maulana.adil.kotlin.restful.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository: JpaRepository<ApiKey, String> {

}