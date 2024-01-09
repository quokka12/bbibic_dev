package com.example.myapplication.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.bbibic_Grey
import com.example.myapplication.ui.theme.bbibic_green
import com.example.myapplication.ui.theme.black
import com.example.myapplication.ui.theme.white

@Composable
fun UpcomingFeaturesWidget(){
    Column (
        modifier = Modifier.padding(horizontal = 20.dp)
    ){
        FeatureInfoRow()
        Spacer(modifier = Modifier.size(8.dp))
        UpcomingFeatureGrid(upcomingFeatureList)
    }
}
@Composable
fun FeatureInfoRow() {
    Row (
        verticalAlignment = Alignment.CenterVertically,
    ){
        Icon(
            imageVector = Icons.Outlined.Info,
            contentDescription = null,
            tint = bbibic_Grey,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            text = "앞으로 이런 기능들이 추가될 예정이에요.",
            color = bbibic_Grey,
            style = TextStyle(fontSize = 14.sp)
        )
    }
}
@Composable
fun UpcomingFeatureGrid(upcomingFeatureList: MutableList<UpcomingFeatureSet>){
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ){
        upcomingFeatureList.forEach {
                featureSet -> UpcomingFeatureCard(featureSet)
        }
    }

}
@Composable
fun UpcomingFeatureCard(upcomingFeatureSet: UpcomingFeatureSet){
    Surface (
        color = white,
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .shadow(elevation = 2.dp, shape = MaterialTheme.shapes.medium)
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(upcomingFeatureSet.drawable),
                contentDescription = null,
                modifier = Modifier
                    .width(80.dp)
                    .height(60.dp)
                    .clip(MaterialTheme.shapes.medium)
                    .border(2.dp, bbibic_green, MaterialTheme.shapes.medium)
            )
            Spacer(modifier = Modifier.size(8.dp))
            Column{
                Text(text = upcomingFeatureSet.title, color = black, fontWeight = FontWeight.Bold, style = TextStyle(fontSize = 14.sp))
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = upcomingFeatureSet.content, color = black, style = TextStyle(fontSize = 10.sp))
            }
        }
    }
}

data class UpcomingFeatureSet(val title: String, val content: String, val drawable: Int)
val upcomingFeatureList = mutableListOf<UpcomingFeatureSet>(
    UpcomingFeatureSet(
        "공유된 사람과 덕담을 나눌 수 있는\n한마디 위젯을 준비중이에요.",
        "삐빅을 같이 이용하는 분들이 소통할 수 있도록 도와드려요.",
        R.drawable.bbibic_logo_ko
    ),
    UpcomingFeatureSet(
        "건강 기록을 위한\n건강 일지 위젯을 준비중이에요.",
        "몸 상태를 꾸준히 적어서 기록하고 분석할 수 있어요.",
        R.drawable.bbibic_logo_ko
    ),
    UpcomingFeatureSet(
        "공유된 사람과 위치 연동을 할 수 있는\n기능을 준비중이에요.",
        "약속, 응급 시, 길을 잃었을 때 사용할 수 있어요.",
        R.drawable.bbibic_logo_ko
    ),
    UpcomingFeatureSet(
        "공유된 사람과 채팅을 할 수 있는\n기능을 준비중이에요.",
        "앱 내에서 상식을 공유하고, 바로 소통 가능해요.",
        R.drawable.bbibic_logo_ko
    ),
    UpcomingFeatureSet(
        "흔들림 감지 기능을 준비중이에요.",
        "사용자의 비정상적인 움직임을 감지하고, 이를 통해 응급 상황 발생 시 즉각적인 알림을 제공해요.",
        R.drawable.bbibic_logo_ko
    ),
    UpcomingFeatureSet(
        "주변 병원, 약국, 응급 의료시설 찾기\n기능을 준비중이에요.",
        "앱 내에서 주변 병원과 약국을 쉽게 찾을 수 있어요.",
        R.drawable.bbibic_logo_ko
    ),
    UpcomingFeatureSet(
        "날씨, 미세먼지, 온도 등을 보여주는\n위젯을 준비중이에요.",
        "앱 내에서 날씨와 미세먼지 정보를 매일 확인할 수 있어요.",
        R.drawable.bbibic_logo_ko
    ),
)