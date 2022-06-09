package br.org.cesar.aula22.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ProductTransaction {

    @EmbeddedId
    private ProductTransactionId id = new ProductTransactionId();

    @ManyToOne
    @MapsId("productId")
    private Product product;

    @ManyToOne
    @MapsId("transactionId")
    private Transaction transaction;

    private int amount;

    public ProductTransactionId getId() {
        return id;
    }

    public void setId(ProductTransactionId id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
