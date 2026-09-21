package com.example.pokemonsandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.example.pokemonsandbox.ui.screens.AllPokemon

import com.example.pokemonsandbox.ui.screens.SearchPokemon
import com.example.pokemonsandbox.ui.theme.PokemonSandboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokemonSandboxTheme {
                Scaffold() { innerPadding ->

                    //SearchPokemon(innerPadding)

                    AllPokemon(innerPadding)

                }
            }
        }
    }
}

