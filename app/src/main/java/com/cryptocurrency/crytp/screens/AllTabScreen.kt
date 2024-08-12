package com.cryptocurrency.crytp.screens

import androidx.compose.runtime.Composable
import com.cryptocurrency.crytp.components.PreviewLazyColumn
import utils.cryptoDesc

@Composable
fun AllTabScreen() {
    PreviewLazyColumn(description = cryptoDesc)
}