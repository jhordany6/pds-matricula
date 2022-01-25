package poli.service.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import poli.service.matricula.entities.Project;
import poli.service.matricula.repository.ProjectRepository;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Project> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Project create(Project project) {
        return repository.save(project);
    }
}

