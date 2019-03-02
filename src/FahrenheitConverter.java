import java.util.Scanner;

public class FahrenheitConverter {

    public static void main(String[] args) {
float c,f;
Scanner sc = new Scanner(System.in);
System.out.println("\n Enter fahrenheit value : ");
f = sc.nextFloat();
c = (f-32)*5/9;
System.out.print("\n Celsius value is : "+c);

    }
}
