@file:JvmName("MainThirdKt")

package com.example.projecktnewcompose.presintation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedomdz.presettation.screens.details.mainItemTwo
import com.example.projecktnewcompose.R
import com.example.projecktnewcompose.presintation.component.MainItemThird


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainThird(
    callBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Icon(
                        modifier = Modifier
                            .padding(15.dp)
                            .clickable {
                                callBack()
                            },
                        painter = painterResource(id = R.drawable.arrow_left),
                        contentDescription = null,
                    )
                },
                actions = {
                    Card(
                        shape = CircleShape,
                        modifier = Modifier
                            .padding(15.dp)
                            .width(56.dp)
                            .height(56.dp)
                            .background(MaterialTheme.colorScheme.background)
                    ) {
                        Image(
                            modifier = Modifier,
                            painter = painterResource(id = R.drawable.image),
                            contentScale = ContentScale.Crop,
                            contentDescription = null,
                        )
                    }
                },
            )
        },
        content = { innerPadding ->
            Column() {
                Row {
                    Text(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(top = 10.dp),
                        text = stringResource(R.string.mar),
                        fontSize = 15.sp
                    )
                    Text(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxWidth(0.85f),
                        text = stringResource(R.string.april),
                        textAlign = TextAlign.Center,
                        fontSize = 25.sp
                    )
                    Text(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(top = 10.dp, start = 5.dp),
                        text = stringResource(R.string.may),
                        fontSize = 15.sp
                    )
                }
                Row(
                    modifier = Modifier.padding(33.dp),
                ) {
                    mainItemTwo()
                }
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = stringResource(R.string.ongoing),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
                Row {
                    Column {
                        Text(
                            modifier = Modifier.padding(20.dp),
                            text = "9AM"
                        )
                        Text(
                            modifier = Modifier.padding(20.dp),
                            text = "10AM"
                        )
                        Text(
                            modifier = Modifier.padding(20.dp),
                            text = "10AM"
                        )
                        Text(
                            modifier = Modifier.padding(20.dp),
                            text = "11AM"
                        )
                        Text(
                            modifier = Modifier.padding(20.dp),
                            text = "12:00PM"
                        )
                        Text(
                            modifier = Modifier.padding(20.dp),
                            text = "1PM"
                        )
                    }
                    Column(
                        modifier = Modifier.padding(start = 30.dp)
                    ) {
                        MainItemThird()
                    }
                }
            }
        },
    )
}

@Preview
@Composable
fun FoodMeny() {
    MainThird(callBack = {})
}