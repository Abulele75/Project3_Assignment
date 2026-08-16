package za.ac.cput.project3assignment.service;

/* Stephanie Lewu
230211216
Payment Factory Class
16/08/2026
 */


import za.ac.cput.project3assignment.domain.Category;

import java.util.List;

public interface ICategoryService {

    Category create(Category category);
    Category read(String categoryId);
    List<Category> getAll();
    Category update(Category category);
    void delete(String categoryId);
}
