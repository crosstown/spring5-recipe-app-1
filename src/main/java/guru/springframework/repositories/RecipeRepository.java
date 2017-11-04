package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

/* @author Fernando Simon
   @date 11/3/2017
   @time: 8:11 PM
*/
public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}

