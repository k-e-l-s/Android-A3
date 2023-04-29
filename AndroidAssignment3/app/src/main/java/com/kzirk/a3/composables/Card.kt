package com.kzirk.a3.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kzirk.a3.R
import com.kzirk.a3.ui.theme.CardBackgroundColor

@Composable
fun card(
    iconPath: Int,
    subredditName: String,
    userName: String, hours: String,
    contentTitle: String,
    contentText: String,
    numOfComments: Int,
    contentPicturePath: Int = 0
){

    var selected by remember {
        mutableStateOf(false)
    }

    //container for the entire card, this take up 100% of the width
    //encapsulates everything with the grey background
    Row(
        modifier = Modifier
            //the width is set to be 100%, but the height is variable
            .fillMaxWidth()
            .background(color = CardBackgroundColor)

    ){
        //this is to structure the inside of the row we just made
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            //now we will set all the content for each row
            //top row of content
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                //we will set the icon inside the content so we can control how big it renders
                Column(
                    modifier = Modifier
                        .height(40.dp)
                        .padding(end = 10.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.icon1), contentDescription = "Icon", modifier = Modifier.clip(
                        CircleShape))
                }
                //next, we will set the subreddit name and username
                Column(
                    modifier = Modifier
                        .height(50.dp)
                        .padding(horizontal = 10.dp)
                ){
                    Row(){
                        Text("r/$subredditName", color = Color.White)
                    }
                    Row(){
                        Text("u/$userName - $hours", color = Color.Gray)
                    }
                }
                //this aligns the last element to the far right corner
                Spacer(modifier = Modifier.weight(1f))
                //setting the menu options
                Column(
                    modifier = Modifier
                        .width(20.dp)
                        .height(50.dp)
                ){
                    Icon(painter = painterResource(id = R.drawable.kebab_menu), contentDescription = "", modifier = Modifier.fillMaxSize())
                }
            }
            //content title
            Row(modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)){
                Text(contentTitle, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
            //if there is a content image, it'll be a non-zero integer and we will display it instead of displaying the text spoiler
            if (contentPicturePath != 0){
                Row(){
                    Image(painter = painterResource(id = contentPicturePath), contentDescription = "content image",
                        modifier = Modifier.padding(bottom = 10.dp))
                }
            } else {
                Row(

                ){
                    Text(text = contentText, color = Color.Gray,
                    modifier = Modifier.padding(bottom = 10.dp))
                }
            }

            Row(modifier = Modifier.height(30.dp)){
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
                    id = R.drawable.message),
                    contentDescription = "Comment icon",
                    modifier = Modifier
                        .padding(5.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Text(numOfComments.toString(), color = Color.Gray, modifier = Modifier.padding(5.dp))
                Spacer(modifier = Modifier.width(20.dp))

                if (selected) {
                    Image(painter = painterResource(
                        id = R.drawable.friendsselected),
                        contentDescription = "Comment icon",
                        modifier = Modifier
                            .padding(5.dp)
                            .width(20.dp)
                            .height(20.dp)
                            .clickable {
                                selected = !selected
                            }
                    )
                }
                else {
                    Image(painter = painterResource(
                        id = R.drawable.friends),
                        contentDescription = "Comment icon",
                        modifier = Modifier
                            .padding(5.dp)
                            .width(20.dp)
                            .height(20.dp)
                            .clickable {
                                selected = !selected
                            }
                    )
                }

                Text(numOfComments.toString(), color = Color.Gray, modifier = Modifier.padding(5.dp))
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

            if (selected){
                Column(modifier = Modifier.fillMaxWidth()) {
                    commentCard(commenterName = "friend name", friendDate = "june8", comment = "This is so funny!")
                    commentCard(commenterName = "friend name", friendDate = "june8", comment = "This is so funny!")
                    commentCard(commenterName = "friend name", friendDate = "june8", comment = "This is so funny!")
                }

            }

        }
    }
}