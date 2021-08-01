package com.github.ioexceptions.dhgplugin.services

import com.github.ioexceptions.dhgplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
