package com.example.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.database.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )
    //getAllMahasiswa
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMhs() : Flow<List<Mahasiswa>>
    //getMahasiswa
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim: String): Flow<Mahasiswa>
    //deleteMahasiswa
    @Delete
    suspend fun deleteMahasiswa (mahasiswa: Mahasiswa)
    //updateMahasiswa
    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
}