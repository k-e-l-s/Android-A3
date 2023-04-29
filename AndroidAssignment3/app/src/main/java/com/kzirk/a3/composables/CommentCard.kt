package com.kzirk.a3.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kzirk.a3.R
import com.kzirk.a3.ui.theme.CommentBackgroundColor

@Composable
fun commentCard(commenterName: String, friendDate: String, comment: String, ){
    //container row
    Row(modifier = Modifier
        //the width is set to be 100%, but the height is variable
        .heightIn(max = 200.dp)
        .padding(start = 20.dp)
        .fillMaxWidth()
        .background(color = CommentBackgroundColor)
        .border(width = .2.dp, color = Color.DarkGray )
        ){
        //column to organize the stack
        Column(
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 5.dp)
        ) {
            //username, icon
            Row(
                modifier = Modifier
                .fillMaxWidth()
            ){
                //next, we will set the subreddit name and username
                Column(
                    modifier = Modifier
                        .height(30.dp)
                ){
                    Row(
                        modifier = Modifier.padding(vertical = 5.dp)
                    ){
                        Text("$commenterName                     friends since $friendDate", color = Color.Gray)
                    }
                }
                //this aligns the last element to the far right corner
                Spacer(modifier = Modifier.weight(1f))
                //setting the menu options
                Column(
                    modifier = Modifier
                        .width(20.dp)
                        .height(30.dp)
                ){
                    Icon(painter = painterResource(id = R.drawable.kebab_menu), contentDescription = "", modifier = Modifier.fillMaxSize())
                }
            }
            Divider(color = Color.DarkGray, thickness = 0.19.dp)
            //comment
            Row(){
                Text(text = comment, color = Color.Gray,
                    modifier = Modifier.padding(vertical = 10.dp))
            }
            Row(modifier = Modifier.height(30.dp)){

                Image(painter = painterResource(
                    id = R.drawable.reply),
                    contentDescription = "reply icon",
                    modifier = Modifier.padding(5.dp).width(20.dp).height(20.dp)
                )
                Text("Reply", color = Color.Gray, modifier = Modifier.padding(5.dp))

                Spacer(modifier = Modifier.width(20.dp))
                //upvote arrow
                Image(painter = painterResource(
                    id = R.drawable.uparrow),
                    contentDescription = "UpVote arrow",
                    modifier = Modifier
                        .padding(5.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Text(text = "Vote", color = Color.Gray, modifier = Modifier.padding(5.dp))
                Image(painter = painterResource(
                    id = R.drawable.downarrow),
                    contentDescription = "DownVote arrow",
                    modifier = Modifier
                        .padding(5.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))

                Image(painter = painterResource(
                    id = R.drawable.share),
                    contentDescription = "Share Icon",
                    modifier = Modifier
                        .padding(5.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Text(text = "Share", color = Color.Gray, modifier = Modifier.padding(5.dp))
            }
        }
    }
}