package com.example.mytodoapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
//import np.com.bimalkafle.todoapp.ui.theme.TodoAppTheme
import com.example.mytodoapp.ui.theme.MyTodoAppTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val todoViewModel= ViewModelProvider(this).get(TodoViewModel::class.java)
        setContent {
            MyTodoAppTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                    color = androidx.compose.ui.graphics.Color.White) {
                    TodoListPage(todoViewModel)
                }
            }
        }
    }
}

