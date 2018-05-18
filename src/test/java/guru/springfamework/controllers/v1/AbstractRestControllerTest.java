package guru.springfamework.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by alex.andrade on 18/05/2018.
 */
public abstract class AbstractRestControllerTest {
    public static String asJsonString(final Object obj){
        try{
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
