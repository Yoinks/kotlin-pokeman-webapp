package com.yoink.kotlin.pokemans.webapp.yoinkkotlinpokemanswebapp.controller

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.ResultSet

@RestController
class PokemanController (val jdbcTemplate: JdbcTemplate) {

    var PokemansRowMapper: RowMapper<Pokemans> = RowMapper<Pokemans> { resultSet: ResultSet, rowIndex: Int ->
        Pokemans(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("type"))
    }

    @GetMapping("/pokemans")
    fun getPokemans() = jdbcTemplate.query("SELECT * FROM pokeman", PokemansRowMapper)

}