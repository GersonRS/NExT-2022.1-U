package cesar.next.aula19.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Order {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String date;
    @Column
    private double total;

    @ManyToMany
    private List<Product> products;

}
