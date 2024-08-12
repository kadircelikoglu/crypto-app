import androidx.compose.foundation.layout.*
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cryptocurrency.crytp.components.PreviewLazyColumn
import com.cryptocurrency.crytp.ui.theme.DeepBlue
import com.cryptocurrency.crytp.ui.theme.Text1
import utils.cryptoDesc

@Composable
fun TabBarView() {
    var selectedTabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("All", "Gainer", "Loser", "Favorites")

    Column {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            contentColor = DeepBlue, indicator = { tabPositions ->
                if (selectedTabIndex < tabPositions.size) {
                    TabRowDefaults.Indicator(
                        modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        color = DeepBlue
                    )
                }
            },
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .heightIn(min = 40.dp).widthIn(min = 40.dp)
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    selectedContentColor = DeepBlue,
                    unselectedContentColor = Text1,
                    onClick = { selectedTabIndex = index },
                    modifier = Modifier.padding(horizontal = 4.dp).width(300.dp), text = {
                        Text(
                            text = title,
                            modifier = Modifier.padding(vertical = 4.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                )
            }
        }

        when (selectedTabIndex) {
            0 -> AllTabContent()
            1 -> GainerTabContent()
            2 -> LoserTabContent()
            3 -> FavouritesTabContent()
        }
    }
}

@Composable
fun AllTabContent() {
    PreviewLazyColumn(cryptoDesc)
}

@Composable
fun GainerTabContent() {
    // Content for Gainer tab
    Text("GainerTabContent", modifier = Modifier.fillMaxSize())
}

@Composable
fun LoserTabContent() {
    // Content for Loser tab
    Text("LoserTabContent", modifier = Modifier.fillMaxSize())
}

@Composable
fun FavouritesTabContent() {
    // Content for Favorites tab
    Text("FavouritesTabContent", modifier = Modifier.fillMaxSize())
}

@Preview(showBackground = true)
@Composable
fun TabBarExamplePreview() {
    TabBarView()
}
