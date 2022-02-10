package com.example.demo.models

data class AlertsResponseClass(
    val articles: ArrayList<Alert>,
    val totalResults: Int,
    val status: String,
)