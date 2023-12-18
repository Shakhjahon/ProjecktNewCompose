package com.example.composedomdz.presettation.screens.details

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projecktnewcompose.presintation.theme.Purple

@SuppressLint("ComposableNaming")
@Composable
fun mainItemTwo() {
    var isClickListners by remember {
        mutableStateOf(false)
    }
    Row {
        Card(
            modifier = Modifier
                .shadow(elevation = 25.dp)
                .width(70.dp)
                .height(120.dp)
                .clickable {
                    isClickListners = !isClickListners
                }, colors = CardDefaults.cardColors(
                containerColor = if (isClickListners) Purple else Color.LightGray
            ), shape = RoundedCornerShape(size = 200.dp)

        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                text = "4",
                fontSize = 36.sp,
                lineHeight = 10.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "sat",
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(400),
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )
        }
        var second by remember {
            mutableStateOf(false)
        }
        Card(
            modifier = Modifier
                .padding(start = 15.dp)
                .shadow(elevation = 25.dp)
                .width(70.dp)
                .height(120.dp)
                .clickable {
                    second = !second
                }, shape = RoundedCornerShape(size = 200.dp), colors = CardDefaults.cardColors(
                containerColor = if (second) Purple else Color.LightGray
            )

        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                text = "5",
                fontSize = 36.sp,
                lineHeight = 10.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "sun",
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(400),
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )
        }
        var isClick by remember {
            mutableStateOf(false)
        }
        Card(
            modifier = Modifier
                .padding(start = 15.dp)
                .shadow(elevation = 25.dp)
                .width(70.dp)
                .height(120.dp)
                .clickable {
                    isClick = !isClick
                }, colors = CardDefaults.cardColors(
                containerColor = if (isClick) Purple else Color.LightGray
            ),
            shape = RoundedCornerShape(size = 200.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                text = "6",
                fontSize = 36.sp,
                lineHeight = 10.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "mon",
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(400),
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )
        }
        var isListners by remember {
            mutableStateOf(false)
        }
        Card(
            modifier = Modifier
                .padding(start = 15.dp)
                .shadow(elevation = 25.dp)
                .width(70.dp)
                .height(120.dp)
                .clickable {
                    isListners = !isListners
                },

            colors = CardDefaults.cardColors(
                containerColor = if (isListners) Purple else Color.LightGray
            ),
            shape = RoundedCornerShape(size = 200.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                text = "7",
                fontSize = 36.sp,
                lineHeight = 10.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "tue",
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(400),
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )
        }
    }
}