import java.util.ArrayList;
import java.util.Arrays;

public class JavaBasics {
  public void print1to255() {
    for (int i = 1; i <= 255; i++){
      System.out.println(i);
    }
  }

  public void printOdd1to255(){
    for (int i = 1; i <= 255; i++){
      if (i % 2 != 0){
        System.out.println(i);
      }
    }
  }

  public void printSum(){
    int sum = 0;
    for (int i = 1; i <= 255; i++){
      sum += i;
      System.out.println("New number: " + i + " Sum: " + sum);
    }
  }

  public void iterateThruArray(int[] array){
    for (int element: array){
      System.out.println(element);
    }
  }

  public void findMax(int[] array){
    int max = array[0];
    for (int element: array){
      if (element > max){
        max = element;
      }
    }
    System.out.println(max);
  }

  public void getAverage(int[] array){
    int sum = array[0];
    int length = 0;
    for (int element: array){
      sum += element;
      length++;
    }
    int avg = sum/length;
    System.out.println(avg);
  }

  public void arrayWithOddNumbers(){
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 1; i < 256; i++){
      if (i % 2 != 0){
        y.add(i);
      }
    }
    System.out.println(y);
  }

  public int greaterThanY(int[] array, int y){
    int count = 0;
    for (int element: array){
      if (element > y){
        count++;
      }
    }
    return count;

  }

  public void squareTheValues(int[] x){
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int element: x){
      y.add(element*element);
    }
    System.out.println(y);
  }

  public int[] eliminateNegativeNumbers(int[] array){
    int length = 0;
    for (int element: array){
      length++;
    }
    for (int i = 0; i < length; i++){
      if (array[i] < 0){
        array[i] = 0;
      }
    }
    return array;
  }

  public double[] maxMinAvg(double[] array){
    double max = array[0];
    double min = array[0];
    double sum = 0;
    for (double element: array){
      if (element > max){
        max = element;
      }
      if (element < min){
        min = element;
      }
      sum += element;
    }
    double avg = sum/array.length;
    double[] myArray = {max, min, avg};
    return myArray;
  }

  public ArrayList<Integer> shiftValsInArray(int[] array){
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 1; i < array.length; i++){
      y.add(array[i]);
    }
    y.add(0);
    return y;
  }

}
