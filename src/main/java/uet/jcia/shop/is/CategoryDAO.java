package uet.jcia.shop.is;

import java.util.List;

import uet.jcia.shop.is.entities.Category;

public interface CategoryDAO {
	List<Category> getAllCategory();
	Category getCategoryById(Integer categoryId);
	boolean addNewCategory(Category category);
	boolean deleteCategory(Category category);
	boolean updateCategory(Category category);
}
