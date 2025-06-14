package com.jellp.etui.ui.sidebar

import com.intellij.openapi.extensions.ExtensionPointName
import com.intellij.tasks.Task
import com.jellp.etui.impl.fallback.ui.sidebar.FallbackTaskNodeProvider
import com.jellp.etui.ui.sidebar.extension.TaskNodeProvider

class TaskSidebar(private val tasks: List<Task>) {

    // TODO: Make this an actual sidebar

    private fun retrieveTaskNodeProvider() =
        taskListProviders.findFirstSafe { it.accepts(tasks.first()) } ?: FallbackTaskNodeProvider()

    companion object {
        private val taskListProviders: ExtensionPointName<TaskNodeProvider<Task>> =
            ExtensionPointName.create("com.jellp.etui.taskNodeProvider")
    }
}