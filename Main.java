import java.util.Scanner;
/**
 * Methods Example
 * @author Graham Ellacott
 */
public class Main {

  //A method that says hello world
  public static void sayHello(){
    System.out.println("Hello World!");
  }

  //A method that says hello to a person
  public static void sayHello(String name){
    System.out.println("Hello " + name);
  }

  //A method that says hello world multiple times
  public static void sayHello(int numberOfTimes){
    for(int i = 0; i < numberOfTimes; i++){
      System.out.println("Hello World!");
    } 
  }

  //A method to calculate the area of a rectangle given the width and the length
  public static double areaOfRectangle(double width, double length){
    double area = width * length;
    return area;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // make Scanner
    Scanner input = new Scanner(System.in);

    //using the method without a Scanner
    double answer = areaOfRectangle(3.5, 5.0);
    System.out.println(answer);

    //using the method with a Scanner
    System.out.println("Please enter a width");
    double width = input.nextDouble();
    System.out.println("Please enter a length");
    double length = input.nextDouble();
    //calculate area using the input
    double area = areaOfRectangle(width, length);
    System.out.println(area);

    //print hello world
    sayHello();
    sayHello("Jeff");
    sayHello(27);
  }
}
