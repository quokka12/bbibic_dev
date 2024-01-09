package com.example.myapplication.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.bbibic_green
import com.example.myapplication.ui.theme.black
import com.example.myapplication.ui.theme.white

@Composable
fun MyPointWidget(){
    GreetingWidget()
    PointWidget()
    PointShopButton()
}
@Composable
fun GreetingWidget() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(top = 20.dp, start = 20.dp, bottom = 10.dp)
    ){
        Text(text = "김응급", color = black, fontWeight = FontWeight.Bold, style = TextStyle(fontSize = 18.sp))
        Text(text = "님 반가워요!", color = black, style = TextStyle(fontSize = 18.sp))
    }
}
@Composable
fun PointWidget() {
    Surface (
        color = white,
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(horizontal = 36.dp, vertical = 16.dp)
        ) {
            Row {
                Image(
                    painter = painterResource(R.drawable.point_image),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "전체 누적 포인트", color = black, style = TextStyle(fontSize = 14.sp))
            }
            Text(text = "300P", color = black, fontWeight = FontWeight.Bold, style = TextStyle(fontSize = 18.sp))
        }
    }
}

@Composable
fun PointShopButton() {
    Surface (
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        ElevatedButton(
            colors = ButtonDefaults.buttonColors(containerColor = bbibic_green),
            onClick = {  },
            modifier = Modifier.padding(vertical = 12.dp),
            shape = MaterialTheme.shapes.medium,
        ) {
            Text("포인트 사용하러 가기", color = white, style = TextStyle(fontSize = 14.sp), fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(8.dp))
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                tint = white,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}