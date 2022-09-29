package caller;

import exceptions.CouldNotGetObjectException;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public abstract class ACaller<T> implements ICaller {

    protected final List<String> pathParameters;
    protected final Map<String, String> queryParameters;

    protected ACaller() {
        pathParameters = new ArrayList<>();
        queryParameters = new HashMap<>();
    }


    @SuppressWarnings({"unchecked"})
    public CompletableFuture<T> consume() {

        return CompletableFuture.supplyAsync(() -> {
            try {
                String className = ((ParameterizedType) getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0]
                        .getTypeName();
                Class<T> clazz = (Class<T>) Class.forName(className);

                return ACaller.this.getObject(pathParameters, queryParameters, clazz);
            } catch (CouldNotGetObjectException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        });


    }

}