package com.cryptocurrency.crytp.components.dropdown

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cryptocurrency.crytp.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownButton() {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Market INR") }

    val options = listOf("Option 1", "Option 2", "Option 3", "Option 4")

    Column(
        modifier = Modifier
            .padding(16.dp)
            .size(width = 125.dp, height = 22.dp)
            .background(color = White) // Set the background to white for the entire dropdown
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            modifier = Modifier.background(color = Color.White), // Background color for the dropdown menu box
            onExpandedChange = { expanded = !expanded }
        ) {
            TextField(
                value = selectedOption,
                onValueChange = {},
                readOnly = true,
                label = { Text("Market INR") },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                }, colors = TextFieldDefaults.colors(
                    focusedContainerColor = White,
                    unfocusedContainerColor = White,
                    disabledContainerColor = White,
                    focusedIndicatorColor = Color.Transparent, // Hide the underline
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = true }
                // Background color for the text field
            )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp)) // Rounded corners for the dropdown
                    .background(White) // Background color for the dropdown menu
            ) {
                options.forEach { option ->
                    DropdownMenuItem(
                        text = { Text(text = option) },
                        modifier = Modifier.background(color = White), // Background color for each menu item
                        onClick = {
                            selectedOption = option
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropdownButtonExamplePreview() {
    DropdownButton()
}
