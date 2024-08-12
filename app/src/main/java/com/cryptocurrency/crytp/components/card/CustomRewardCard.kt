package com.cryptocurrency.crytp.components.card

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cryptocurrency.crytp.ui.theme.*

@Composable
fun CustomRewardCard() {
    Card(
        modifier = Modifier.size(height = 200.dp, width = 375.dp).padding(top = 20.dp),
        elevation = 4.dp,
        backgroundColor = White,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(start = 15.dp, top = 15.dp)) {
            Text(
                "Coupons",
                fontFamily = workSansFontsBlack,
                fontSize = 16.sp,
                modifier = Modifier.padding(vertical = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(end = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "No.of Coupons Won",
                    fontFamily = workSansFontsMedium,
                    fontSize = 12.sp,
                    color = Text1,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
                Text(
                    "06",
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
                    "Tokens won from Spin so far",
                    fontFamily = workSansFontsMedium,
                    fontSize = 12.sp,
                    color = Text1,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
                Text(
                    "08",
                    fontFamily = workSansFontsBlack,
                    fontSize = 12.sp, color = DeepBlue,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "Remaining Coupons to Spin",
                    fontFamily = workSansFontsMedium,
                    fontSize = 12.sp,
                    color = Text1,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
                Text(
                    "01",
                    fontFamily = workSansFontsBlack,
                    fontSize = 12.sp, color = DeepBlue,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
            }

        }


    }
}