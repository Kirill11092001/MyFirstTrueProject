package com.example.firstproject

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

// Расширение для DataStore
val Context.dataStore by preferencesDataStore("user_prefs")

// Ключ для проверки, были ли данные сохранены
val IS_DATA_SAVED = booleanPreferencesKey("is_data_saved")

// Функция для сохранения данных
suspend fun saveData(context: Context, isSaved: Boolean) {
    context.dataStore.edit { prefs ->
        prefs[IS_DATA_SAVED] = isSaved
    }
}

// Функция для чтения данных
fun isDataSaved(context: Context): Flow <Boolean> {
    return context.dataStore.data.map { prefs ->
        prefs[IS_DATA_SAVED] ?: false
    }
}