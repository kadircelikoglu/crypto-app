package com.cryptocurrency.crytp.components.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cryptocurrency.crytp.ui.theme.White
import com.cryptocurrency.crytp.ui.theme.workSansFontsMedium
import com.cryptocurrency.crytp.ui.theme.workSansFontsRegular

@Composable
fun RewardSocialCard(
    backgroundColor: Color,
    title: String,
    desc: String,
    textColor: Color,
    buttonText: String,
    image: Int
) {
    Card(
        modifier = Modifier.size(height = 250.dp, width = 375.dp).padding(top = 20.dp),
        elevation = 4.dp,
        backgroundColor = backgroundColor,
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(start = 15.dp, top = 15.dp)) {
                Text(
                    title,
                    fontFamily = workSansFontsRegular,
                    fontSize = 16.sp, color = White,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
                Box(modifier = Modifier.size(width = 250.dp, height = 100.dp)) {
                    Text(
                        desc,
                        fontFamily = workSansFontsMedium,
                        fontSize = 24.sp,
                        color = White,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(4.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = White),
                ) {
                    Text(
                        text = buttonText,
                        color = textColor, fontSize = 12.sp,
                        modifier = Modifier.padding(horizontal = 15.dp, vertical = 6.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(bottom = 3.dp))
            }
            Image(painter = painterResource(image), contentDescription = null, modifier = Modifier.padding(end = 15.dp))
        }


    }
}