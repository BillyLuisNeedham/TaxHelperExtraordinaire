package com.billyluisneedham.taxhelperextraordinaire.domain.model

data class Expense(
    val id: Long,
    val name: String,
    val dateTimeStamp: Long,
    val amount: Double,
    val receiptUrl: String,
    val notes: String,
)
