package com.yoink.kotlin.pokemans.webapp.yoinkkotlinpokemanswebapp.controller

import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet

data class Pokemans(val id: Int, val name: String, val type: String)

var PokemansRowMapper: RowMapper<Pokemans> = RowMapper<Pokemans> { resultSet: ResultSet, rowIndex: Int ->
    Pokemans(
            resultSet.getInt("id"),
            resultSet.getString("name"),
            resultSet.getString("type"))
}