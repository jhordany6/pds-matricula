package poli.service.matricula.service;

import poli.service.matricula.entities.Backlog;

import java.util.List;

public interface BacklogService {
    List<Backlog> findAll();
    void create(Backlog backlog);

}
