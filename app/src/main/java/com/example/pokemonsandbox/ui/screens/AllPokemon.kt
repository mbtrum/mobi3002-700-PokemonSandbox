package com.example.pokemonsandbox.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.pokemonsandbox.R
import com.example.pokemonsandbox.models.Pokemon

//
// Display a list of Pokemon characters
//

@Composable
fun AllPokemon(innerPadding: PaddingValues){

    // Create a static list of Pokemon characters
    val pokemonList = listOf(
        Pokemon(
            name="Pikachu",
            resourceId = R.drawable.pikachu),
        Pokemon(
            name="Bulbasaur",
            resourceId = R.drawable.bulbasaur),
        Pokemon(
            name="Spheal",
            resourceId = R.drawable.spheal)
    )

    LazyColumn(
        modifier = Modifier.padding(innerPadding)
    ) {
        items(pokemonList) { pokemon ->
            Image(
                painter = painterResource(id = pokemon.resourceId),
                contentDescription = pokemon.name
            )

            Text(pokemon.name)
        }
    }
}