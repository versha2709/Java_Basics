import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        int answer = 0;

        while (true)
        {
            System.out.print("ENTER THE OPERATION : ");

            char operation = sc.next().trim().charAt(0);

            System.out.println();

        if (operation == '+' || operation == '-' || operation == '*' || operation == '/' ||operation == '%'  )
            {
                System.out.print("ENTER NUMBER 1 : ");
                int number1 = sc.nextInt();

                System.out.print("ENTER NUMBER 2 : ");
                int number2 = sc.nextInt();

               if (operation == '+')
               {
                    answer = number1 + number2 ;
               }
               if (operation == '-')
                {
                    answer = number1 - number2 ;
                }
               if (operation == '*')
                {
                    answer = number1 * number2 ;
                }
               if (operation == '/')
               {
                   if (number2 != 0)
                   {
                       answer = number1 / number2;
                   }
               }
               if (operation == '%')
                {
                    answer = number1 % number2 ;
                }
            }

        else if (operation == 'X' || operation == 'x')
        {
            break;
        }

        else
        {
            System.out.println("ERROR 404");
        }

            System.out.println(answer);

        }
    }
}
