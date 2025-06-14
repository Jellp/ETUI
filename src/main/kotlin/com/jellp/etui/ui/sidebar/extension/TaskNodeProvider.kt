package com.jellp.etui.ui.sidebar.extension

import com.intellij.tasks.Task

/**
 * Extension point for other plugins to create task lists.
 */
interface TaskNodeProvider<T: Task> {
    fun accepts(task:T): Boolean

    fun getChildren(parent: T, allTasks: List<T>): List<T>
    fun getParent(task: T, allTasks: List<T>): T?

    fun getNodeText(task: T): String

    // TODO: Attributes for background, text color/style
}