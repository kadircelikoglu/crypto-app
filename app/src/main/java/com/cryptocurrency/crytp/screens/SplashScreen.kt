package com.cryptocurrency.crytp.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cryptocurrency.crytp.R
import com.cryptocurrency.crytp.navigation.CryptoCurrencyScreens
import com.cryptocurrency.crytp.ui.theme.Text2
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    val scale = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.3f,
            animationSpec = tween(
                durationMillis = 50,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(500L)
        navController.navigate(CryptoCurrencyScreens.MainScreen.name)
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(dimensionResource(id = com.intuit.sdp.R.dimen._250sdp)))
        Box {
            Image(
                painter = painterResource(id = R.drawable.ic_app_logo),
                contentDescription = "",
                modifier = Modifier
                    .size(
                        height = dimensionResource(id = com.intuit.sdp.R.dimen._130sdp),
                        width = dimensionResource(id = com.intuit.sdp.R.dimen._174sdp)

                    )
            )
        }
        Text(
            stringResource(id = R.string.splash_information), color = Text2,
            modifier = Modifier.padding(top = dimensionResource(id = com.intuit.sdp.R.dimen._250sdp))

        )
    }


}

@Preview
@Composable
fun PreviewSplashScreen() {
    SplashScreen(navController = rememberNavController())
}