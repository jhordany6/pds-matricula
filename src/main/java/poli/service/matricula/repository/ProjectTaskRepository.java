package poli.service.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.service.matricula.entities.ProjectTask;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask,Long> {
}
