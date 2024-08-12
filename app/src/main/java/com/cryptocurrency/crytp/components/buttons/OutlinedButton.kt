package com.cryptocurrency.crytp.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.cryptocurrency.crytp.R
import com.cryptocurrency.crytp.ui.theme.DeepBlue
import com.cryptocurrency.crytp.ui.theme.White

@Composable

fun OutlinedButton(onClick: () -> Unit, containerColor: Color, textColor: Color) {
    Button(
        onClick = {},
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(2.dp, DeepBlue),
        colors = ButtonDefaults.buttonColors(contentColor = White, containerColor = White)
    ) {
        Text(
            text = stringResource(R.string.withdraw_inr), color = DeepBlue,

            modifier = Modifier.padding(horizontal = 15.dp, vertical = 6.dp)
        )
    }
}