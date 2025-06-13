package com.jellp.etui.ui.sidebar.extension

import com.intellij.tasks.TaskRepository
import javax.swing.JComponent

/**
 * Extension point for other plugins to create task lists.
 */
interface TaskListProvider {
    fun accepts(repository: TaskRepository): Boolean

    fun getTaskList(repository: TaskRepository): JComponent
}