package widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable

fun CustomText(buttonText: String) {
    Text(
        text = buttonText,
        modifier = Modifier
            .padding(vertical = 16.dp),

        )
}