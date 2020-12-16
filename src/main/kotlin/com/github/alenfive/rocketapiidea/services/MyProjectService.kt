package com.github.alenfive.rocketapiidea.services

import com.intellij.openapi.project.Project
import com.github.alenfive.rocketapiidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
