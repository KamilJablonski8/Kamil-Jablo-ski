public class LoopTest {


    public static void main(String[] args) {

        triangle(5, 0);
        tree(3);
        nested();
        endlessLoop(10);
        sumNumbersFromUser(4);



                }










       private static void triangle(int size, int padding) {
            for (int i = 1; i <= size; i++) {
                for (int j = padding + size - i; j > 0; j--)
                    System.out.print(" ");
                for (int k = 2 * i - 1; k > 0; k--)
                    System.out.print("*");
                System.out.println();
            }
        }

        private static void tree ( int size){
            int elementSize = 5;
            for (int j = 0; j < size; j++) {
                triangle(elementSize + j, elementSize + size - j);
            }
        }



        private static void nested() {
            String out;
            char c = 'a';
            while (c <= 'd') {
                for (int i = 1; i <= 2; i++) {
                    out = "Dla " + c + " " + i + " mamy j = ";
                    for (int j = i; j <= i + 3; j++) {
                        out += " " + j;
                        System.out.println(out);
                    }
                }
                c++;
            }
        }

        private static void endlessLoop(int limit) {
            int i = 1;
            int result = 1;
            for (; ; ) { //składowe pętli for mogą być puste, wtedy uzyskujemy pętle nieskończoną
                if (i > limit) {
                    break; //żeby przerwać pętlę nieskończoną używamy instrukcji break
                }

                result *= i++;
            }

            System.out.println("result = " + result);
        }

        private static void sumNumbersFromUser(int numbersSize) {
            int sum = 0;
            for (int i = 1; i <= numbersSize; i++) {
               // String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
              //  int numberFromUser = Integer.valueOf(numberInString);
               // System.out.println("Liczba nr " + i + " to: " + numberFromUser);
               // sum += numberFromUser;
            }

            System.out.println("sum = " + sum);
        }
    }


