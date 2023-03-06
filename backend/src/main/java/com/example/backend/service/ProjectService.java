package com.example.backend.service;

import com.example.backend.repo.ProjectRepo;
import org.springframework.stereotype.Service;
import com.example.backend.models.Project;

@Service
public class ProjectService {
    private final ProjectRepo projectRepo;

    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project createProject(Project project) {
        return projectRepo.save(project);
    }

    public Iterable<Project> findAllProjects() {
        return projectRepo.findAll();
    }

    public Project getProjectByID(int id) {
        return projectRepo.findById(id).orElse(null);
    }

    public void deleteProject(int id) {
        projectRepo.deleteById(id);
    }

    public void updateProject(Project project) {
        projectRepo.saveAndFlush(project);
    }
}
