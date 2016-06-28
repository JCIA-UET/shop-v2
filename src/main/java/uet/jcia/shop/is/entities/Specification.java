package uet.jcia.shop.is.entities;

public class Specification {
    private Integer specId;
    private String name;
    
    public Specification(String name) {
        super();
        this.name = name;
    }
    
    public Specification() {
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Specification [specId=" + specId + ", name=" + name + "]";
    }
    
}