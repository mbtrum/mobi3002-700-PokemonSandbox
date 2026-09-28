package com.example.pokemonsandbox.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pokemonsandbox.R
import com.example.pokemonsandbox.models.Pokemon

//
// Display a list of Pokemon characters
//

@Composable
fun FavoritesScreen(){

    // Create a static list of Pokemon characters
    val pokemonList = listOf(
        Pokemon(
            name="Pikachu",
            resourceId = R.drawable.pikachu,
            abilities="static, lighting-rod"),
        Pokemon(
            name="Bulbasaur",
            resourceId = R.drawable.bulbasaur,
            abilities="overgrow, chlorophyll"),
        Pokemon(
            name="Spheal",
            resourceId = R.drawable.spheal,
            abilities="thick-fat, ice-body ")
    )

    LazyColumn() {
        items(pokemonList) { pokemon ->

            Row(modifier = Modifier.padding(25.dp)) {
                Image(
                    painter = painterResource(id = pokemon.resourceId),
                    contentDescription = pokemon.name,
                    modifier = Modifier.size(80.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column() {
                    Text(pokemon.name,
                        style = MaterialTheme.typography.headlineSmall)

                    Text(pokemon.abilities,
                        style = MaterialTheme.typography.bodyLarge)
                }

            }

            HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        }
    }
}