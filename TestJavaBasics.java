import java.util.Arrays;
import java.util.ArrayList;

class TestJavaBasics {
  public static void main(String[] args){
    JavaBasics javaBasics = new JavaBasics();
    javaBasics.print1to255();

    javaBasics.printOdd1to255();

    javaBasics.printSum();

    int[] myArray = {1,3,5,7,9,13};
    javaBasics.iterateThruArray(myArray);

    int[] myArray2 = {-3, 5, -7};
    // javaBasics.findMax(myArray2);

    int[] myArray3 = {2,10,3};
    javaBasics.getAverage(myArray3);

    javaBasics.arrayWithOddNumbers();

    int[] myArray4 = {1,3,5,7};
    int y = 3;
    int count = javaBasics.greaterThanY(myArray4, y);
    System.out.println(count);

    int[] x = {1,5,10,-2};
    javaBasics.squareTheValues(x);

    int[] x2 = {1,5,10,-2};
    javaBasics.eliminateNegativeNumbers(x2);
    System.out.println(Arrays.toString(x2));

    double[] x3 = {1,5,10,-2};
    double[] maxMinAvg = javaBasics.maxMinAvg(x3);
    System.out.println(Arrays.toString(maxMinAvg));

    int[] x4 = {1,5,10,7,-2};
    ArrayList<Integer> x5 = javaBasics.shiftValsInArray(x4);
    System.out.println(x5);

  }
}
