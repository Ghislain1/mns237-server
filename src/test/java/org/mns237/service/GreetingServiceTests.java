package org.mns237.service;

 import static org.junit.jupiter.api.Assertions.assertEquals; //we DO NOT need it anymore because we use fluent assertion
// entry point for all assertThat methods and utility methods (e.g. entry)
 import static org.assertj.core.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GreetingServiceTests {
    @Test
    @DisplayName("Say hello")
    void sayHello() {
        GreetingService greetingService = new GreetingService();

        assertThat(greetingService.getGreet()).isEqualTo("Hello");
        //assertEquals("Hello", greetingService.getGreet());
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        GreetingService greetingService = new GreetingService();

        int result=  greetingService.add(first, second);
        assertThat(result).isEqualTo(expectedResult);
      

    }

}
