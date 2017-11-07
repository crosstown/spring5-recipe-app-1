package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/* @author Fernando Simon
   @date 11/3/2017
   @time: 5:38 PM
*/
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
