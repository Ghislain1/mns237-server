package org.mns237;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

//@SpringBootTest  see https://howtodoinjava.com/spring-boot2/testing/junit5-with-spring-boot2
public class MnsApplicationTest {
  Calculator underTest = new Calculator();

  @Test
  public void itShouldAddNumbers() {
    // given
    int numberOne = 20;
    int numberTwo = 30;

    //when
    int result = underTest.add(numberOne, numberTwo);

    //then
    int expected = 50;
    assertThat(result).isEqualTo(expected);
  }

  class Calculator{
    int add(int a, int b){
      return a+b;
    }
  }

}