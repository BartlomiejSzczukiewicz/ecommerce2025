package pl.bszczuk.hello;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @Test
    void helloTest() {
        //A / Arrange  / Given
        var a = 2;
        var b = 4;
        //A / Act      / When
        var result = a + b;
        //A / Assert   / Then / Expected
        assert 6 == result;
    }

    @Test
    void itFail() {
        //A / Arrange  / Given
        var a = 2;
        var b = 4;
        //A / Act      / When
        var result = a + b;
        //A / Assert   / Then / Expected
        assert 10 == result;

        // it's intended for it to fail, so don't worry!
    }

    @Test
    void itGreetUsername() {
        //Arrange
        String name = "Siemanko";
        //Act
        String message = String.format("Hello %s", name);
        //Assert
        assertEquals("Hello Siemanko", message);
    }

    @Test
    void listExpectedToBeEmpty() {
        var list = new ArrayList<>();

        list.add("Bart");
        list.remove(0);

        assert list.isEmpty();
    }
}
