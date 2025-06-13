package com.jellp.etui.impl.fallback.ui.sidebar

import com.intellij.tasks.TaskRepository
import com.jellp.etui.ui.sidebar.extension.TaskListProvider
import javax.swing.JComponent

class FallbackTaskListProvider : TaskListProvider {
    override fun accepts(repository: TaskRepository): Boolean = true

    override fun getTaskList(repository: TaskRepository): JComponent {
        TODO("Not yet implemented")
    }
}