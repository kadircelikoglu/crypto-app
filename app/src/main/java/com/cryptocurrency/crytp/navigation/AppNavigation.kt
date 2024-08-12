package com.cryptocurrency.crytp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cryptocurrency.crytp.bottom_nav_bar.MainScreen
import com.cryptocurrency.crytp.screens.*


enum class CryptoCurrencyScreens {
    MainScreen,
    PortfolioScreen,
    SplashScreen,
    HomeScreen,
    RewardScreen,
    MarketScreen,
    ProfileScreen

}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = CryptoCurrencyScreens.SplashScreen.name) {
        composable(CryptoCurrencyScreens.MainScreen.name) { MainScreen(navController) }
        composable(CryptoCurrencyScreens.PortfolioScreen.name) { PortfolioScreen(navController) }
        composable(CryptoCurrencyScreens.SplashScreen.name) { SplashScreen(navController) }
        composable(CryptoCurrencyScreens.HomeScreen.name) { HomeScreen(navController)  }
        composable(CryptoCurrencyScreens.RewardScreen.name) { RewardScreen(navController)  }
        composable(CryptoCurrencyScreens.MarketScreen.name) { MarketScreen(navController)  }
        composable(CryptoCurrencyScreens.ProfileScreen.name) { ProfileScreen(navController)  }

    }
}
