package com.example.thesimpson.models

import com.google.gson.annotations.SerializedName

class Personaje (
    @SerializedName("quote")
    val frase: String,
    @SerializedName("character")
    val  personaje : String,
    @SerializedName("image")
    val imagen : String,
    @SerializedName("characterDirection")
    val direccionpersonaje : String,
)
