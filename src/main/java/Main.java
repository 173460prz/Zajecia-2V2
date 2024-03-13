// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    /* int i = 100;
    
    System.out.println("H \n e \n  l \n   l \n    o \n     , \n      w \n       o \n        r \n         l \n          d \n           !");
    System.out.println("H \r\ne \r\nl \r\nl \r\no \r\n \r\nw \r\no \r\nr \r\nl \r\nd \r\n!");
    
    while (i != 0)
      {
        if (i%4 == 0)
        {
          System.out.println(i);
        }
        i--;
      }
    } */
  
    int i=0;
    int b=0;
    while(i<5)
      { 
      Random liczba = new Random();
      int a = liczba.nextInt(101);
      System.out.println(a); 
      b = b + a*a;
      i++;
      }
    System.out.println(b);
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}