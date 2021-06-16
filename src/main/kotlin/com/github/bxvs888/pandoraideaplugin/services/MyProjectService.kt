package com.github.bxvs888.pandoraideaplugin.services

import com.github.bxvs888.pandoraideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
