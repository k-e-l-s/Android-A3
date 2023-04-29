package com.kzirk.a3.composables.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kzirk.a3.R
import com.kzirk.a3.ui.theme.CardBackgroundColor
import com.kzirk.a3.ui.theme.CommentBackgroundColor

@Composable
fun buttonText() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Home ")
        Icon(painter = painterResource(id = R.drawable.down), contentDescription = "Menu button")
    }
}

@Composable
fun topNav(){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = CommentBackgroundColor)
            .border(width = Dp.Hairline, color = Color.Gray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        //menu icon
        Column(modifier = Modifier
            .height(40.dp)
            .padding(start = 5.dp)
        ){
            Row(verticalAlignment = Alignment.CenterVertically){
                Icon(painter = painterResource(id = R.drawable.menu), contentDescription = "menu icon")
                Button(
                    modifier = Modifier.padding(start = 10.dp),
                    shape = RoundedCornerShape(20),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
                    onClick = {},
                    content = {buttonText()}
                )
            }
        }
        Column(
            modifier = Modifier
                .height(40.dp)
                .padding(end = 5.dp),
        ){
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End){
                Icon(painter = painterResource(id = R.drawable.search), contentDescription = "search icon")
                Image(painter = painterResource(id = R.drawable.icon2), contentDescription = "Icon", modifier = Modifier.clip(
                    CircleShape
                ))
            }
        }

    }




}




