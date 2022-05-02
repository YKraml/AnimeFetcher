package caller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharactersSearchTermBuilderTest {


    CharactersSearchTermBuilder builder;

    @BeforeEach
    public void init(){
        builder = new CharactersSearchTermBuilder();
    }

    @Test
    public void test1(){
        Assertions.assertEquals("characters/", builder.buildTerm());
    }

    @Test
    public void test2(){
        builder.setLimit(5);
        Assertions.assertEquals("characters/?limit=5", builder.buildTerm());
    }

}