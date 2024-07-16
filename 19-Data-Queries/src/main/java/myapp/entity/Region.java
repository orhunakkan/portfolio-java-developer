package myapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "regions")
@NoArgsConstructor
@Getter
@Setter
public class Region extends BaseEntity {

    private String region;
    private String country;

}
