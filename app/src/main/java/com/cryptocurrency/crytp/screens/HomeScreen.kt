package com.cryptocurrency.crytp.screens

import OutlinedButton
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.cryptocurrency.crytp.components.PreviewLazyColumn
import com.cryptocurrency.crytp.ui.theme.*
import utils.cryptoDesc

@Composable
fun HomeScreen(
    navController: NavController
) {

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Spacer(
            modifier = Modifier.padding(
                top = 30.dp
            )
        )
        Card(
            colors = CardDefaults.cardColors(
                containerColor = DeepBlue,
            ), modifier = Modifier.size(height = 150.dp, width = 375.dp).align(alignment = Alignment.CenterHorizontally)
        ) {
            Column(modifier = Modifier.padding(start = 30.dp)) {

                Text(
                    text = stringResource(R.string.card_title),
                    color = Color.White,
                    fontFamily = workSansFontsMedium,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier
                        .padding(vertical = 8.dp),

                    )
                Text(
                    text = stringResource(R.string.card_description), color = Color.White,
                    fontFamily = workSansFontsBlack,
                    modifier = Modifier
                        .padding(vertical = 16.dp),

                    )
                OutlinedButton(
                    onClick = {},
                    containerColor = White,
                    buttonText = stringResource(R.string.card_button_text),
                    fontSize = 10.sp, width = 110, height = 35, borderRadius = 4, textColor = DeepBlue
                )
            }
        }
        Text(
            text = stringResource(R.string.trending_coins), color = Color.Black,
            fontFamily = workSansFontsRegular, fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 24.dp, top = 30.dp, bottom = 15.dp),

            )

        PreviewLazyColumn(cryptoDesc)
    }
}

