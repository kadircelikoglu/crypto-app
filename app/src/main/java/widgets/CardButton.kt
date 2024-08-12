import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedButton(
    onClick: () -> Unit,
    buttonText: String,
    height: Int,
    width: Int,
    containerColor: Color,
    textColor: Color,
    fontSize: TextUnit,
    borderRadius: Int // New parameter for border radius
) {
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .size(height = height.dp, width = width.dp),
        colors = ButtonDefaults.outlinedButtonColors(containerColor = containerColor),
        shape = RoundedCornerShape(borderRadius.dp) // Set the border radius here
    ) {
        Text(
            buttonText,
            color = textColor,
            fontSize = fontSize,
            textAlign = TextAlign.Center,

            )
    }
}
