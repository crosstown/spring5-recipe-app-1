package guru.springframework.domain;

/* @author Fernando Simon
   @date 11/3/2017
   @time: 7:40 PM
*/

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories" )
    private Set<Recipe> recipes;

}
