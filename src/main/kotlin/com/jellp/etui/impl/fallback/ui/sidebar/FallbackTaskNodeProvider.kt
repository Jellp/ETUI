package com.jellp.etui.impl.fallback.ui.sidebar

import com.intellij.tasks.Task
import com.jellp.etui.ui.sidebar.extension.TaskNodeProvider

/**
 * Provides a basic layout for any task type
 *
 * This node provider is hard-coded to be used when no other node providers are available.
 */
class FallbackTaskNodeProvider : TaskNodeProvider<Task> {
    override fun accepts(task: Task): Boolean = true

    override fun getChildren(
        parent: Task,
        allTasks: List<Task>
    ): List<Task> = emptyList()

    override fun getParent(
        task: Task,
        allTasks: List<Task>
    ): Task? = null

    override fun getNodeText(task: Task): String = task.presentableName
}