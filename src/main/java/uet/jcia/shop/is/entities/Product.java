package uet.jcia.shop.is.entities;

import java.util.Date;

public class Product {
    private Integer productId;
    private Integer categoryId;
    private Integer quantity;
    private Integer status;
    
    private Double price;
    
    private String name;
    private String description;
    private String model;
    private String image;
    
    private Date addedDate;
    private Date modifiedDate;
    
    public Product() {
    }

    public Product(Integer categoryId, Integer quantity, Integer status, Double price, String name, String description,
            String model, String image, Date addedDate, Date modifiedDate) {
        super();
        this.categoryId = categoryId;
        this.quantity = quantity;
        this.status = status;
        this.price = price;
        this.name = name;
        this.description = description;
        this.model = model;
        this.image = image;
        this.addedDate = addedDate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", categoryId=" + categoryId + ", quantity=" + quantity + ", status="
                + status + ", price=" + price + ", name=" + name + ", description=" + description + ", model=" + model
                + ", image=" + image + ", addedDate=" + addedDate + ", modifiedDate=" + modifiedDate + "]";
    }
    
}
