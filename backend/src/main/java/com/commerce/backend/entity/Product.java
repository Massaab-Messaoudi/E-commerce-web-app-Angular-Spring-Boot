package com.commerce.backend.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;

@Entity
public class Product implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private long id;
    private String productName;
    private String productCategory;
    private String productDescription;
    private String imageUrl;
    private boolean active;
    private int unitsinStock;
    @CreationTimestamp
    private Date dateCreated;
    @UpdateTimestamp
    private Date lastUpdated;
    public long getId() {
        return id;
    }
    public String getproductName() {
        return productName;
    }
    public String getproductCategory() {
        return productCategory;
    }
    public String getproductDescription() {
        return productDescription;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public boolean isActive() {
        return active;
    }
    public int getUnitsinStock() {
        return unitsinStock;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    @Override
    public String toString() {
        return "Product [productCategory=" + productCategory + ", productDescription=" + productDescription
                + ", ProductName=" + productName + ", active=" + active + ", dateCreated=" + dateCreated + ", id=" + id
                + ", imageUrl=" + imageUrl + ", lastUpdated=" + lastUpdated + ", unitsinStock=" + unitsinStock + "]";
    }
    
}
