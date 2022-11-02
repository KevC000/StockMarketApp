package com.yonasoft.stockmarketapp.domain.repository

import com.yonasoft.stockmarketapp.domain.model.CompanyListing
import com.yonasoft.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote:Boolean,
        query:String
        
    ): Flow<Resource<List<CompanyListing>>>


}