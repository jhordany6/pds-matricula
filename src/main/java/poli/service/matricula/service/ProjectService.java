package poli.service.matricula.service;

import poli.service.matricula.entities.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAll();
    Project create(Project project);

}
