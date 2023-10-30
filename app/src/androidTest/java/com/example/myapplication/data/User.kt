package com.example.myapplication.data

data class User(
    val first_name:String,
    val last_name:String,
    val username:String,
    val password:String,
    val email:String,
    var balance:Double
){
    constructor():this("","","","","",0.0)
}
