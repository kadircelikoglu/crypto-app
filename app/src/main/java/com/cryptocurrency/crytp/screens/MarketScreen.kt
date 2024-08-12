package com.cryptocurrency.crytp.screens

//noinspection UsingMaterialAndMaterial3Libraries
import TabBarExamplePreview
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.cryptocurrency.crytp.R
import com.cryptocurrency.crytp.bottom_nav_bar.BottomNavigationBar
import com.cryptocurrency.crytp.components.dropdown.DropdownButton
import com.cryptocurrency.crytp.ui.theme.Red
import com.cryptocurrency.crytp.ui.theme.Text1
import com.cryptocurrency.crytp.ui.theme.White
import com.cryptocurrency.crytp.ui.theme.workSansFontsMedium

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MarketScreen(
    navController: NavController
) {
    Scaffold(backgroundColor = White,
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

        MarketView { }
    }
}

@Composable
fun MarketView(function: () -> Unit) {

    Column {
        Row(
            modifier = Modifier.align(alignment = Alignment.Start)
                .padding(top = 15.dp, start = 10.dp, end = 5.dp, bottom = 2.dp)
        ) {
            Text(stringResource(R.string.market_down), color = Color.Black, fontSize = 20.sp)
            Text("-11.17%", color = Red, fontSize = 20.sp, modifier = Modifier.padding(start = 10.dp))
            Image(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = null,
                modifier = Modifier.align(alignment = Alignment.CenterVertically).padding(start = 125.dp)
            )
        }
        Text(
            stringResource(R.string.past_24_hours),
            color = Text1,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(
                stringResource(R.string.your_coins), fontFamily = workSansFontsMedium,
                color = Color.Black,
                fontSize = 18.sp,
                modifier = Modifier.padding(end = 120.dp)
            )
            DropdownButton()
        }
        TabBarExamplePreview()
    }

}