package com.example.ticket.Data.Shedule

import com.example.data.Shift
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.io.IOException
fun getMyScheduleDaddy() : List<Shift> {
    val file: File = File("""C:\Users\ismae\IdeaProjects\ColorfulApi\src\main\resources\static\file.json""")
    val typeToken = object : TypeToken<List<Shift>>() {}.type
    val gson = Gson()
    val jsonString = gson.fromJson<List<Shift>>(file.readText(Charsets.UTF_8),typeToken)
    return jsonString

    }
