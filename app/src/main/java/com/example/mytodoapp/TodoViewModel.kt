package com.example.mytodoapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

@RequiresApi(Build.VERSION_CODES.O)
class TodoViewModel: ViewModel(){
    private var _todoList = MutableLiveData<List<Todo>>()
    val todoList : LiveData<List<Todo>> = _todoList

    init {
        getAllTodo()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun getAllTodo(){
        _todoList.value= TodoManager.getAllTodo().reversed()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title : String){
        TodoManager.addTodo(title)
        getAllTodo()

    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun deleteTodo(id : Int){
        TodoManager.deleteTodo(id)
        getAllTodo()
    }
}