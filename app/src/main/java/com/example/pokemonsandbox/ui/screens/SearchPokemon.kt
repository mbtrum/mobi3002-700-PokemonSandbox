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

//
// Search a pokemon character
//

@Composable
fun SearchPokemon(innerPadding: PaddingValues)
{
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ){
        Image(
            painter = painterResource(R.drawable.ditto),
            contentDescription = "Ditto"
        )

        Text(text = "Ditto",
            style = MaterialTheme.typography.displayLarge)

        Spacer(modifier = Modifier
            .height(10.dp))

        //HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        Text(text = "Abilities:",
            style = MaterialTheme.typography.titleLarge)

        Text("limber, imposter")
    }
}