package com.example.projecktnewcompose.presintation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projecktnewcompose.R
import com.example.projecktnewcompose.presintation.theme.Blue
import com.example.projecktnewcompose.presintation.theme.LightPurple
import com.example.projecktnewcompose.presintation.theme.Orang
import com.example.projecktnewcompose.presintation.theme.Purple

@Preview
@Composable
fun MainItemThird() {
    Column {

        Card(
            modifier = Modifier
                .width(256.dp)
                .height(93.dp)
                .padding(top = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Orang
            )
        ) {
            Text(
                modifier = Modifier.padding(top = 10.dp, start = 12.dp),
                text = stringResource(R.string.Information_Architecture),
                fontSize = 16.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(700),
                color = Color.White,
            )
            Text(
                modifier = Modifier.padding(start = 12.dp),
                text = stringResource(R.string.saber_oro),
                fontSize = 15.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(400),
                color = Color.White,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.padding(start = 143.dp, top = 10.dp),
                text = stringResource(R.string._9_00_am_10_00_am),
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }

        Divider(
            color = Purple,
            modifier = Modifier.padding(top = 24.dp)
        )

        Card(
            modifier = Modifier
                .width(256.dp)
                .height(93.dp)
                .padding(top = 40.dp),
            colors = CardDefaults.cardColors(
                containerColor = Blue
            )
        ) {
            Text(
                modifier = Modifier.padding(top = 10.dp, start = 12.dp),
                text = stringResource(R.string.software_testing),
                fontSize = 16.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(700),
                color = Color.White,
            )
            Text(
                modifier = Modifier.padding(start = 12.dp),
                text = stringResource(R.string.software_testing),
                fontSize = 15.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(400),
                color = Color.White,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.padding(start = 143.dp, top = 10.dp),
                text = stringResource(R.string._11_00am_12_00_pm),
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
        Card(
            modifier = Modifier
                .width(256.dp)
                .height(93.dp)
                .padding(top = 10.dp),
            colors = CardDefaults.cardColors(containerColor = LightPurple)
        ) {
            Text(
                modifier = Modifier.padding(top = 10.dp, start = 12.dp),
                text = stringResource(R.string.mobile_app_design),
                fontSize = 16.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(700),
                color = Color.White,
            )
            Text(
                modifier = Modifier.padding(start = 12.dp),
                text = stringResource(R.string.software_testing),
                fontSize = 15.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(400),
                color = Color.White,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.padding(start = 143.dp, top = 10.dp),
                text = stringResource(R.string._1_00_am_2_00_am),
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
    }
}