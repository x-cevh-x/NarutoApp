package com.example.narutodataapp.ScreenPJ

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.narutodataapp.R
import com.example.narutodataapp.model.Personaje
import com.example.narutodataapp.model.ResourcePj

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonajeApp() {
    PersonajesList(pj = ResourcePj.pj)
}
@ExperimentalMaterial3Api
@Composable
fun PersonajesList(pj:List<Personaje>){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Row {
                    Text(text = "Naruto Heroes")
                }
            })
        }

    ) {it
        LazyColumn(contentPadding = it){
            items(pj){
                CardPersonaje(pj = it)
            }
        }
    }

}

@Composable
fun CardPersonaje(
    pj: Personaje,
    modifier: Modifier = Modifier,
    elevation: CardElevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
    shape: CornerBasedShape = MaterialTheme.shapes.medium,

) {
    var expanded by remember{ mutableStateOf(false) }
    Card(
        shape = shape,
        elevation = elevation,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
        modifier = modifier
            .padding(8.dp)
    ){
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 4.dp)

            ) {
                Box(
                    modifier = Modifier
                        .padding(4.dp),
                    contentAlignment = Alignment.Center
                ){
                    //Imagen avatar
                    Image(
                        painter = painterResource(id = pj.logo),
                        contentDescription = null,
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Blue, shape = CircleShape)
                        )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = stringResource(id = pj.name),
                    style = MaterialTheme.typography.titleLarge
                    )
            }
            Column {
                Image(
                    painter = painterResource(id = pj.Img),
                    contentDescription = null,
                )
                Text(
                    text = stringResource(id = pj.desImg),
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = stringResource(id = pj.desc),
                maxLines = if(expanded) Int.MAX_VALUE else 3,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.bodyLarge,
                modifier =  Modifier
                    .clickable { expanded = !expanded }
            )
        }
    }
}

