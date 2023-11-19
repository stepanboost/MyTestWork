package com.stepan.mytestwork

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.navigation.compose.rememberNavController
import com.stepan.mytestwork.ui.theme.Bluesm
import com.stepan.mytestwork.ui.theme.GrayBut
import com.stepan.mytestwork.ui.theme.MYGray
import com.stepan.mytestwork.ui.theme.MyTestWorkTheme
import com.stepan.mytestwork.ui.theme.StarColor
import com.stepan.mytestwork.ui.theme.TextBlue
import com.stepan.mytestwork.ui.theme.TextGray
import com.stepan.mytestwork.ui.theme.TextStarColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Booking(navController: NavController, ) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        val (hotel, text2, card1, card2,
            text3, text4, text5, row1, col2, col3,
            textfil1, textfil2, row5) = createRefs()



        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .size(152.dp, 29.dp)
            .clip(
                RoundedCornerShape(5.dp)
            )
            .background(color = StarColor)
            .constrainAs(row1) {
                top.linkTo(hotel.bottom, 20.dp)
                start.linkTo(parent.start, 15.dp)

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
                start.linkTo(row1.start)
            })

        Text(text = "Madinat Makadi, Safaga Road, Makadi Bay, Египет",
            fontSize = 14.sp, color = TextBlue, modifier = Modifier.constrainAs(text4) {
                top.linkTo(text2.bottom, 10.dp)
                start.linkTo(row1.start)
            })


        Column(modifier = Modifier.constrainAs(col2) {
            top.linkTo(text4.bottom, 20.dp)
            start.linkTo(row1.start)
        }, verticalArrangement = Arrangement.Center) {
            Text(text = "Вылет из", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Страна, город", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Даты", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Кол-во ночей", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Отель", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Номер", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Питание", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))

        }

        Column(modifier = Modifier.constrainAs(col3) {
            top.linkTo(text4.bottom, 20.dp)
            start.linkTo(col2.end, 75.dp)
        }, verticalArrangement = Arrangement.Center) {
            Text(text = "Вылет из", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Страна, город", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Даты", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Кол-во ночей", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Отель", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Номер", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Питание", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))

        }
        Text(text = "Информация о покупателе",
            fontSize = 22.sp, modifier = Modifier.constrainAs(text3) {
                top.linkTo(col3.bottom, 12.5.dp)
                start.linkTo(row1.start)
            })

        var text11 by remember { mutableStateOf("+7 (951) 55-99-00") }



        TextField(
            modifier = Modifier
                .constrainAs(textfil1) {
                    top.linkTo(text3.bottom, 20.dp)
                    start.linkTo(row1.start)
                }
                .border(3.dp, Color.White, RoundedCornerShape(0.01.dp)),
            value = text11,
            onValueChange = { text11 = it },
            label = { Text("Номер телефона") },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
        )

        var text22 by remember { mutableStateOf("examplemail.000@mail.ru") }



        TextField(
            modifier = Modifier
                .constrainAs(textfil2) {
                    top.linkTo(textfil1.bottom, 20.dp)
                    start.linkTo(row1.start)
                }
                .border(3.dp, Color.White, RoundedCornerShape(0.01.dp)),
            value = text22,
            onValueChange = { text22 = it },
            label = { Text("Почта") },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
        )

        Text(text = "Эти данные никому не передаются.После оплаты мы\nвышли чек на указанный вами номер и почту",
            fontSize = 14.sp, color = TextGray, modifier = Modifier.constrainAs(text5) {
                top.linkTo(textfil2.bottom, 12.5.dp)
                start.linkTo(row1.start)
            })



    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toorist(modifier: Modifier) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val ( text2,
            butt, col2, col3,row2, row3,
            textfil1, textfil2, textfil3, textfil4,textfil5,textfil6) = createRefs()





        Text(text = "Первый турист",
            fontSize = 22.sp, modifier = Modifier.constrainAs(text2) {
                top.linkTo(parent.top, 12.5.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)

            })





        var text11 by remember { mutableStateOf("+7 (951) 55-99-00") }



        TextField(
            modifier = Modifier
                .constrainAs(textfil1) {
                    top.linkTo(text2.bottom, 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(343.dp, 52.dp)
                .border(3.dp, GrayBut, RoundedCornerShape(0.01.dp)),
            value = text11,
            onValueChange = { text11 = it },
            label = { Text("") },
            colors = TextFieldDefaults.textFieldColors(containerColor = GrayBut),
        )

        var text22 by remember { mutableStateOf("examplemail.000@mail.ru") }



        TextField(
            modifier = Modifier
                .constrainAs(textfil2) {
                    top.linkTo(textfil1.bottom, 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(343.dp, 52.dp)
                .border(3.dp, GrayBut, RoundedCornerShape(0.01.dp)),
            value = text22,
            onValueChange = { text22 = it },
            label = { Text("Почта") },
            colors = TextFieldDefaults.textFieldColors(containerColor = GrayBut),
        )
        var text33 by remember { mutableStateOf("examplemail.000@mail.ru") }



        TextField(
            modifier = Modifier
                .constrainAs(textfil3) {
                    top.linkTo(textfil2.bottom, 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(343.dp, 52.dp)
                .border(3.dp, GrayBut, RoundedCornerShape(0.01.dp)),
            value = text33,
            onValueChange = { text33 = it },
            label = { Text("Почта") },
            colors = TextFieldDefaults.textFieldColors(containerColor = GrayBut),
        )
         var text44 by remember { mutableStateOf("examplemail.000@mail.ru") }



        TextField(
            modifier = Modifier
                .constrainAs(textfil4) {
                    top.linkTo(textfil3.bottom, 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(343.dp, 52.dp)
                .border(3.dp, GrayBut, RoundedCornerShape(0.01.dp)),
            value = text44,
            onValueChange = { text44 = it },
            label = { Text("Почта") },
            colors = TextFieldDefaults.textFieldColors(containerColor = GrayBut),
        )
        var text55 by remember { mutableStateOf("examplemail.000@mail.ru") }



        TextField(
            modifier = Modifier
                .constrainAs(textfil5) {
                    top.linkTo(textfil4.bottom, 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(343.dp, 52.dp)
                .border(3.dp, GrayBut, RoundedCornerShape(0.01.dp)),
            value = text55,
            onValueChange = { text55 = it },
            label = { Text("Почта") },
            colors = TextFieldDefaults.textFieldColors(containerColor = GrayBut),
        )

var text66 by remember { mutableStateOf("examplemail.000@mail.ru") }



        TextField(
            modifier = Modifier
                .constrainAs(textfil6) {
                    top.linkTo(textfil5.bottom, 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(343.dp, 52.dp)
                .border(3.dp, GrayBut, RoundedCornerShape(0.01.dp)),
            value = text66,
            onValueChange = { text55 = it },
            label = { Text("Почта") },
            colors = TextFieldDefaults.textFieldColors(containerColor = GrayBut),
        )



        Row(modifier = Modifier.constrainAs(row2){
            top.linkTo(textfil6.bottom, 20.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }, horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Второй турист", fontSize = 22.sp, fontWeight = FontWeight.W500)
            Spacer(modifier = Modifier.width(140.dp))
            Box(modifier = Modifier
                .size(32.dp, 32.dp)
                .clip(RoundedCornerShape(6.dp))
                .background(
                    Bluesm
                ), contentAlignment = Alignment.Center) {

                    Image(
                        painter = painterResource(id = R.drawable.strelka3),
                        contentDescription = "str",
                        modifier = Modifier.size(14.dp, 14.dp)
                    )

            }

        }
        Row(modifier = Modifier.constrainAs(row3){
            top.linkTo(row2.bottom, 20.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }, horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Добавить туриста", fontSize = 22.sp, fontWeight = FontWeight.W500)
            Spacer(modifier = Modifier.width(100.dp))

                Image(
                    painter = painterResource(id = R.drawable.plas),
                    contentDescription = "str2",
                    modifier = Modifier.size(32.dp, 32.dp)
                )

        }

        Column(modifier = Modifier.constrainAs(col2){
            top.linkTo(row3.bottom, 30.dp)
            start.linkTo(row2.start)
        }, verticalArrangement = Arrangement.Center) {
            Text(text = "Тур", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Топливный сбор", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Сервисный сбор", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "К оплате", color = TextGray)
            Spacer(modifier = Modifier.height(15.dp))


        }

        Column(modifier = Modifier.constrainAs(col3){
            top.linkTo(row3.bottom, 20.dp)
            start.linkTo(col2.end, 75.dp)
        }, verticalArrangement = Arrangement.Center) {
            Text(text = "Вылет из", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Страна, город",fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Даты", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Кол-во ночей", fontSize = 16.sp, color = TextBlue)


        }
        Button(
            onClick = { /*TODO*/ },
            modifier =
            Modifier
                .height(48.dp)
                .fillMaxWidth(0.92f)
                .constrainAs(butt) {
                    top.linkTo(col2.bottom, 30.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)

                },
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = TextBlue)
        ) {
            Text(text = "Оплатить .....", fontSize = 16.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(22.dp))

        Text(text = "")








    }
}


//
//
//
//
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyTestWorkTheme {
//        Toorist(navController = rememberNavController())
//    }
//}
//
