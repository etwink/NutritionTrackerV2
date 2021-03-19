package com.example.nutritiontrackerguiv4.database;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface AllergiesDAO {

    @Insert
    void insert(Allergies allergies);

    @Update
    void update(Allergies allergies);

    @Delete
    void delete(Allergies allergies);

    @Query("SELECT * FROM Allergies")
    List<User> getAllAllergies();

    @Query("SELECT * FROM Allergies WHERE Allergy_ID=:allergyID")
    List<User> findAllInfoForAllergies(final int allergyID);


}
