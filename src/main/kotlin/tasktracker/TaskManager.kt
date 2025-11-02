package tasktracker

object TaskManager {
    private val tasks = mutableListOf<Task>()

    fun addTask(title: String) {
        val task = Task(title)
        tasks.add(task)
        println("Task added: $task\n")
    }

    fun listTasks() {
        if (tasks.isEmpty()) {
            println("No tasks found.\n")
            return
        }

        println("\nYour Tasks:")
        tasks.forEachIndexed { index, task ->
            println("${index + 1}. $task")
        }
        println()
    }

    fun markTaskComplete() {
        listTasks()
        if (tasks.isEmpty()) return

        print("Enter task number to mark complete: ")
        val input = readlnOrNull()?.toIntOrNull()
        if (input == null || input !in 1..tasks.size) {
            println("Invalid selection.\n")
            return
        }

        tasks[input - 1].complete()
        println("Task marked complete: ${tasks[input - 1]}\n")
    }

    fun updateTask() {
        listTasks()
        if (tasks.isEmpty()) return

        print("Enter task number to update: ")
        val input = readlnOrNull()?.toIntOrNull()
        if (input == null || input !in 1..tasks.size) {
            println("Invalid selection.\n")
            return
        }

        val oldTask = tasks[input - 1]
        print("Enter new title (leave blank to keep '${oldTask.title}'): ")
        val newTitle = readlnOrNull()?.trim()

        print("Mark as complete? (y/n, leave blank to keep current): ")
        val completeInput = readlnOrNull()?.trim()?.lowercase()

        val newCompletion = when (completeInput) {
            "y" -> true
            "n" -> false
            else -> oldTask.isCompleted
        }

        // Demonstrate data class copy!
        val updatedTask = oldTask.copy(
            title = if (!newTitle.isNullOrEmpty()) newTitle else oldTask.title,
            isCompleted = newCompletion
        )

        tasks[input - 1] = updatedTask
        println("Updated task using data class copy:\n$updatedTask\n")
    }

    fun removeTask() {
        listTasks()
        if (tasks.isEmpty()) return
        print("Enter task number to remove: ")
        val input = readlnOrNull()?.toIntOrNull()
        if (input == null || input !in 1..tasks.size) {
            println("Invalid selection.\n")
            return
        }
        tasks.removeAt(input - 1)
        println("Task removed.\n")
    }
}
