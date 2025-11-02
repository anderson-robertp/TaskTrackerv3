package tasktracker

// Data class to represent a task
data class Task(val title: String, var isCompleted: Boolean = false) {
    fun complete() {
        isCompleted = true
    }

    override fun toString(): String {
        val status = if (isCompleted) "✅ Done" else "🕓 Pending"
        return "$title - $status"
    }
}
