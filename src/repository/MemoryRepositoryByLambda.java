package repository;

import java.util.Objects;
import java.util.function.Function;

//12.1
public class MemoryRepositoryByLambda<T> extends MemoryRepository<T>{
    private Function<T, Integer> getIdLambda;

    public MemoryRepositoryByLambda(Function<T, Integer> getIdLambda) {
        this.getIdLambda = getIdLambda;
    }

    //12.2


    public Function<T, Integer> getGetIdLambda() {
        return getIdLambda;
    }

    public void setGetIdLambda(Function<T, Integer> getIdLambda) {
        this.getIdLambda = getIdLambda;
    }
    @Override
    public int getId(T obj) {
        return getIdLambda.apply(obj);
    }


}
