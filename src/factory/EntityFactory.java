package factory;

import java.io.IOException;

//10.6
public interface EntityFactory<T> {
    T create() throws IOException;
}
