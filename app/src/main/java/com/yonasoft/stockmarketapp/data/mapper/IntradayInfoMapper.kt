package com.yonasoft.stockmarketapp.data.mapper


import com.yonasoft.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.yonasoft.stockmarketapp.data.remote.dto.IntradayInfoDto
import com.yonasoft.stockmarketapp.domain.model.CompanyInfo
import com.yonasoft.stockmarketapp.domain.model.IntradayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun IntradayInfoDto.toIntradayInfo(): IntradayInfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime= LocalDateTime.parse(timestamp, formatter)
    return IntradayInfo(
        date = localDateTime,
        close = close,

    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description?:"",
        name = name?:"",
        country = country?:"",
        industry = industry?:""
    )
}