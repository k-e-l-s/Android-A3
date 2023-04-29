package com.kzirk.a3.composables.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kzirk.a3.R
import com.kzirk.a3.ui.theme.CommentBackgroundColor

@Composable
fun bottomNav(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = CommentBackgroundColor)
            .border(width = Dp.Hairline, color = Color.Gray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column(
            modifier = Modifier.padding(start = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(modifier = Modifier.height(30.dp)){
                Icon(painter = painterResource(id = R.drawable.home), contentDescription = "home icon")
            }
            Row(modifier = Modifier.height(20.dp)){
                Text("Home", fontSize = 12.sp)
            }
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier.height(30.dp)){
                Icon(painter = painterResource(id = R.drawable.discover), contentDescription = "discover icon")
            }
            Row(modifier = Modifier.height(20.dp)){
                Text("Discover", fontSize = 12.sp)
            }
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier.height(30.dp)){
                Icon(painter = painterResource(id = R.drawable.create), contentDescription = "create icon")
            }
            Row(modifier = Modifier.height(20.dp)){
                Text("Create", fontSize = 12.sp)
            }
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier.height(30.dp)){
                Icon(painter = painterResource(id = R.drawable.chat), contentDescription = "chat icon")
            }
            Row(modifier = Modifier.height(20.dp)){
                Text("Chat", fontSize = 12.sp)
            }

        }
        Column(
            modifier = Modifier.padding(end = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier.height(30.dp)){
                Icon(painter = painterResource(id = R.drawable.inbox), contentDescription = "inbox icon")
            }
            Row(modifier = Modifier.height(20.dp)){
                Text("Inbox", fontSize = 12.sp)
            }

        }

    }


}