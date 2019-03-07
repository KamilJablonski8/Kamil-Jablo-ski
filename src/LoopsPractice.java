public class LoopsPractice {

  /*  public static void practiceWhileLoop() {
        int x = 1;
        while (x < 5) {
            System.out.println("The value of x is " + x);
            x++;
        }
    } */

  /*  public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println(("The value of x is " + x));
            x++;


        } while (x < 10);
    } */
      /*  public static void practiceForLoop(){
            for (int x = 1; x <10 ; x++) {
                System.out.println("The value of x is " + x);
            }
            System.out.println("This is the end");
        } */

    public static void practiceForLoop() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                for (int c = 0; c < 10; c++) {
                    System.out.println("(" + x + ", " + y + ", "+c+")");
                }
            }
        }
    }
    public static void main(String[] args) {
      //  practiceWhileLoop();
       // practiceDoWhileLoop();
        practiceForLoop();

    }
}