package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ScoresAverageTest {

  private static Object[][] scoresAverage() {
    return new Object[][]{

        {4,new int[]{3, 4, 5, 1, 2, 3}}
    };
  }

  @ParameterizedTest(name = "expected {0}, inputted {1}")
  @MethodSource
  void scoresAverage(int expected, int[] input) {

    int actual = ScoresAverage.scoresAverage(input);

    assertEquals(expected,actual);
  }
}