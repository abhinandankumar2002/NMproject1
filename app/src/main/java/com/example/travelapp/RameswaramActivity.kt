package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class ParisActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Rameswaram()
                }
            }
        }
    }
}

@Composable
fun Rameswaram() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = "Rameswaram",
        )
        Image(
            painterResource(id = R.drawable.rameshwaram), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival and Initial Exploration\n" +
                    "Morning:\n" +
                    "Arrive in Rameswaram (train or bus) and check into your hotel.\n" +
                    "Afternoon:\n" +
                    "Ramanathaswamy Temple: Visit this sacred temple dedicated to Lord Shiva. Explore the grand corridors and the 22 holy wells. The temple is one of the 12 Jyotirlingas and is a must-see.\n" +
                    "Evening:\n" +
                    "Agni Theertham: Take a holy dip in the sea at Agni Theertham, located near the temple. It’s a ritual for pilgrims before they enter the temple.\n" +
                    "Day 2: Exploring the Town\n" +
                    "Morning:\n" +
                    "Dhanushkodi: Visit the ghost town of Dhanushkodi, which was destroyed in the 1964 cyclone. It’s a hauntingly beautiful place to explore ruins and enjoy the pristine beach.\n" +
                    "Afternoon:\n" +
                    "Pamban Bridge: Visit this iconic bridge that connects Rameswaram to the mainland. The bridge offers spectacular views of the sea and is a popular spot for photos.\n" +
                    "Evening:\n" +
                    "Enjoy a quiet walk at Rameswaram Beach, soaking in the peaceful surroundings.\n" +
                    "Day 3: Spiritual Sites\n" +
                    "Morning:\n" +
                    "Gandhamadhana Parvatham: Visit this hilltop temple dedicated to Lord Rama. The location offers panoramic views of Rameswaram and the sea.\n" +
                    "Afternoon:\n" +
                    "Kothandaramaswamy Temple: This ancient temple is located near Dhanushkodi and offers a serene experience amidst nature and the sea.\n" +
                    "Evening:\n" +
                    "Sunset at Dhanushkodi: Witness a stunning sunset at the edge of the island, where the ocean meets the sky.\n" +
                    "Day 4: Day Trip to Surrounding Areas\n" +
                    "Morning:\n" +
                    "\n" +
                    "Visit Ramanathapuram, a small town near Rameswaram known for its temples, including Sri Azhagiya Nambi Temple and Kothandaramaswamy Temple.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Explore Rameswaram Sea Shore and relax by the beach.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Return to Rameswaram and enjoy dinner by the beach.\n" +
                    "Day 5: Nature and Wildlife\n" +
                    "Morning:\n" +
                    "\n" +
                    "Visit the Rameswaram Bird Sanctuary and enjoy birdwatching. The sanctuary is home to a variety of migratory birds, particularly during the winter months.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Visit the Sethu Karai area, a peaceful beach that is less crowded and offers a great opportunity to relax and swim.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Evening prayers at the Ramanathaswamy Temple.\n" +
                    "Day 6: Adventure and Exploration\n" +
                    "Morning:\n" +
                    "\n" +
                    "Scuba Diving: For adventure enthusiasts, take a scuba diving trip around Rameswaram’s waters to explore coral reefs and marine life.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Visit the Dhanushkodi Beach again for a relaxing afternoon.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Visit the local temple markets to buy souvenirs such as Rameswaram handicrafts, Pooja items, and sea shells.\n" +
                    "Day 7: Leisure and Departure\n" +
                    "Morning:\n" +
                    "Enjoy a relaxed breakfast and visit any temples or spots you might have missed.\n" +
                    "Afternoon:\n" +
                    "Free time for shopping and leisure before departure.\n" +
                    "Evening:\n" +
                    "Departure or onward journey.\n"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PrviewPlace2(){
    Rameswaram();
}
