package com.stepan.mytestwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
//import com.example.mymemeapp.data.remote.ApiInterface
//import com.example.mymemeapp.di.AppModule
//import com.stepan.mytestwork.model.hotel.hotelscreen
import com.stepan.mytestwork.ui.theme.MyTestWorkTheme
import com.stepan.mytestwork.ui.theme.StarColor
import com.stepan.mytestwork.ui.theme.TextBlue
import com.stepan.mytestwork.ui.theme.TextStarColor


class MainActivity : ComponentActivity() {


    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            MyTestWorkTheme {


                var navController = rememberNavController()

                NavHost(navController = navController, startDestination = "Hotel") {

                    composable(route = "Hotel") {
                        Hotel(navController = navController)
                    }
                    composable(route = "Nomer") {
                        NomerItem(navController = navController)
                    }
                    composable(route = "Booking") {
                        Booking(navController = navController)
                    }

            }



//                val hotels = remember { mutableStateOf<List<hotelscreen>>(emptyList()) }
//
//                LaunchedEffect(Unit) {
//                    val hotelsResult = AppModule.provideApiInterface(AppModule.baseUrl())
//                    hotels.value = hotelsResult
//                }


            }
        }
    }

}

@Composable
fun Hotel(navController: NavController) {



    ConstraintLayout(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
        val (hotel, bg, text2, text3,
            text4, text7, text6, row1, row2, row3, row4,
            row5, row6, row7, dots1, button) = createRefs()



            Text(text = "jjj", fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.constrainAs(text3) {
                    top.linkTo(parent.top, 25.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })


            Image(
                painter = painterResource(id = R.drawable.hotel),
                contentDescription = "logo",
                modifier = Modifier
                    .size(374.dp, 278.dp)
                    .clip(RoundedCornerShape(1.dp))
                    .constrainAs(hotel) {
                        top.linkTo(parent.top, 65.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .size(152.dp, 29.dp)
                .clip(
                    RoundedCornerShape(5.dp)
                )
                .background(color = StarColor)
                .constrainAs(row1) {
                    top.linkTo(hotel.bottom, 20.dp)
                    start.linkTo(hotel.start)

                }) {
                Spacer(modifier = Modifier.width(7.dp))
                Image(
                    painter = painterResource(id = R.drawable.star22),
                    modifier = Modifier.size(15.dp, 15.dp),
                    contentDescription = "star"
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "5 Превосходно",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = TextStarColor
                )
            }


            Text(text = "Steigenberger Makadi",
                fontSize = 22.sp, modifier = Modifier.constrainAs(text2) {
                    top.linkTo(row1.bottom, 12.5.dp)
                    start.linkTo(hotel.start)
                })

            Text(text = "Madinat Makadi, Safaga Road, Makadi Bay, Египет",
                fontSize = 14.sp, color = TextBlue, modifier = Modifier.constrainAs(text4) {
                    top.linkTo(text2.bottom, 10.dp)
                    start.linkTo(hotel.start)
                })

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.constrainAs(row2) {
                    top.linkTo(text4.bottom, 20.dp)
                    start.linkTo(hotel.start)

                }) {

                Text(
                    text = "от 134 673 ₽",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 30.sp
                )
                Spacer(modifier = Modifier.width(7.dp))
                Text(
                    text = "за тур с перелётом",
                    fontWeight = FontWeight.W200,
                    fontSize = 16.sp
                )
            }

            Text(text = "Об отеле",
                fontSize = 22.sp, modifier = Modifier.constrainAs(text6) {
                    top.linkTo(row2.bottom, 25.dp)
                    start.linkTo(hotel.start)
                })

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.constrainAs(row3) {
                    top.linkTo(text6.bottom, 20.dp)
                    start.linkTo(hotel.start, 12.dp)

                }) {

                Text(text = "3-я линия", fontWeight = FontWeight.W200, fontSize = 16.sp)
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Платный Wi-Fi в фойе",
                    fontWeight = FontWeight.W200,
                    fontSize = 16.sp
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.constrainAs(row4) {
                    top.linkTo(row3.bottom, 20.dp)
                    start.linkTo(hotel.start, 12.dp)

                }) {

                Text(
                    text = "30 км до аэропорта",
                    fontWeight = FontWeight.W200,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(7.dp))
                Text(text = "1 км до пляжа", fontWeight = FontWeight.W200, fontSize = 16.sp)
            }
            Text(text = "Отель VIP-класса с собственными гольф\nполями." +
                    "Высокий уровнь сервиса.Рекомендуем\n" +
                    "для респектабельного отдыха." +
                    " Отель\nпринимает гостей от 18 лет!",
                fontSize = 16.sp, modifier = Modifier.constrainAs(text7) {
                    top.linkTo(row4.bottom, 23.dp)
                    start.linkTo(hotel.start)
                })

            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .constrainAs(row5) {
                    top.linkTo(text7.bottom, 20.dp)
                    start.linkTo(hotel.start)

                }) {

                Image(
                    painter = painterResource(id = R.drawable.emojihappy),
                    contentDescription = "star",
                    Modifier.size(24.dp, 24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column() {
                    Text(text = "Удобства", fontWeight = FontWeight.W300, fontSize = 16.sp)
                    Text(
                        text = "Самое необходимое",
                        fontWeight = FontWeight.W200,
                        fontSize = 16.sp
                    )
                }
                Spacer(modifier = Modifier.width(144.dp))
                Image(
                    painter = painterResource(id = R.drawable.strelo4ka),
                    contentDescription = "star",
                    Modifier.size(24.dp, 24.dp)
                )


            }


            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .constrainAs(row6) {
                    top.linkTo(row5.bottom, 20.dp)
                    start.linkTo(hotel.start)

                }) {

                Image(
                    painter = painterResource(id = R.drawable.emojihappy),
                    contentDescription = "star",
                    Modifier.size(24.dp, 24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column() {
                    Text(text = "Удобства", fontWeight = FontWeight.W300, fontSize = 16.sp)
                    Text(
                        text = "Самое необходимое",
                        fontWeight = FontWeight.W200,
                        fontSize = 16.sp
                    )
                }
                Spacer(modifier = Modifier.width(144.dp))
                Image(
                    painter = painterResource(id = R.drawable.strelo4ka),
                    contentDescription = "star",
                    Modifier.size(24.dp, 24.dp)
                )


            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .constrainAs(row7) {
                    top.linkTo(row6.bottom, 20.dp)
                    start.linkTo(hotel.start)

                }) {

                Image(
                    painter = painterResource(id = R.drawable.emojihappy),
                    contentDescription = "star",
                    Modifier.size(24.dp, 24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column() {
                    Text(text = "Удобства", fontWeight = FontWeight.W300, fontSize = 16.sp)
                    Text(
                        text = "Самое необходимое",
                        fontWeight = FontWeight.W200,
                        fontSize = 16.sp
                    )
                }
                Spacer(modifier = Modifier.width(144.dp))
                Image(
                    painter = painterResource(id = R.drawable.strelo4ka),
                    contentDescription = "star",
                    Modifier.size(24.dp, 24.dp)
                )


            }

            Button(
                onClick = { navController.navigate("Nomer") },
                modifier =
                Modifier
                    .height(48.dp)
                    .fillMaxWidth(0.92f)
                    .constrainAs(button) {
                        top.linkTo(row7.bottom, 55.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)

                    },
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = TextBlue)
            ) {
                Text(text = "К выбору номера", fontSize = 16.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.height(22.dp))

            Text(text = "")


        }
}






@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyTestWorkTheme {
//
//        val hotels = remember { mutableStateOf<List<hotelscreen>>(emptyList()) }
//
//        LaunchedEffect(Unit) {
//            val hotelsResult = AppModule.provideApiInterface(AppModule.baseUrl())
//            hotels.value = hotelsResult
//        }

        Hotel(navController = rememberNavController())
    }
}


