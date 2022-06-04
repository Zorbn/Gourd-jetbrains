package com.github.zorbn.gourdjetbrains.services

import com.intellij.openapi.project.Project
import com.github.zorbn.gourdjetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
