package com.g.tragosapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.g.tragosapp.data.model.CocktailEntity
import com.g.tragosapp.data.model.FavoritesEntity


@Database(entities = [FavoritesEntity::class, CocktailEntity::class],version = 3, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cocktailDao(): CocktailDao
}