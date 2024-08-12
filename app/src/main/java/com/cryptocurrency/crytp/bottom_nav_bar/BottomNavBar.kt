package com.cryptocurrency.crytp.bottom_nav_bar

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.cryptocurrency.crytp.R
import com.cryptocurrency.crytp.navigation.CryptoCurrencyScreens
import com.cryptocurrency.crytp.screens.HomeScreen
import com.cryptocurrency.crytp.ui.theme.DeepBlue
import com.cryptocurrency.crytp.ui.theme.Text1
import com.cryptocurrency.crytp.ui.theme.White

sealed class BottomNavItem(val route: String, val iconResId: Int, val label: String) {
    data object Home : BottomNavItem(CryptoCurrencyScreens.MainScreen.name, R.drawable.ic_home, "Home")
    data object Portfolio :
        BottomNavItem(CryptoCurrencyScreens.PortfolioScreen.name, R.drawable.ic_portfolio, "Portfolio")

    data object Rewards : BottomNavItem(CryptoCurrencyScreens.RewardScreen.name, R.drawable.ic_rewards, "Rewards")
    data object Market : BottomNavItem(CryptoCurrencyScreens.MarketScreen.name, R.drawable.ic_market, "Market")
    data object Profile : BottomNavItem(CryptoCurrencyScreens.ProfileScreen.name, R.drawable.ic_profile, "Profile")

}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        HomeScreen(navController)
    }
}


@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Portfolio,
        BottomNavItem.Rewards,
        BottomNavItem.Market,
        BottomNavItem.Profile

    )

    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                selected = currentRoute == item.route, modifier = Modifier.background(color = White),

                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        painterResource(id = item.iconResId),
                        contentDescription = null,
                        tint = if (currentRoute == item.route) DeepBlue else Text1
                    )
                },
                label = { Text(item.label, color = if (currentRoute == item.route) DeepBlue else Text1) }
            )
        }
    }
}
