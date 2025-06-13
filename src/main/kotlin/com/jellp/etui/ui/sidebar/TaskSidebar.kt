package com.jellp.etui.ui.sidebar

import com.intellij.openapi.extensions.ExtensionPointName
import com.intellij.tasks.TaskRepository
import com.jellp.etui.impl.fallback.ui.sidebar.FallbackTaskListProvider
import com.jellp.etui.ui.sidebar.extension.TaskListProvider

class TaskSidebar(private val repository: TaskRepository) {

    // TODO: Make this an actual sidebar

    private fun retrieveTaskListProvider() =
        taskListProviders.findFirstSafe { it.accepts(repository) } ?: FallbackTaskListProvider()

    companion object {
        private val taskListProviders: ExtensionPointName<TaskListProvider> =
            ExtensionPointName.create("com.jellp.etui.taskListProvider")
    }
}