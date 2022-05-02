package caller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeSearchTermBuilderTest {

    AnimeSearchTermBuilder builder;


    @BeforeEach
    public void init(){
        builder = new AnimeSearchTermBuilder();
    }

    @Test
    public void test1(){

        builder.setMinScore(8).setMaxScore(9);

        System.out.println(builder.buildTerm());

    }


}