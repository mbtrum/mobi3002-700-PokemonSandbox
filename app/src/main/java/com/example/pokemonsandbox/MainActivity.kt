package com.example.pokemonsandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pokemonsandbox.ui.theme.PokemonSandboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokemonSandboxTheme {
                ProfileCard()
                //Counter()
                //LazyFood()
            }
        }
    }
}


@Composable
fun LazyFood() {
    val foods = listOf(
        "Eggs", "Milk", "Bread", "Butter", "Cheese", "Yogurt", "Chicken", "Beef",
        "Pork", "Bacon", "Sausage", "Turkey", "Salmon", "Tuna", "Shrimp", "Rice",
        "Pasta", "Quinoa", "Oats", "Cereal", "Flour", "Sugar", "Salt", "Pepper",
        "Olive Oil", "Vegetable Oil", "Butter", "Honey", "Maple Syrup", "Peanut Butter",
        "Jam", "Ketchup", "Mustard", "Mayonnaise", "Soy Sauce", "Vinegar", "Garlic",
        "Onion", "Tomato", "Potato", "Carrot", "Broccoli", "Spinach", "Lettuce",
        "Cucumber", "Bell Pepper", "Zucchini", "Mushroom", "Corn", "Peas", "Green Beans",
        "Cabbage", "Cauliflower", "Sweet Potato", "Avocado", "Lemon", "Lime", "Apple",
        "Banana", "Orange", "Grapes", "Strawberries", "Blueberries", "Raspberries",
        "Watermelon", "Pineapple", "Mango", "Peach", "Pear", "Cherries", "Kiwi",
        "Almonds", "Walnuts", "Cashews", "Peanuts", "Pistachios", "Sunflower Seeds",
        "Chia Seeds", "Beans", "Lentils", "Chickpeas", "Tofu", "Coconut Milk",
        "Chocolate", "Coffee", "Tea", "Juice", "Soda", "Water", "Wine", "Beer",
        "Crackers", "Chips", "Popcorn", "Granola", "Ice Cream", "Pizza", "Soup",
        "Salsa", "Hot Sauce"
    )

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    )
    {
        items(foods) { food ->
            Text(food)
        }
    }

}

@Composable
fun Counter() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
            .background(color=Color.Blue)
    ) {
        for (count in 1..100) {
            Text("Count: $count")
        }
    }
}

@Composable
fun ProfileCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Row(){
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(10.dp))  // horizontal width

            Column(
                modifier = Modifier
                    //.fillMaxSize()
                    .background(color=Color.Blue)
            )
            {
                Text("Mike Trumbull")
                Text("Instructor NSCC")
            }

        }


    }

}
