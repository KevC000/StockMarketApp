package com.yonasoft.stockmarketapp.di

import com.yonasoft.stockmarketapp.data.csv.CSVParser
import com.yonasoft.stockmarketapp.data.csv.CompanyListingsParser
import com.yonasoft.stockmarketapp.data.repository.StockRepositoryImpl
import com.yonasoft.stockmarketapp.domain.model.CompanyListing
import com.yonasoft.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}