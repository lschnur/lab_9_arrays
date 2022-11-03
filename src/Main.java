import java.util.Random;
import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int dataPoints[] = new int[100];
        for (int l = 0; l < dataPoints.length; l++)
            dataPoints[l] = rnd.nextInt(100) + 1;

        for (int l = 0; l < dataPoints.length; l++)
            System.out.print(" | " + dataPoints[l]);

        for (int l = 0; l < dataPoints.length; l++)
            sum += dataPoints[l];
        System.out.println("");
        System.out.println("The sum of the data points is " + sum);
        System.out.println("The average of the data points is " + sum / dataPoints.length);


        //linear scan

        int Perfect;
        int times = 0;
        Perfect = SafeInput.getRangedInt(in, "Enter a integer", 0, 100);
        for (int l = 0; l < dataPoints.length; l++)
            if (dataPoints[l] == Perfect)
                times += 1;
        System.out.println("Your value was found " + times + " times");

        int Perfect2 = 0;
        boolean found = false;
        Perfect2 = SafeInput.getRangedInt(in, "Enter a integer", 0, 100);
        for (int i = 0; i < dataPoints.length; i++)
            if (dataPoints[i] == Perfect2)
                System.out.println("Your value was found at " + i);
                found = true;

                if(found= false)
                {
                    System.out.println("You value was not found");
                }

                int max = 0;
                int min = 0;
        max = dataPoints[0];
        min = dataPoints[0];
                for (int m = 0; m < dataPoints.length; m++)
                    if (dataPoints[m] > max)
                        max = dataPoints[m];
                    else if(dataPoints[m] < min)
                        min = dataPoints[m];

        System.out.println("The maximum is "+ max);
        System.out.println("The minimum is "+ min);








    }


}