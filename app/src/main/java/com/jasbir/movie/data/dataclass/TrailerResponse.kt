package com.jasbir.movie.data.dataclass

data class TrailerResponse(
    val id: Int,
    val results: List<Result>
){
    data class Result(
        val id: String,
        val iso_3166_1: String,
        val iso_639_1: String,
        val key: String,
        val name: String,
        val site: String,
        val size: Int,
        val type: String
    )
}