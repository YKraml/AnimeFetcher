package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.CouldNotMapException;

public class MyObjectMapper {

    private final ObjectMapper objectMapper;

    public MyObjectMapper() {
        this.objectMapper = new ObjectMapper();
    }


    public <T> T map(String data, Class<T> t) throws CouldNotMapException {

        try {
            return objectMapper.readValue(data, t);
        } catch (JsonProcessingException e) {
            throw new CouldNotMapException(e, data, t);
        }
    }

}
