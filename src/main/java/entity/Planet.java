package entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name = "Planet")
public class Planet {
    @Id
    private String id;
    private String name;
}
