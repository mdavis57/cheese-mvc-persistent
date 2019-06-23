package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.transaction.Transactional;

@Entity
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
