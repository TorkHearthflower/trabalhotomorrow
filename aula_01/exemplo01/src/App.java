public class App {
    public class Main {

        public static void main(String[] args) {
        if (Ex.ex01(5)) {
          System.out.println("par");
        } else {
          System.out.println("impar");
        }
    
        if (Ex.ex02(724)) {
          System.out.println("repetido");
        } else {
          System.out.println("nao repetido");
        }
    
        if (Ex.ex03(36738210)) {
          System.out.println("repetido");
        } else {
          System.out.println("nao repetido");
        }
    
        Ex.ex04(6, 2, 3);
    
        String factorial = Ex.ex06(3, new int[]{1, 3, 3});
        System.out.println("Fatoriais da sequência: " + factorial);
        }
    
    }
}
    

