package cesar.next.aula19.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String date;
    @Column
    private double total;

    @ManyToMany(mappedBy = "pedidos")
    private List<Product> products = new ArrayList<>();

    // @OneToMany(mappedBy = "pedido")
    // @JsonIgnore
    // private List<ProductsPedidos> products = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String date, double total) {
        this.date = date;
        this.total = total;
    }

    // public void addProduct(Product product, int qtd) {
    // ProductsPedidos itemPedido = new ProductsPedidos(product, this, qtd);
    // this.products.add(itemPedido);
    // // product.getPedidos().add(itemPedido);
    // }

    // public void removeTag(Product product) {
    // for (Iterator<ProductsPedidos> iterator = products.iterator();
    // iterator.hasNext();) {
    // ProductsPedidos itemPedidoTmp = iterator.next();

    // if (itemPedidoTmp.getProduct().equals(product) &&
    // itemPedidoTmp.getPedido().equals(this)) {
    // iterator.remove();
    // itemPedidoTmp.getPedido().getProducts().remove(itemPedidoTmp);
    // itemPedidoTmp.setPedido(null);
    // itemPedidoTmp.setProduct(null);
    // }
    // }
    // }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
