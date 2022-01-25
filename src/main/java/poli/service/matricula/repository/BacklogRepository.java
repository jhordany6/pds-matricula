package poli.service.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.service.matricula.entities.Backlog;

@Repository
public interface BacklogRepository extends JpaRepository<Backlog,Long> {
}
