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

class BaliActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Madurai()
                }
            }
        }
    }
}

@Composable
fun Madurai() {
    Column(modifier = Modifier.background(color = Color.White)
        .padding(20.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = "Madurai",
        )
        Image(
            painterResource(id = R.drawable.meenakshi_temple), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival and Introduction to Madurai\n" +
                    "Morning:\n" +
                    "\n" +
                    "Arrive in Madurai (train, bus, or flight).\n" +
                    "Check-in to your hotel and relax after your journey.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Madurai Meenakshi Amman Temple: Start your exploration with a visit to the iconic Meenakshi Temple, one of India’s most famous and revered temples. Explore its stunning gopurams (towers), intricate carvings, and halls.\n" +
                    "Thousand Pillar Hall: Marvel at the exquisitely sculpted pillars that give the hall its name.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Night Aarti at Meenakshi Temple: Witness the grand evening prayer ceremony at the temple. The temple is beautifully illuminated at night.\n" +
                    "Dinner at a local South Indian restaurant to try traditional dishes like dosa, idli, or chettinad chicken.\n" +
                    "Day 2: Historical and Cultural Insights\n" +
                    "Morning:\n" +
                    "\n" +
                    "Thirumalai Nayakar Palace: Explore this grand Indo-Saracenic style palace built in the 17th century. The architecture is stunning, with large arches and grand courtyards.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Gandhi Memorial Museum: Visit the museum that honors the life and legacy of Mahatma Gandhi. It houses important relics and exhibits.\n" +
                    "Koodal Azhagar Temple: Visit this peaceful temple dedicated to Lord Vishnu, which is known for its intricate architecture.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Explore the bustling Madurai markets—a great place to shop for local crafts, textiles, and souvenirs like Madurai Sungudi sarees.\n" +
                    "Day 3: Temple Trails and Architecture\n" +
                    "Morning:\n" +
                    "\n" +
                    "Vandiyur Mariamman Teppakulam: This large water tank and temple complex is famous for its grand scale. You can take a peaceful walk around the tank or explore the nearby Mariamman Temple.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Alagar Koyil: Located about 20 km from Madurai, this temple is dedicated to Lord Vishnu. The temple is set amidst a scenic, hilly backdrop.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Meenakshi Temple at Sunset: Experience the temple from a different angle as the setting sun creates a magical atmosphere around the temple complex.\n" +
                    "Day 4: Day Trip to Surrounding Areas\n" +
                    "Morning:\n" +
                    "\n" +
                    "Tirupparankundram: Visit the Tirupparankundram Temple, an important pilgrimage site dedicated to Lord Murugan. It’s situated atop a hill and offers panoramic views of the surrounding areas.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Pazhamudircholai Murugan Temple: Another temple dedicated to Lord Murugan, it’s situated in a forested area and is known for its peaceful ambiance and serene surroundings.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Return to Madurai for a relaxed evening and dinner at a local restaurant.\n" +
                    "Day 5: Spiritual and Local Exploration\n" +
                    "Morning:\n" +
                    "\n" +
                    "Meenakshi Temple Museum: Delve deeper into the rich history of the temple and the city of Madurai through exhibits that include ancient sculptures, temple artifacts, and paintings.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Mariyappar Temple: This is a less crowded, beautiful temple in the city, perfect for a quiet spiritual experience.\n" +
                    "Explore Sree Vaigai Park for a leisurely afternoon amidst greenery.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Cultural Show: If available, attend a cultural performance such as classical dance (Bharatanatyam) or a local folk music concert, which is often held in Madurai's cultural centers.\n" +
                    "Day 6: Nature and Parks\n" +
                    "Morning:\n" +
                    "\n" +
                    "Meghamalai (High Wavy Mountains): Take a day trip to the hills around Madurai, located around 80 km from the city. It’s a beautiful hill station, known for its tea plantations, wildlife, and breathtaking views.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Enjoy a nature walk or visit the Meghamalai Wildlife Sanctuary, which is home to a variety of flora and fauna.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Return to Madurai and unwind at your hotel.\n" +
                    "Day 7: Leisure and Departure\n" +
                    "Morning:\n" +
                    "Visit the Tirumangalam Tank for a serene morning walk and enjoy the surrounding greenery.\n" +
                    "Afternoon:\n" +
                    "Free time for shopping or visiting any sights you missed earlier in your trip. You can also relax in the local cafes or parks.\n" +
                    "Evening:\n" +
                    "Departure or onward journey."
        )


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PrveiwOne(){
    Madurai()
}

