package com.cryptocurrency.crytp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.cryptocurrency.crytp.R
import com.cryptocurrency.crytp.bottom_nav_bar.BottomNavigationBar
import com.cryptocurrency.crytp.ui.theme.*
import utils.profileItemIcons
import utils.profileItemTexts

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProfileScreen(
    navController: NavController
) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

        ProfileView { }
    }
}

@Composable
fun ProfileView(function: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(all = 12.dp)
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = DeepBlue,
            ), modifier = Modifier.size(height = 150.dp, width = 375.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_profile),
                    contentDescription = null, colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(White),
                    modifier = Modifier.size(height = 75.dp, width = 75.dp).padding(top = 20.dp)
                )
                Text(
                    "Alexia Watson",
                    fontSize = 16.sp,
                    fontFamily = workSansFontsMedium,
                    color = White,
                    modifier = Modifier.padding(vertical = 5.dp)
                )
                Text(
                    "alexiawatson@gmail.com",
                    fontFamily = workSansFontsMedium,
                    fontSize = 10.sp,
                    color = White,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    "+1 123 456 789",
                    fontSize = 10.sp,
                    fontFamily = workSansFontsMedium,
                    color = White,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .padding(bottom = 60.dp, top = 15.dp)
        ) {
            items(profileItemIcons.size) { index ->
                Column {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 30.dp).fillMaxWidth()
                    ) {
                        Row {
                            Image(
                                painter = painterResource(profileItemIcons[index]),
                                contentDescription = "",
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(stringResource(profileItemTexts[index]), fontFamily = workSansFontsRegular)
                        }
                        Image(painter = painterResource(R.drawable.ic_right_arrow), contentDescription = "")

                    }
                    Divider(color = BorderColor)
                }
            }

        }
    }
}