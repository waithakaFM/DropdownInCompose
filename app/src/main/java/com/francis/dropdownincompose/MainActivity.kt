package com.francis.dropdownincompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.francis.dropdownincompose.ui.theme.DropdownInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DropdownInComposeTheme {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(16.dp)
                ){
                    items(
                        listOf(
                           "Franco",
                            "Nduta",
                            "Johnny",
                            "Shelly",
                            "Penny",
                            "Mwangi",
                            "Hannah",
                            "Faith",
                            "Franco",
                            "Nduta",
                            "Johnny",
                            "Shelly",
                            "Penny",
                            "Mwangi",
                            "Hannah",
                            "Faith",
                        )
                    ){ name ->
                        PersonItem(
                            personName = name,
                            dropDownItems = listOf(
                                DropDownItem("Item 1"),
                                DropDownItem("Item 2"),
                                DropDownItem("Item 3")
                            ),
                            onItemClick = {
                                Toast.makeText(
                                    applicationContext,
                                    it.text,
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        )
                    }
                }
            }
        }
    }
}