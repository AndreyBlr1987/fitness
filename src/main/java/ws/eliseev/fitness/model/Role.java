package ws.eliseev.fitness.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
public class Role {
    @Id
    // Need? @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    private Long id;

    @Column (name = "NAME")
    private String name;

    @ManyToMany(mappedBy = "roleSet", fetch = FetchType.LAZY)
    private Set<User> userSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return this.getName().equals(role.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }
}
