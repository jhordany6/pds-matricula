package poli.service.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poli.service.matricula.entities.ProjectTask;
import poli.service.matricula.service.ProjectTaskService;

@RestController
@RequestMapping("/projectTask")
public class ProjectTaskController {

    @Autowired
    private ProjectTaskService service;


    @PostMapping
    public ProjectTask create(@RequestBody ProjectTask projectTask){
        return service.create(projectTask);
    }
}
