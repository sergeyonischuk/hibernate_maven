package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Data
@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Column(name="id")
    private String id;
    @Column(name = "name")
    private String name;
}
