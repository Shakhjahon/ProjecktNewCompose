package com.example.projecktnewcompose.presintation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projecktnewcompose.R
import com.example.projecktnewcompose.presintation.component.MainItem
import com.example.projecktnewcompose.presintation.theme.Purple

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Maintwo(
    mainCallBack: () -> Unit
) {
    Scaffold(
        topBar = {
            Column {
                Row {
                    Column(
                        modifier = Modifier.padding(30.dp),
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(0.6f),
                            text = stringResource(R.string.monday),
                            fontSize = 14.sp,
                            color = MaterialTheme.colorScheme.onBackground,
                            letterSpacing = 0.2.sp,
                            fontWeight = FontWeight.Normal
                        )
                        Text(
                            text = stringResource(R.string._25_october),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.5.sp,
                        )
                    }
                    Icon(
                        modifier = Modifier
                            .padding(top = 46.dp)
                            .width(30.dp)
                            .height(30.dp),
                        painter = painterResource(R.drawable.search),
                        contentDescription = null,
                    )
                    Card(
                        modifier = Modifier
                            .padding(top = 34.dp, start = 25.dp)
                            .width(50.dp)
                            .height(50.dp)
                            .clip(CircleShape),
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.image),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(top = 25.dp)
                    .padding(horizontal = 15.dp)
            ) {
                Text(
                    text = stringResource(R.string.hisurf),
                    fontSize = 28.sp,
                    lineHeight = 45.sp,
                    fontWeight = FontWeight(700),
                    color = MaterialTheme.colorScheme.onBackground,
                )
                Text(
                    text = stringResource(R.string.tasks_are),
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8D8D8D),
                )
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp)
                        .height(90.dp)
                        .clickable {
                            mainCallBack()
                        },
                    colors = CardDefaults.cardColors(
                        containerColor = Purple
                    )
                ) {
                    Text(
                        modifier = Modifier.padding(top = 12.dp, start = 12.dp),
                        text = stringResource(R.string.Information_Architecture),
                        fontSize = 16.sp,
                        lineHeight = 14.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    )
                    Text(
                        modifier = Modifier.padding(start = 12.dp),
                        text = stringResource(R.string.saber_oro),
                        fontSize = 15.sp,
                        lineHeight = 14.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                }
                Text(
                    modifier = Modifier.padding(top = 15.dp),
                    text = stringResource(R.string.MonthlyPreview),
                    fontSize = 24.sp,
                    lineHeight = 45.sp,
                    fontWeight = FontWeight(700),
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center,
                )
                Column(
                    modifier = Modifier.padding(top = 20.dp, start = 8.dp)
                ) {
                    Row(
                        modifier = Modifier
                    ) {
                        MainItem()
                    }
                }
            }
        },
    )
}