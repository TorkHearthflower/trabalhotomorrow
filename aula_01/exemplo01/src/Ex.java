
public class Ex {

    public static boolean ex01(int number) {
      return number % 2 == 0;
    }
  
    public static boolean ex02(int n) {
      String number = String.valueOf(n);
  
      for (int i = 0; i < number.length() - 1; i++) {
        if (number.charAt(i) == number.charAt(i + 1)) {
          return true;
        }
      }
      return false;
    }
  
   
   
    public static boolean ex03(int n) {
      String number = String.valueOf(n);
  
      if (number.length() == 1) {
        return false;
      }
      return number.charAt(0) == number.charAt(number.length() - 1);
    }
  
  
  
    public static void ex04(int n, int i, int j) {
      int count = 0;
  
      for (int index = 0; count < n; index++) {
        if (index % i == 0 || index % j == 0) {
          System.out.println(index + " ");
          count++;
        }
      }
    }
  

    public static String ex06(int n, int[] array) {
      StringBuilder result = new StringBuilder();
  
      for (int i = 0; i < n; i++) {
        int factorial = 1;
        for (int j = 1; j <= array[i]; j++) {
          factorial *= j;
        }
        result.append(factorial);
        if (i < n - 1) {
          result.append(", ");
        }
      }
  
      return result.toString();
    }
  
  }
