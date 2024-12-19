package com.example.githubrepoapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubrepoapp.ui.theme.GitHubRepoAppTheme

@Composable
fun RepoItem(modifier: Modifier = Modifier) {
    Row (modifier = modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
        .padding(top = 12.dp)
        .background(color = Color.White, shape = RoundedCornerShape(12.dp))
        .clickable { }
    ){

        Image(
            modifier = modifier
                .padding(start = 5.dp, top = 2.dp)
                .size(50.dp)
                .clip(shape = CircleShape),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription =null )
        Column (
            modifier = modifier.padding(horizontal = 10.dp, vertical = 6.dp)
        ){

            Row (
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    fontWeight = FontWeight(weight = 600),
                    text = "Bump werkzeug from"
                )

                Text(
                    modifier = modifier
                        .clickable { }
                        .padding(horizontal = 10.dp),
                    text = "open")
            }
            Text(text = "NONE")
            Row {
                Text(fontWeight = FontWeight(weight = 600),
                    text = "Created At:")
                Text(text = "2023-10-5")
            }

        }
    }
}
@Preview
@Composable
private fun PreviewRepoItem () {
    GitHubRepoAppTheme {
        RepoItem()
    }
}