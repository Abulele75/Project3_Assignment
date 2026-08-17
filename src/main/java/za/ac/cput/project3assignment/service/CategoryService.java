package za.ac.cput.project3assignment.service;

/* Stephanie Lewu
230211216
Payment Factory Class
16/08/2026
 */

import org.springframework.stereotype.Service;
import za.ac.cput.project3assignment.domain.Category;
import za.ac.cput.project3assignment.domain.Payment;
import za.ac.cput.project3assignment.repository.CartRepository;
import za.ac.cput.project3assignment.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category category) {
        if (category == null) {
            throw new NullPointerException("Category cannot be empty");
        }
        return categoryRepository.save(category);
    }

    @Override
    public Category read(String categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();}

    @Override
    public Category update(Category category){
        if (category == null) {
            throw new NullPointerException("Category cannot be null");
        }
        return  categoryRepository.save(category);
    }

    @Override
    public void delete(String categoryId){
        categoryRepository.deleteById(categoryId);
    }


}
