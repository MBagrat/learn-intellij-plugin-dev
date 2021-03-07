package com.github.mbagrat.learnintellijplugindev.services

import com.github.mbagrat.learnintellijplugindev.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
