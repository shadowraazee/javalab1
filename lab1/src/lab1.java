import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){

        String name = "Rovshan";
        int age = 18;
        int courseYear = 2;
        String uni = "Vistula";

        System.out.println("Hello! my name is " + name + " and I'm " + age + " years old" );
        System.out.println("I study in " + uni + " University, now I'm at " + courseYear + " year of studies");

        System.out.println("I learned C# language on my first year, now I'm learning " +
                "Java language that is similar to C#");

        String answer;
        Scanner ans = new Scanner(System.in);
        System.out.println("I practised Java a little bit right now, " +
                "Do you want to try my calculator? Y/N: ");
        answer = ans.nextLine();

        if ( answer.equals("Y") || answer.equals("y"))
        {
            double number1, number2;
            String operator;
            Scanner op = new Scanner(System.in);
            System.out.println("Choose operator(+, -, *, /): ");
            operator = op.nextLine();
            switch (operator) {
                case "+" -> {
                    Scanner num1 = new Scanner(System.in);
                    System.out.println("Choose first number: ");
                    number1 = num1.nextInt();

                    Scanner num2 = new Scanner(System.in);
                    System.out.println("Choose second number: ");
                    number2 = num2.nextInt();

                    System.out.println(number1 + number2);
                }
                case "-" -> {
                    Scanner num1 = new Scanner(System.in);
                    System.out.println("Choose first number: ");
                    number1 = num1.nextInt();

                    Scanner num2 = new Scanner(System.in);
                    System.out.println("Choose second number: ");
                    number2 = num2.nextInt();

                    System.out.println(number1 - number2);
                }
                case "*" -> {
                    Scanner num1 = new Scanner(System.in);
                    System.out.println("Choose first number: ");
                    number1 = num1.nextInt();

                    Scanner num2 = new Scanner(System.in);
                    System.out.println("Choose second number: ");
                    number2 = num2.nextInt();

                    System.out.println(number1 * number2);
                }
                case "/" -> {
                    Scanner num1 = new Scanner(System.in);
                    System.out.println("Choose first number: ");
                    number1 = num1.nextInt();

                    Scanner num2 = new Scanner(System.in);
                    System.out.println("Choose second number: ");
                    number2 = num2.nextInt();

                    System.out.println(number1 / number2);
                }
            }
        }
        else if (answer.equals("N") || answer.equals("n")) {
            System.out.println("No problem, that's it of my program. See ya");
        }


    }
}
