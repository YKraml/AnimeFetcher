package main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

public class MyObjectMapper {

    private final ObjectMapper objectMapper;

    public MyObjectMapper() {
        this.objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }


    public <T> Optional<T> map(String data, Class<T> t){

        try {
            T mappedObject = objectMapper.readValue(data, t);
            return Optional.ofNullable(mappedObject);
        } catch (JsonProcessingException e) {
            System.out.println("Could not map to " + t.getName() + " | " + data);
            System.out.println(e.getMessage());
        }


        return Optional.empty();
    }

}
