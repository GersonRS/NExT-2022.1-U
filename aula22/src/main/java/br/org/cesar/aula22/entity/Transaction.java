package br.org.cesar.aula22.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int total_to_pay;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "credit_card_id")
    private CreditCard creditCard;

    // @ManyToMany
    // private Set<Product> products = new HashSet<>();

    @OneToMany(mappedBy = "transaction")
    private Set<ProductTransaction> productTransactions = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getTotal_to_pa() {
        return total_to_pay;
    }

    public void setTotal_to_pa(int total_to_pay) {
        this.total_to_pay = total_to_pay;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Set<ProductTransaction> getProductTransactions() {
        return productTransactions;
    }

    public void setProductTransactions(Set<ProductTransaction> productTransactions) {
        this.productTransactions = productTransactions;
    }

}
