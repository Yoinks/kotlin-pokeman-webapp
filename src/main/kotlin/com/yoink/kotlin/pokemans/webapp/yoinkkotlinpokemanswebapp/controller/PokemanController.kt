package com.yoink.kotlin.pokemans.webapp.yoinkkotlinpokemanswebapp.controller

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PokemanController (val jdbcTemplate: JdbcTemplate) {

    @GetMapping("/pokemans")
    fun getPokemans() = jdbcTemplate.query("SELECT * FROM pokeman", PokemansRowMapper)

}