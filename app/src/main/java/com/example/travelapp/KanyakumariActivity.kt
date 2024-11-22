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

class SingaporeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Kanyakumari()
                }
            }
        }
    }
}

@Composable
fun Kanyakumari() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = "Kanyakumari",
        )
        Image(
            painterResource(id = R.drawable.kanyakumari), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color = Color.Black,
            text = "Day 1: Arrival and Introduction to Kanyakumari\n" +
                    "Morning:\n" +
                    "\n" +
                    "Arrival in Kanyakumari: Check into your hotel, freshen up, and relax after your journey. The town is well-connected by road, rail, and air.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Kanyakumari Temple: Start your exploration with a visit to the Kanyakumari Temple, dedicated to Goddess Kanyakumari, believed to be an incarnation of Parvati. This temple is one of the holiest sites in India.\n" +
                    "Gandhi Memorial: After the temple, visit the Gandhi Memorial built in honor of Mahatma Gandhi. It is here that the ashes of Gandhi were kept before immersion in the sea. The unique design of the memorial allows sunlight to fall on the exact spot where Gandhi’s urn was kept on his birthday (October 2nd).\n" +
                    "Evening:\n" +
                    "\n" +
                    "Vivekananda Rock Memorial: Take a ferry ride to Vivekananda Rock Memorial, which is dedicated to Swami Vivekananda. You can spend time meditating or simply enjoy the panoramic views of the ocean and the confluence of the three seas—the Arabian Sea, Bay of Bengal, and the Indian Ocean.\n" +
                    "Sunset at Kanyakumari: The sunset at the tip of India, where the three seas meet, is a mesmerizing sight. Make sure to get a good spot along the beach for this iconic view.\n" +
                    "Day 2: Spiritual and Cultural Exploration\n" +
                    "Morning:\n" +
                    "\n" +
                    "Thiruvalluvar Statue: Visit the towering Thiruvalluvar Statue (133 feet tall), dedicated to the famous Tamil poet and philosopher Thiruvalluvar. Located on an island near the Vivekananda Memorial, this statue is one of the largest of its kind in India.\n" +
                    "Vivekananda Memorial: If you missed it the previous day, spend some time at the memorial and learn more about Swami Vivekananda’s life and philosophy. The memorial also has a meditation hall.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Suchindram Temple: Head to Suchindram (about 13 km from Kanyakumari). This ancient temple is dedicated to Trimurti (Brahma, Vishnu, and Shiva) and features incredible sculptures and musical pillars that are renowned for their acoustics.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Visit the Kanyakumari Beach: After a day of sightseeing, take a stroll along the Kanyakumari Beach. Relax, enjoy the gentle waves, and explore the local handicraft shops.\n" +
                    "Day 3: Day Trip to Surrounding Areas\n" +
                    "Morning:\n" +
                    "\n" +
                    "Vattakottai Fort: Visit the Vattakottai Fort, located about 6 km from Kanyakumari. This coastal fort offers great views of the sea and is surrounded by lush greenery. It’s an ideal spot for a walk or a picnic.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Sothavilai Beach: Head to Sothavilai Beach, located around 10 km from Kanyakumari. It’s a peaceful and less crowded beach compared to the main town beach, perfect for relaxing by the sea.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Dinner at a Local Restaurant: Enjoy a meal at one of Kanyakumari’s restaurants. Seafood is fresh here, so don't miss out on local dishes like Fish Curry or Meen Kozhambu (fish cooked in traditional spices).\n" +
                    "Day 4: Nature and Adventure\n" +
                    "Morning:\n" +
                    "\n" +
                    "Padmanabhapuram Palace: Take a day trip to Padmanabhapuram Palace, located about 40 km from Kanyakumari in the nearby town of Padmanabhapuram. This ancient wooden palace was the seat of the Travancore kings and is a great example of traditional Kerala architecture.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Explore the Palace Grounds: Visit the surrounding palace gardens and learn about the history of the Travancore dynasty. You can also see ancient weapons, royal thrones, and beautiful frescoes.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Visit the Butterfly Sanctuary: On your return to Kanyakumari, stop by the Kanyakumari Butterfly Sanctuary near the village of Koodal. The sanctuary is home to various species of butterflies, making it a serene spot for nature lovers.\n" +
                    "Day 5: Pilgrimage and Spiritual Exploration\n" +
                    "Morning:\n" +
                    "\n" +
                    "Nagercoil Temple: Visit Nagercoil, about 20 km from Kanyakumari. The Nagercoil Temple is dedicated to Sri Naga Raja (the King of Snakes) and is famous for its tranquil setting amidst nature.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Muttom Beach: On the way back, stop at Muttom Beach, a secluded, peaceful beach perfect for relaxation. You can take a leisurely walk along the shoreline and enjoy the solitude.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Sunset at Kanyakumari: If you didn’t get a chance to see the sunset on the first day, you can take another opportunity to experience this breathtaking natural phenomenon. The view of the sun setting over the confluence of three oceans is unforgettable.\n" +
                    "Day 6: Local Life and Culture\n" +
                    "Morning:\n" +
                    "\n" +
                    "Visit the Kanyakumari Local Markets: Spend the morning exploring the vibrant local markets in Kanyakumari. You can shop for souvenirs like shell jewelry, Tanjore paintings, and wooden carvings.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Kanyakumari District Museum: Head to the Kanyakumari District Museum, where you can learn more about the history, culture, and anthropology of the region. It has an interesting collection of artifacts, including local handicrafts and ancient relics.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Attend an Evening Cultural Performance: Check if there are any local cultural performances happening in the evening. Many places offer classical dance (like Bharatanatyam) or traditional music performances that showcase Tamil culture.\n" +
                    "Day 7: Relaxation and Leisure\n" +
                    "Morning:\n" +
                    "\n" +
                    "Visit the Sunset Viewpoint: Begin your last day in Kanyakumari by visiting the Sunset Viewpoint (around Vivekananda Rock Memorial). This is a great place for some quiet reflection and to absorb the beauty of the surrounding landscape.\n" +
                    "Afternoon:\n" +
                    "\n" +
                    "Relax at Kanyakumari Beach: Spend the afternoon relaxing by the beach, taking a dip in the calm waters or simply walking along the shore. There are plenty of beachside cafes where you can sip on fresh coconut water or enjoy a cool drink.\n" +
                    "Evening:\n" +
                    "\n" +
                    "Farewell Dinner: For your last evening in Kanyakumari, enjoy a leisurely dinner at a local restaurant or beachside café. Try Kanyakumari-style seafood like Grilled Fish, Fish Fry, or Meen Moilee (a mild coconut milk-based fish curry)."
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showPreviewPlace(){
    Kanyakumari()
}

