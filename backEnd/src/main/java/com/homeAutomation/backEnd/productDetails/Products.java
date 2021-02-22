package com.homeAutomation.backEnd.productDetails;

import javax.persistence.*;

@Entity
@Table
public class Products {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long productId;
    private String name;

    public Products() {
    }

    public Products(Long id, String name) {
        this.productId = id;
        this.name = name;
    }

    public Products(String name) {
        this.name = name;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + productId +
                ", name='" + name + '\'' +
                '}';
    }
}
