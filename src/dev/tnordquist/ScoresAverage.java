package dev.tnordquist;

/**
 * Given an array of scores, compute the int average of the first half and the second half, and
 * return whichever is larger. We'll say that the second half begins at index length/2. The array
 * length will be at least 2. To practice decomposition, write a separate helper method int
 * average(int[] scores, int start, int end) { which computes the average of the elements between
 * indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper
 * method after your scoresAverage() method in the JavaBat text area. Normally you would compute
 * averages with doubles, but here we use ints so the expected results are exact.
 */

public class ScoresAverage {

  /*
  Computes the half of the scores of an array that has the higher average.
   */
  public static int scoresAverage(int[] scores) {

    int startFirst = 0;
    int endFirst = scores.length/2;
    int startSecond = endFirst;
    int endSecond = scores.length;
    int avg1 = average(scores,startFirst,endFirst);
    int avg2 = average(scores,startSecond,endSecond);


    if(avg1>avg2){
      return avg1;
    } else {
      return avg2;
    }

  }

  /*
  Helper method
   */
  private static int average(int[] scores, int start, int end) {

    int average = 0;
    int divisor = 0;
    int sum = 0;

    for (int i = start; i < end; ++i) {
      divisor++;
      sum+=scores[i];
    }
    average = sum/divisor;
    return average;
  }

}
