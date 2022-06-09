package br.org.cesar.aula22.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ProductTransactionId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;
    private Long transactionId;

    public ProductTransactionId() {
    }

    public ProductTransactionId(Long productId, Long transactionId) {
        this.productId = productId;
        this.transactionId = transactionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((productId == null) ? 0 : productId.hashCode());
        result = prime * result
                + ((transactionId == null) ? 0 : transactionId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductTransactionId other = (ProductTransactionId) obj;
        return Objects.equals(getProductId(), other.getProductId())
                && Objects.equals(getTransactionId(), other.getTransactionId());
    }
}
