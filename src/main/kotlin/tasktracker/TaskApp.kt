package tasktracker

object TaskApp {
    private var running = true

    @JvmStatic
    fun main(args: Array<String>) {
        println("Welcome to Task Tracker!\n")

        while (running) {
            showMenu()
            when (readlnOrNull()?.trim()) {
                "1" -> {
                    print("Enter task title: ")
                    val title = readlnOrNull()?.trim()
                    if (!title.isNullOrEmpty()) TaskManager.addTask(title)
                    else println("Title cannot be empty.\n")
                }
                "2" -> TaskManager.listTasks()
                "3" -> TaskManager.markTaskComplete()
                "4" -> TaskManager.updateTask()
                "5" -> running = false
                else -> println("Invalid option, please try again.\n")
            }
        }

        println("\nGoodbye! 👋")
    }

    private fun showMenu() {
        println(
            """
            Menu:
            1. Add Task
            2. List Tasks
            3. Complete Task
            4. Update Task (Data Class Demo)
            5. Exit
        """.trimIndent()
        )
        print("Select an option: ")
    }
}
