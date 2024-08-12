package com.cryptocurrency.crytp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cryptocurrency.crytp.ui.theme.*
import utils.*

@Composable
fun PreviewLazyColumn(description: List<Int>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .padding(bottom = 60.dp, top = 15.dp)
    ) {
        items(cryptoImages.size) { index ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = White,
                ),
                elevation = CardDefaults.cardElevation(1.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .size(height = 100.dp, width = 500.dp)

                    .padding(bottom = 10.dp, start = 20.dp, end = 20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = painterResource(id = cryptoImages[index]),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier.size(width = 45.dp, height = 45.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        modifier = Modifier.weight(1.25f),
                        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start,

                        ) {
                        Text(
                            text = stringResource(cryptoNames[index]), color = Color.Black,
                            fontFamily = workSansFontsMedium, fontSize = 16.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, bottom = 2.dp),

                            )
                        Text(
                            text = stringResource(description[index]), color = Text1,
                            fontFamily = workSansFontsRegular, fontSize = 12.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, bottom = 5.dp, end = 16.dp),

                            )
                    }
                    Image(
                        painter = painterResource(id = graphics[index]),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier.size(width = 45.dp, height = 45.dp)
                    )
                    Column(
                        modifier = Modifier.weight(1f).padding(end = 5.dp),
                        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.End,

                        ) {
                        Text(
                            text = amount[index], color = Color.Black,
                            fontFamily = workSansFontsMedium, fontSize = 18.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, bottom = 2.dp),

                            )
                        Text(
                            text = rate[index], color = if (rate[index].contains("-")) Red else Green,
                            fontFamily = workSansFontsMedium, fontSize = 11.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, bottom = 5.dp),

                            )
                    }
                }
            }

        }
    }
}