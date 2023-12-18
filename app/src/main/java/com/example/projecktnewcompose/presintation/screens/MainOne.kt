package com.example.projecktnewcompose.presintation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projecktnewcompose.R
import com.example.projecktnewcompose.presintation.theme.Purple

@Composable
fun MainOne(
    onClickCallBack: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Purple)
    ) {
        Column {
            Image(
                painter = painterResource(R.drawable.photo),
                contentDescription = null,
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(550.dp)
                    .clip(RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp))
                    .background(Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(start = 65.dp)
                ) {

                    Text(
                        modifier = Modifier.padding(top = 125.dp),
                        text = stringResource(
                            id = R.string.builder_better
                        ),
                        textAlign = TextAlign.Center,
                        fontSize = 37.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 45.sp
                    )

                    Text(
                        modifier = Modifier.padding(top = 12.dp),
                        text = stringResource(
                            id = R.string.create_a_unique
                        ),
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Gray
                    )
                }
                Spacer(
                    modifier = Modifier.weight(1f)
                )
                Button(
                    onClick = {
                        onClickCallBack()
                    },
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(horizontal = 40.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Purple
                    ),
                    elevation = ButtonDefaults.buttonElevation(10.dp)
                ) {
                    Text(
                        text = stringResource(R.string.get_start),
                        fontWeight = FontWeight.Bold,
                        color = White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}