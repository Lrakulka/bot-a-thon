package ca.canadiantire.nine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.canadiantire.nine.domain.Category;
import ca.canadiantire.nine.dao.CategoryRepository;

/**
 * @author Victor Letunovsky (@vletunovsky)
 */
@Service
public class CatalogService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(final Long categoryId) {
        return categoryRepository.findOne(categoryId);
    }

}
