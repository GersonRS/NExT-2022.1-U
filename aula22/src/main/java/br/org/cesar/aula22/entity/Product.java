package br.org.cesar.aula22.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private int price;
    private String zipcode;
    private String seller;
    private String thumbnailHd;
    private String date;

    // @ManyToMany(mappedBy = "products")
    // private Set<Transaction> transactions = new HashSet<>();

    @OneToMany(mappedBy = "product")
    private Set<ProductTransaction> productTransactions = new HashSet<>();

    public Product() {
    }

    public Product(String title, int price, String zipcode, String seller, String thumbnailHd, String date) {
        this.title = title;
        this.price = price;
        this.zipcode = zipcode;
        this.seller = seller;
        this.thumbnailHd = thumbnailHd;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getThumbnailHd() {
        return thumbnailHd;
    }

    public void setThumbnailHd(String thumbnailHd) {
        this.thumbnailHd = thumbnailHd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Set<ProductTransaction> getProductTransactions() {
        return productTransactions;
    }

    public void setProductTransactions(Set<ProductTransaction> productTransactions) {
        this.productTransactions = productTransactions;
    }

}
