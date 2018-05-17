package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by alex.andrade on 17/05/2018.
 */
@Component
public class Bootstrap implements CommandLineRunner {
    private CategoryRepository categoryRepository;

    public Bootstrap(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Category fruits = new Category();
        fruits.setName("fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        System.out.println("Data loaded = " + categoryRepository.count());
    }
}
