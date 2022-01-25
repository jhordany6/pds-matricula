package poli.service.matricula.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "project")
public class Project extends EntityBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "project_name", unique = true)
    @Size(min = 1)
    private String projectName;

    @Column(name = "project_identifier", unique = true, updatable = false)
    @Size(min = 5, max = 7)
    @NotEmpty(message = "El campo no puede estar vacio")
    private String projectIdentifier;

    @Column(name = "description")
    private String description;

    @Column(name = "star_Date")
    private Date starDate;

    //falta los campos de date

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Backlog_id")
    private Backlog backlog;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
