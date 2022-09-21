package com.company;

import static ibio.Helpers.*;

public class Main {

    public static void main(String[] args) {
        int value = inputInt("Please, give me an int: ");
        output ("yes, got " + value);

        for (int k = 0; k <= 10; k++)
        {
            double alpha = k * (Math.PI / 5);
            System.out.println(alpha + ", " + Math.sin(alpha) + ", " + Math.cos(alpha));
        }

        boolean running = true;
        while (running = true)
        {
            String operation = inputString("give operation: ");
            if (operation.equals("end"))
            {
                running = false;
                break;
            }
            else
            {
                int a = inputInt("give first integer operand: ");
                int b = inputInt("give second integer operand: ");
                if (operation.equals("add"))
                    output(a + b);
                else if (operation.equals("sub"))
                    output(a - b);
                else
                    output("unknown operation");
            }


        }
    }
}
