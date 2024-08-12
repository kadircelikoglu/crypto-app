package com.cryptocurrency.crytp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.cryptocurrency.crytp.R
import com.cryptocurrency.crytp.bottom_nav_bar.BottomNavigationBar
import com.cryptocurrency.crytp.components.PreviewLazyColumn
import com.cryptocurrency.crytp.components.buttons.FilledButton
import com.cryptocurrency.crytp.components.buttons.OutlinedButton
import com.cryptocurrency.crytp.ui.theme.*
import utils.cryptoValues

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PortfolioScreen(
    navController: NavController
) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

        PortfolioView { }
    }
}

@Composable
fun PortfolioView(function: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = DeepBlue,
            ),
            modifier = Modifier.size(height = 250.dp, width = 375.dp).align(alignment = Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        ) {
            Column(modifier = Modifier.padding(start = 30.dp)) {

                Text(
                    text = stringResource(R.string.portfolio),
                    color = Color.White, fontSize = 25.sp,
                    fontFamily = workSansFontsRegular,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 6.dp),

                    )
                Text(
                    text = stringResource(R.string.holding_value),
                    color = Color.White, fontSize = 12.sp,
                    fontFamily = workSansFontsRegular,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 8.dp),

                    )
                Row(modifier = Modifier.padding(bottom = 20.dp), verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "₺2,509.75", color = Color.White,
                        fontFamily = workSansFontsMedium, fontSize = 30.sp,
                    )
                    Text(
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        text = "+9.77%", color = Color.White,
                        fontFamily = workSansFontsRegular,

                        )
                }
                Row(modifier = Modifier.align(alignment = Alignment.Start).fillMaxWidth().padding(bottom = 12.dp)) {
                    Column() {
                        Text(
                            text = stringResource(R.string.invested_value), color = Color.White,
                            fontFamily = workSansFontsMedium, fontSize = 12.sp,
                            modifier = Modifier.padding(bottom = 4.dp, end = 12.dp)
                        )
                        Text(
                            text = "₺1,618.75", color = Color.White,
                            fontFamily = workSansFontsMedium, fontSize = 20.sp,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                    }
                    Divider(
                        color = White,
                        modifier = Modifier
                            .fillMaxHeight().height(3.dp) //fill the max height
                            .width(1.dp)
                    )
                    Column() {
                        Text(
                            text = stringResource(R.string.available_inr), color = Color.White,
                            fontFamily = workSansFontsMedium, fontSize = 12.sp,
                            modifier = Modifier.padding(start = 12.dp, bottom = 4.dp)
                        )
                        Text(
                            text = "₺1,589.00", color = Color.White,
                            fontFamily = workSansFontsMedium, fontSize = 20.sp,
                            modifier = Modifier.padding(start = 12.dp, bottom = 4.dp)
                        )
                    }
                }


            }
        }

        Row(modifier = Modifier.align(alignment = Alignment.CenterHorizontally).padding(top = 15.dp)) {
            FilledButton({}, DeepBlue, White,R.string.deposit_inr)
            Spacer(modifier = Modifier.padding(horizontal = 8.dp))
            OutlinedButton({}, White, DeepBlue)
        }

        Text(
            text = stringResource(R.string.your_coins), color = Color.Black,
            fontFamily = workSansFontsBlack, fontSize = 20.sp,
            modifier = Modifier.padding(top = 4.dp, start = 26.dp, bottom = 4.dp)
        )
        PreviewLazyColumn(cryptoValues)
    }
}