package za.ac.cput.project3assignment.controller;

/* Stephanie Tola Oluwafemi Lewu
230211216
Payment Factory Class
16/08/2026
 */

import org.springframework.web.bind.annotation.*;
import za.ac.cput.project3assignment.domain.Category;
import za.ac.cput.project3assignment.domain.Payment;
import za.ac.cput.project3assignment.service.CategoryService;
import za.ac.cput.project3assignment.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "http://localhost:5173")

public class CategoryController {

    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @GetMapping("/categoryId")
    public Category read(@PathVariable String categoryId) {
        return categoryService.read(categoryId);
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @PutMapping
    public Category update(@RequestBody Category category) {
        return categoryService.update(category);
    }

    @DeleteMapping("categoryId")
    public void delete(@PathVariable String categoryId) {
        categoryService.delete(categoryId);
    }

}
