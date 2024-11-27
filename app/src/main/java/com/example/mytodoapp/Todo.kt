package com.example.mytodoapp

import java.util.Date

data class Todo(
    var id : Int,
    var title : String,
    var createdAt : Date
)

fun getFaketodo(): List<Todo> {
    return listOf(
        Todo(1, "Prepare presentation for meeting", Date()),
        Todo(2, "Finish report on project progress", Date()),
        Todo(3, "Schedule follow-up call with client", Date()),
        Todo(4, "Review and update project timeline", Date()),
        Todo(5, "Prepare agenda for team meeting", Date()),
        Todo(6, "Research new software tools for development", Date()),
        Todo(7, "Send feedback to team members on recent work", Date()),
        Todo(8, "Draft proposal for new project", Date()),
        Todo(9, "Attend training session on agile methodologies", Date()),
        Todo(10, "Plan and organize team building activity", Date()),
        Todo(11, "Review and finalize budget for next quarter", Date()),
        Todo(12, "Update documentation for software release", Date())
    )
}
