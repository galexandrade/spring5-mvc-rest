package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by alex.andrade on 18/05/2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryListDTO {
    List<CategoryDTO> categories;
}
