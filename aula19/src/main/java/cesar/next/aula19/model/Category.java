package cesar.next.aula19.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private String description;

    @OneToMany
    private Collection<Product> products;
}
