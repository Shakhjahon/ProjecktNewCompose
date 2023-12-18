package com.example.projecktnewcompose.presintation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projecktnewcompose.presintation.theme.Blue
import com.example.projecktnewcompose.presintation.theme.LightBlue
import com.example.projecktnewcompose.presintation.theme.LightGreen
import com.example.projecktnewcompose.presintation.theme.LightPurple
import com.example.projecktnewcompose.presintation.theme.Orang
import com.example.projecktnewcompose.presintation.theme.Purple
import com.example.projecktnewcompose.presintation.theme.lue

@Composable
fun MainItem() {
    Row {
        Column {
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(164.dp)
                    .height(150.dp),
                colors = CardDefaults.cardColors(
                    containerColor = LightGreen
                )

            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    text = "22",
                    fontSize = 36.sp,
                    lineHeight = 10.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    text = "Done",
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight(400),
                    textAlign = TextAlign.Center,
                )
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(164.dp)
                    .height(110.dp),
                colors = CardDefaults.cardColors(
                    containerColor = LightPurple
                )

            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    text = "12",
                    fontSize = 36.sp,
                    lineHeight = 10.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp),
                    text = "Ongoing",
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight(400),
                    textAlign = TextAlign.Center,
                )
            }

        }
        Column {
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(164.dp)
                    .height(110.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Orang
                )
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    text = "7",
                    fontSize = 36.sp,
                    lineHeight = 10.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp),
                    text = "In Progress",
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight(400),
                    textAlign = TextAlign.Center,
                )
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(164.dp)
                    .height(150.dp),
                colors = CardDefaults.cardColors(
                    containerColor = lue

                )

            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    text = "14",
                    fontSize = 36.sp,
                    lineHeight = 10.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    text = "Waiting For Review",
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight(400),
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}