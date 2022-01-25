package poli.service.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poli.service.matricula.entities.Backlog;
import poli.service.matricula.repository.BacklogRepository;

import java.util.List;

@Service
public class BacklogServiceImpl implements BacklogService{

    @Autowired
    private BacklogRepository repository;

    @Override
    public List<Backlog> findAll() {
        return repository.findAll();
    }


    @Override
    public void create(Backlog backlog) {
        repository.save(backlog);
    }


}
