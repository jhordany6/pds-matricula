package poli.service.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poli.service.matricula.entities.ProjectTask;
import poli.service.matricula.repository.ProjectTaskRepository;

@Service
public class ProjectTaskServiceImpl implements ProjectTaskService{

    @Autowired
    private ProjectTaskRepository repository;

    @Override
    public ProjectTask create(ProjectTask projectTask) {
        return repository.save(projectTask);
    }


}
