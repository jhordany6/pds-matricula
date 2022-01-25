package poli.service.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.service.matricula.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
