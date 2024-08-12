package com.cryptocurrency.crytp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.cryptocurrency.crytp.R
import com.cryptocurrency.crytp.bottom_nav_bar.BottomNavigationBar
import com.cryptocurrency.crytp.components.card.CustomRewardCard
import com.cryptocurrency.crytp.components.card.RewardSocialCard
import com.cryptocurrency.crytp.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RewardScreen(
    navController: NavController
) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {

        RewardView { }
    }
}

@Composable
fun RewardView(function: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        modifier = Modifier.padding(start = 15.dp, bottom = 10.dp).verticalScroll(rememberScrollState())

    ) {
        CustomRewardCard()
        Card(
            modifier = Modifier.size(height = 150.dp, width = 375.dp).padding(top = 5.dp),
            elevation = 4.dp,
            backgroundColor = White,
            shape = RoundedCornerShape(8.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(start = 15.dp, top = 15.dp)
            ) {
                Text(
                    "Refferal",
                    fontFamily = workSansFontsBlack,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth().padding(end = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "Total No of referral",
                        fontFamily = workSansFontsMedium,
                        fontSize = 12.sp,
                        color = Text1,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                    Text(
                        "12",
                        fontFamily = workSansFontsBlack,
                        fontSize = 12.sp, color = Color.Black,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(end = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "Total No of Qualified referral",
                        fontFamily = workSansFontsMedium,
                        fontSize = 12.sp,
                        color = Text1,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                    Text(
                        "05",
                        fontFamily = workSansFontsBlack,
                        fontSize = 12.sp, color = DeepBlue,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                }
            }
        }
        RewardSocialCard(
            Orange,
            "Refer and Earn",
            "Refer you Friend and Win Cryptocoins",
            Orange,
            "Refer now",
            R.drawable.ic_refer_earn
        )

        RewardSocialCard(
            Purple,
            "Rewards",
            "Like, Share & get free coupons",
            Purple,
            "Share now",
            R.drawable.ic_like_share
        )
        Spacer(modifier = Modifier.padding(bottom = 75.dp))
    }

}