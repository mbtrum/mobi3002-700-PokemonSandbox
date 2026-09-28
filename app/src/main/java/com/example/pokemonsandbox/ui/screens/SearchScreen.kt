package com.example.pokemonsandbox.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pokemonsandbox.R
import com.example.pokemonsandbox.models.Pokemon

//
// Search a pokemon character
//

@Composable
fun SearchScreen()
{
    val pokemon =  Pokemon(
        name="Pikachu",
        resourceId = R.drawable.ditto,
        abilities = "limber, imposter"
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(pokemon.resourceId),
            contentDescription = pokemon.name
        )

        Text(text = pokemon.name,
            style = MaterialTheme.typography.displayLarge)

        Spacer(modifier = Modifier
            .height(10.dp))

        Text(text = "Abilities:",
            style = MaterialTheme.typography.titleLarge)

        Text(pokemon.abilities)
    }
}