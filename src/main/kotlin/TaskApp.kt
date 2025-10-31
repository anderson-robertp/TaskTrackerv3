package tasktracker

// Represents a single task
class Task(val title: String, var isCompleted: Boolean = false) {
    fun complete() {
        isCompleted = true
    }

    override fun toString(): String {
        val status = if (isCompleted) "✅ Done" else "🕓 Pending"
        return "$title - $status"
    }
}

// Main application object
object TaskApp {
    private val tasks = mutableListOf<Task>()
    private var running = true

    @JvmStatic
    fun main(args: Array<String>) {
        println("Welcome to Task Tracker!\n")

        while (running) {
            showMenu()
            print("Choose an option: ")
            when (readLine()?.trim()) {
                "1" -> addTask()
                "2" -> viewTasks()
                "3" -> completeTask()
                "4" -> showSummary()
                "5" -> exitApp()
                else -> println("Invalid option. Please try again.\n")
            }
        }
    }

    private fun showMenu() {
        println(
            """
            === Menu ===
            1. Add Task
            2. View Tasks
            3. Complete Task
            4. Summary
            5. Exit
            """.trimIndent()
        )
    }

    private fun addTask() {
        print("Enter task name: ")
        val title = readLine()?.trim().orEmpty()
        if (title.isNotEmpty()) {
            tasks.add(Task(title))
            println("Task '$title' added!\n")
        } else {
            println("Task name cannot be empty.\n")
        }
    }

    private fun viewTasks() {
        if (tasks.isEmpty()) {
            println("No tasks yet.\n")
        } else {
            println("Your Tasks:")
            tasks.forEachIndexed { index, task ->
                println("${index + 1}. $task")
            }
            println()
        }
    }

    private fun completeTask() {
        if (tasks.isEmpty()) {
            println("No tasks to complete.\n")
            return
        }

        print("Enter task number to complete: ")
        val index = readLine()?.toIntOrNull()
        if (index != null && index in 1..tasks.size) {
            tasks[index - 1].complete()
            println("Task marked as done!\n")
        } else {
            println("Invalid task number.\n")
        }
    }

    private fun showSummary() {
        val done = tasks.count { it.isCompleted }
        val total = tasks.size
        val percent = if (total > 0) (done * 100) / total else 0
        println("Progress: $done of $total tasks done ($percent%)\n")
    }

    private fun exitApp() {
        println("Goodbye! 👋")
        running = false
    }
}
