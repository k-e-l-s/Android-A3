package com.kzirk.a3.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kzirk.a3.composables.card
import com.kzirk.a3.composables.commentCard
import com.kzirk.a3.composables.navigation.bottomNav
import com.kzirk.a3.composables.navigation.topNav

@Composable
fun friendsScreen(){
    Row(verticalAlignment = Alignment.Top){
        topNav();
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .padding(top = 65.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        card(123, "subname", "username","3h",  "this is my content title!", contentText = "this is my content text!", 23)
        card(123, "subname", "username","5h", "this is my content title!", contentText = "this is my content text!", 635)

    }
    Row(verticalAlignment = Alignment.Bottom){
        bottomNav()
    }
}