package com.stepan.mytestwork

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.navigation.compose.rememberNavController
import com.stepan.mytestwork.ui.theme.MYGray
import com.stepan.mytestwork.ui.theme.MyTestWorkTheme
import com.stepan.mytestwork.ui.theme.StarColor
import com.stepan.mytestwork.ui.theme.TextBlue

@Composable
fun NomerItem(navController: NavController) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val (hotel, text2, card1, card2,
            card3, text4, text7, text6, row1, row2, row3,
            row4, row5, row6, row7, button) = createRefs()

        val topGuideline1 = createGuidelineFromTop(0.1f)
        val topGuideline2 = createGuidelineFromTop(0.2f)
        val bottomGuideline = createGuidelineFromBottom(0.3f)
        val startGuideline = createGuidelineFromStart(0.065f)


        Image(
            painter = painterResource(id = R.drawable.nomeritem),
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

        Text(text = "Стандартный с видом на бассейн\nили сад",
            fontSize = 22.sp, modifier = Modifier.constrainAs(text2) {
                top.linkTo(hotel.bottom, 12.5.dp)
                start.linkTo(hotel.start)
            })

        Box(modifier = Modifier.clip(RoundedCornerShape(5.dp))
            .background(color = MYGray).size(123.dp, 29.dp).constrainAs(card1) {
            top.linkTo(text2.bottom, 10.dp)
            start.linkTo(hotel.start)
        }, contentAlignment = Alignment.Center) {
        Text(text = "Все включено",
            fontSize = 16.sp, color = TextBlue)
        }

        Box(modifier = Modifier.clip(RoundedCornerShape(5.dp))
            .background(color = MYGray).size(123.dp, 29.dp).constrainAs(card2) {
            top.linkTo(text2.bottom, 10.dp)
            start.linkTo(card1.end, 12.dp)
        }, contentAlignment = Alignment.Center) {
        Text(text = "Все включено",
            fontSize = 16.sp, color = TextBlue)
        }

        Box(modifier = Modifier.clip(RoundedCornerShape(5.dp))
            .background(color = MYGray).size(123.dp, 29.dp).constrainAs(card3) {
            top.linkTo(card1.bottom, 10.dp)
            start.linkTo(hotel.start)
        }, contentAlignment = Alignment.Center) {
        Text(text = "Все включено",
            fontSize = 16.sp, color = TextBlue)
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.constrainAs(row2) {
                top.linkTo(card3.bottom, 20.dp)
                start.linkTo(hotel.start)

            }) {

            Text(
                text = "от 134 673 ₽",
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.width(7.dp))
            Text(
                text = "За 7 ночей с перелётом",
                fontWeight = FontWeight.W200,
                fontSize = 16.sp
            )
        }

        Button(
            onClick = { navController.navigate("Booking") },
            modifier =
            Modifier
                .height(48.dp)
                .fillMaxWidth(0.92f)
                .constrainAs(button) {
                    top.linkTo(row2.bottom, 15.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)

                },
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = TextBlue)
        ) {
            Text(text = "Выбрать номер", fontSize = 16.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(22.dp))

        Text(text = "")


    }
}

//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyTestWorkTheme {
//        NomerItem(navController = rememberNavController())
//    }
//}
