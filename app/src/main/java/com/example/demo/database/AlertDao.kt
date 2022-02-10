package com.example.demo.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.demo.models.Alert
import kotlinx.coroutines.flow.Flow

@Dao
interface AlertDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user:Alert)

    @Query("SELECT * FROM alert")
    fun getList(): Flow<List<Alert>>

    @Delete
    fun delete(alert: Alert)
}