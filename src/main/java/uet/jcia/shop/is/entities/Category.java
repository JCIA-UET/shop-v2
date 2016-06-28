package uet.jcia.shop.is.entities;

public class Category {
	private Integer categoryId;
	private Integer parentId;
	private String name;
	private String description;
	
	public Category() {
		
	}
	
	public Category(Integer parentId, String name, String description) {
		this.parentId = parentId;
		this.name = name;
		this.description = description;
	}
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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

	@Override
	public String toString() {
		return "Category [getCategoryId()=" + getCategoryId() + ", getParentId()=" + getParentId() + ", getName()="
				+ getName() + ", getDescription()=" + getDescription() + "]";
	}
	
	
}
