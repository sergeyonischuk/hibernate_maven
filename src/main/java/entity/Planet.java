package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Column(name="id")
    @Pattern(regexp = "^[A-Z0-9]+$")
    @Size(min = 1, max = 255)
    private String id;

    @Column(name = "name")
    @Size(min = 1, max = 500)
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "planetTo")
    List<Ticket> ticketsTo;

    @ToString.Exclude
    @OneToMany(mappedBy = "planetFrom")
    List<Ticket> ticketsFrom;
}
