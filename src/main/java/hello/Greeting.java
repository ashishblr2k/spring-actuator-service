package hello;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by agup101 on 4/20/2017.
 */
@AllArgsConstructor
@Getter
public class Greeting {
    private final long id;
    private final String content;
}
