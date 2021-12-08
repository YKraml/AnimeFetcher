package main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyObjectMapper {

    private final ObjectMapper objectMapper;

    public MyObjectMapper() {
        this.objectMapper = new ObjectMapper();
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }


    public <T> T map(String data, Class<T> t) throws CouldNotMapException {

        try {
            return objectMapper.readValue(data, t);
        } catch (JsonProcessingException e) {
            throw new CouldNotMapException(data, t);
        }
    }

}
