package uet.jcia.shop.is.entities;

public class ProductToSpec {
    private Integer productId;
    private Integer specId;
    private String value;
    
    public ProductToSpec() {
    }

    public ProductToSpec(Integer productId, Integer specId, String value) {
        super();
        this.productId = productId;
        this.specId = specId;
        this.value = value;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ProductToSpec [productId=" + productId + ", specId=" + specId + ", value=" + value + "]";
    }
    
}
