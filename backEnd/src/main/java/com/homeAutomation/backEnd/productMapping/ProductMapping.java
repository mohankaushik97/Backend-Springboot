package com.homeAutomation.backEnd.productMapping;

import com.homeAutomation.backEnd.productDetails.Products;
import com.homeAutomation.backEnd.room.Rooms;
import com.homeAutomation.backEnd.user.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class ProductMapping {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Rooms rooms;
    private Long productState;

    public ProductMapping() {
    }

    public ProductMapping(Long productState) {
        this.productState = productState;
    }

    public Long getProductState() {
        return productState;
    }

    public void setProductState(Long productState) {
        this.productState = productState;
    }

    @Override
    public String toString() {
        return "ProductMapping{" +
                "productState=" + productState +
                '}';
    }
}
