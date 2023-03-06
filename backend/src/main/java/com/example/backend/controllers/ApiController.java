package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.backend.models.Project;
import com.example.backend.service.ProjectService;

@CrossOrigin
@RestController
public class ApiController {

    @Autowired
    private ProjectService projectService;
    
    @GetMapping("/")
    public Iterable<Project> getProject() {
        return projectService.findAllProjects();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectService.getProjectByID(id);
    }

    @PostMapping("/")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
    }

    @PutMapping("/{id}")
    public void updateProject(@PathVariable int id, @RequestBody Project project) {
        projectService.updateProject(project);
    }
}
