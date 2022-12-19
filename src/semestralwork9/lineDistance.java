package semestralwork9;

import java.util.Scanner;

 /*
public static void main(String[] args) {
        lineDistance();
}
Console output/input:
Chete pokračovat ve zpracovávání? (a/n)
a
Zadejte prosím souřadnice bodů, které definují přímku
12 5
5 65
Zadejte prosím počet porovnávaných bodů
4
Zadejte prosím souřadnice porovnávaných bodů
1 0
-9 -6
32 -32
0 0
Setříděné body:
32.0 -32.0
1.0 0.0
0.0 0.0
-9.0 -6.0
Chete pokračovat ve zpracovávání? (a/n)
d
Chete pokračovat ve zpracovávání? (a/n)
d
Chete pokračovat ve zpracovávání? (a/n)
n
*/

public class lineDistance {

    static Scanner sc = new Scanner(System.in);

    public static void lineDistance() {
        
        //Variable inicialization
        String nextCycle;
        double[] pointA = new double[2];
        double[] pointB = new double[2];
        double[] normalVector = new double[2];
        int pointCount;
        int lesserThan = 0;
        double c;
        while (true) {
            System.out.println("Chete pokračovat ve zpracovávání? (a/n)");
            nextCycle = sc.next();
            if (nextCycle.equalsIgnoreCase("n")) {
                break;
            } else if (nextCycle.equalsIgnoreCase("a")) {
                
                //Equation
                //Creates all the necesseary elements for the analytical equation of a line (ax + by + c = 0)
                System.out.println("Zadejte prosím souřadnice bodů, které definují přímku");
                arrayValues(pointA);
                arrayValues(pointB);
                normalVector[0] = (pointB[1] - pointA[1]);
                normalVector[1] = -(pointB[0] - pointA[0]);
                c = -(normalVector[0] * pointA[0] + normalVector[1] * pointB[1]);
                System.out.println("Zadejte prosím počet porovnávaných bodů");
                pointCount = sc.nextInt();
                double[] pointHolder = new double[pointCount * 2];
                System.out.println("Zadejte prosím souřadnice porovnávaných bodů");
                arrayValues(pointHolder);
                double[] pointDistances = new double[pointCount];
                for (int u = 0; u < pointDistances.length; u++) {
                    
                    //Calculates the distance between given points and the line
                    pointDistances[u] = Math.abs(normalVector[0] * pointHolder[u * 2] + normalVector[1] * pointHolder[u * 2 + 1] + c) / Math.sqrt(normalVector[0] * normalVector[0] + normalVector[1] * normalVector[1]);
                    //System.out.println(pointDistances[u]);
                }
                
                //Analyzes how many number in said array are greater than current number and stores It
                double[] distanceIndeces = new double[pointCount];
                for (int x = 0; x < distanceIndeces.length; x++) {
                    for (int d = 0; d < pointDistances.length; d++) {
                        lesserThan = (pointDistances[x] < pointDistances[d]) ? lesserThan + 1:lesserThan;
                    }
                    distanceIndeces[x] = lesserThan;
                    //System.out.println(distanceIndeces[x]);
                    lesserThan = 0;
                }
                
                /*Output
                * Prints out points from the ones those are closest to the farthest ones.
                * Uses distanceIndices to determine which distance has the highest amount of greater distances
                * When a point is printed, its corresponding value in distanceIndices gets overwritten so It is never chosen again
                */
                System.out.println("Setříděné body:");
                for (int f = distanceIndeces.length - 1; f >= 0; f--) {
                    for (int k = 0; k < distanceIndeces.length; k++) {
                        if (distanceIndeces[k] == f) {
                            System.out.println((pointHolder[k * 2]) + " " + (pointHolder[k * 2 + 1] + " | " + pointDistances[k]));
                            distanceIndeces[k] = -1;
                            f++;
                            break;
                        }
                    }
                }
            } else {
            }
        }
    }
    
    /**
     * arrayValues - This method is used to fill up a 1 by n field with values typed in by the user
     * @param array
     */

    public static void arrayValues(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
    }
}
