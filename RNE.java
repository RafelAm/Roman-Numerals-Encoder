import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversionTest {

    private Conversion conversion = new Conversion();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
    }
}



import java.util.*;
public class Conversion {

    public String solution(int n) {
        
      HashMap<Integer, String> RomanNumbers = new HashMap<Integer, String>();
      
      String test = "";
      
      RomanNumbers.put(1, "I");
      RomanNumbers.put(4, "IV");
      RomanNumbers.put(5, "V");
      RomanNumbers.put(9, "IX");
      RomanNumbers.put(10, "X");
      RomanNumbers.put(40, "XL");
      RomanNumbers.put(50, "L");
      RomanNumbers.put(90, "XC");
      RomanNumbers.put(100, "C");
      RomanNumbers.put(400, "CD");
      RomanNumbers.put(500, "D");
      RomanNumbers.put(900, "CM");
      RomanNumbers.put(1000, "M");
      
      for(int i = n; i - 1000 >= 0; i -= 1000,n -= 1000 ){
        test += RomanNumbers.get(1000);
      }for(int i = n; i - 900 >= 0; i -= 900,n -= 900 ){
        test += RomanNumbers.get(900);
      }for(int i = n; i - 500 >= 0; i -= 500,n -= 500 ){
        test += RomanNumbers.get(500);
      }for(int i = n; i - 400 >= 0; i -= 400, n -= 400 ){
        test += RomanNumbers.get(400);
      }for(int i = n; i - 100 >= 0; i -= 100, n -= 100 ){
        test += RomanNumbers.get(100);
      }for(int i = n; i - 90 >= 0; i -= 90, n -= 90 ){
        test += RomanNumbers.get(90);
      }for(int i = n; i - 50 >= 0; i -= 50, n -= 50 ){
        test += RomanNumbers.get(50);
      }for(int i = n; i - 40 >= 0; i -= 40 , n -= 40){
        test += RomanNumbers.get(40);
      }for(int i = n; i - 10 >= 0; i -= 10, n -= 10 ){
        test += RomanNumbers.get(10);
      }for(int i = n; i - 9 >= 0; i -= 9, n -= 9 ){
        test += RomanNumbers.get(9);
      }for(int i = n; i - 5 >= 0; i -= 5 , n -= 5){
        test += RomanNumbers.get(5);
      }for(int i = n; i - 4 >= 0; i -= 4, n -= 4 ){
        test += RomanNumbers.get(4);
      }for(int i = n; i - 1 >= 0; i -= 1,n -= 1 ){
        test += RomanNumbers.get(1);
      }
       
      
      return  test;
    }
}



import java.util.HashMap;


public class Conversion {

    public String solution(int n) {
        
      HashMap<Integer, String> RomanNumbers = new HashMap<Integer, String>();
      
      String test = "";
      
      RomanNumbers.put(1, "I");
      RomanNumbers.put(4, "IV");
      RomanNumbers.put(5, "V");
      RomanNumbers.put(9, "IX");
      RomanNumbers.put(10, "X");
      RomanNumbers.put(40, "XL");
      RomanNumbers.put(50, "L");
      RomanNumbers.put(90, "XC");
      RomanNumbers.put(100, "C");
      RomanNumbers.put(400, "CD");
      RomanNumbers.put(500, "D");
      RomanNumbers.put(900, "CM");
      RomanNumbers.put(1000, "M");
      
      while(n - 1000 >= 0){
        n -= 1000;
        test += RomanNumbers.get(1000);
      }
      while(n - 900 >= 0){
        n -= 900;
        test += RomanNumbers.get(900);
      }
      while(n - 500 >= 0){
        n -= 500;
        test += RomanNumbers.get(500);
      }
       while(n - 400 >= 0){
        n -= 400;
        test += RomanNumbers.get(400);
      } while(n - 100 >= 0){
        n -= 100;
        test += RomanNumbers.get(100);
      } while(n - 90 >= 0){
        n -= 90;
        test += RomanNumbers.get(90);
      } while(n - 50 >= 0){
        n -= 50;
        test += RomanNumbers.get(50);
      } while(n - 40 >= 0){
        n -= 40;
        test += RomanNumbers.get(40);
      } while(n - 10 >= 0){
        n -= 10;
        test += RomanNumbers.get(10);
      } while(n - 9 >= 0){
        n -= 9;
        test += RomanNumbers.get(9);
      } while(n - 5 >= 0){
        n -= 5;
        test += RomanNumbers.get(5);
      }while(n - 4 >= 0){
        n -= 4;
        test += RomanNumbers.get(4);
      }while(n - 1 >= 0){
        n -= 1;
        test += RomanNumbers.get(1);
      }
      
      return  test;
    }
}
