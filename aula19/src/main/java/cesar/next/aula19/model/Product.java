package cesar.next.aula19.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private double price;
    @Column
    private int amountService;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonBackReference
    private Category category;

    // @JsonBackReference
    @ManyToMany(mappedBy = "products")
    // @JoinTable(name = "products_pedidos", joinColumns = @JoinColumn(name =
    // "pedidos_id", referencedColumnName = "id"), inverseJoinColumns =
    // @JoinColumn(name = "products_id", referencedColumnName = "id"))
    private List<Pedido> pedidos = new ArrayList<>();

    // @OneToMany(mappedBy = "product")
    // private List<ProductsPedidos> pedidos = new ArrayList<>();

    public Product() {
    }

    public Product(String name, String description, double price, int amountService) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountService = amountService;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountService() {
        return amountService;
    }

    public void setAmountService(int amountService) {
        this.amountService = amountService;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
