package semestralwork9;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

 /*   public static void main(String[] args) {
        snowyForest();
     }
Console output/input:
Zadejte prosím intenzitu sněžení (v procentech)
25
Zadejte prosím hustotu lesa (v procentech)
12
Zadejte prosím rozlohu lesa (x*y)
100
5
     +    +   +     +        *    +*  *   *   +    * *          * +  +   *    * *  +   *++    *  * *   *      *  *+   *                  ++          *  +  * *+   +      +  +** +   * +  * *   *          *        
              +  *       +              +      +  + *  + *  * *     *        * + *++  *   *       +      ++  +  +    +*+*+ +  *+ +  +        ***  +*        *     +    *     *      +        +           *   ++ +  
     +    *  *+* *        * +      +     ++       +  + +  +   *      +    **+                + +  *+ *+ + * ** **    *+ *  *   *+*++        +    +                + + + *   +*      +*        +  *   +    * + * + *
   *  + **    +          **  **  + *++*   + *    +         *    +*     **               *+   *+  *    *               + + *         *+  + *  *  + +    +    +*+   * *+    +   *  +*+   *             ++   *  *    *
 +  *  * * +         +  +++            ++   **+ +*+    +***+  + + **+   +      +* *  *         * ++*      +    *  +   *      * + +      * *+ +   ++  + + *+ ++ * +   *  ++                +    +  * *            * 
 * *   * *   +       +*+*+   *  +            * +        *          +     *         +  +     * +      +    +              +++ +  +         +   *         +   *    +  *+  +         *    * *      * + *+  *         *
++  *       *     *            *         *     *    *  *     *+     + *+  *  *    +  *     +* ****  **    +    +    + *   *+     +   *+ + *+* *     +***      +    ++*    *     *+*+          +         + +   *    
    +    +  * ++ +   * + *  +      ++  *   +*  *    +      +  * +*  ** *      +    +      *         +   +   *  +   ++ +    *  +  + *       +      * ++  + + *+**       *  ** +     +       *     *              +  
 +       +*+  * *   *        *    +    +      +     ** *    + + *              +  +  *    *+  **     *  *+**     *  **  + * *   ++  *  *   *   +  *    **+    *   ++ +      *++      *   *   + +    * *     *  *   
    *     +      *  +     *   * +        *        *+        *  +   *+   *      + *    *  *      + *       +   +     *    +  *     *+   + + + +   +      *   ++++*   +* *      + **    +* +        + **+            
*       *  +    +  + +  *    *     +*        ++ +  ***           + +     *++*  ++   *         *            **++* +        *       *    +    *+  *             *    +++ *+ * +* *   +     * +     +   * * *  *    *+
     ++ +  *      +  *  *     *        * +*   * + * ++*       +   *     +  *+    *       +        * + + +  +         +   *   *     ++       *       *   + ++     *+         *  ** * *     +  +    * *++       +    
+   *  *  ** *   **         *   * **   +*   +   *    * + +*     + +     + *       *+  *   *  +* *  *     +   *    +   + +  ++     +* +       +    +            *   *   +   **       ++   +*+ * *+ +  ++     +     +
  *+++        + *+   *  + *      ++        * ++  ** +*    +   +  +   +**  * ** *       +    *+  *  +  *  **       *+      *   +     +    * +   +   ++  *     + *   +  * *+         *  +  + +     +  +            + 
*    + *              * ++             *     *  +          ++       +      *       +       *  + *        *   ++   +  +    + +  +* +  +         *+*+ ++                + *  +  *  * + +++ *    **   ** *  *  **     
     +  +      *     +     ++    +*        + + +       *  *   *    * +    *    * *   *     ++      *  *      *         + +   *  ***     *   + +   *   *       + + *+   * * ++ +   * + *+ + *         ++  + *     * 
   +++  *  ++ *   *+      +  *+    *      ** *++ ***   +  +  + +*+ +         +*   +    +       *      +     ++*  +* + **          +  *+   *    + +++  ** +  *    +            *+  ** + +      *         +     *++  
              +**   +   * + ++                *  + **+      **   +*    * ++   +   *   +   +     ** +   + +  *     *  *** **   * *    +    +      * *+ * *+ +  *    + +   *  *       *    +*+         +      +      
**++ *    * +  * *   ++   +  + +  * *    *   +        ++    +    *  * +  *  * +    *   *  *   *         +   + +     +   ++  *  +  * *     +  +  +  *         + ++* **+ ++  *    *  *** * ++     * +*++    ++ *  * *
   *     *   + +     +  * +++  + **+   +  *    * * *  * *   * + ++ ++   *      + *    * + +  * *    + +*+     *  *       * ++ +* **  ++ *+*++*  *         +              +       *+     *  ++*       * **  ++      
____`|´__________________`|´________________`|´________`|´________________________________________`|´__________________________`|´__`|´__________________`|´____________________`|´____`|´____________________`|´__
____`|´____`|´______________________`|´____`|´__`|´____________________`|´________`|´________`|´__________`|´______________________________________________________________`|´______________________`|´`|´__________
`|´________________________________________`|´__________________________________________________________________`|´`|´__`|´__________`|´`|´______________________`|´`|´______________________`|´__________________
`|´`|´`|´______________________________`|´__`|´__________________________________________________________________________________________________________`|´______`|´`|´__`|´__________`|´________________________
__________________________`|´`|´________________________`|´____________`|´______________________`|´____________________________________________`|´____`|´____`|´______________`|´____`|´____________`|´____________
  */

public class XmasASCII {
    public static void snowyForest() {
        
        //Variable inicialization
        String line = "";
        String finalLine = "";
        String forestLine;
        int forestLength = 0;
        int snowType;
        int cycleCount = 10;
        String finalForestLine = "";
        Scanner ligma = new Scanner(System.in);
        System.out.println("Zadejte prosím intenzitu sněžení (v procentech)");
        int snowIntensity = ligma.nextInt();
        System.out.println("Zadejte prosím hustotu lesa (v procentech)");
        int forestDensity = ligma.nextInt();
        System.out.println("Zadejte prosím rozlohu lesa (x*y)");
        int length = ligma.nextInt();
        int height = ligma.nextInt();
        
           /*Creates the forest part of thi ASCII art while also correcting Its length, 
            *so that the forest and snowy skies are roughly the same in size
            */
        for (int q = 0; q < height; q++) {
            forestLine = "";
            for (int f = 0; f < length; f++) {
                int treeChance = (int) (Math.random() * 100);
                if (treeChance <= forestDensity) {
                    forestLine = forestLine + "`|´";
                    forestLength = (q == 0) ? forestLength + 3 : forestLength;
                } else {
                    forestLine = forestLine + "__";
                    forestLength = (q == 0) ? forestLength + 2 : forestLength;
                }
            }
            finalForestLine = finalForestLine + forestLine + "\n";
        }
        
        /*Output
         *Generates a new snowy sky each itteration, while altering between two 
         *different characters depicting snowflakes
         */
        while (cycleCount > 0) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Thread.interrupted();
            }
            for (int i = 0; i < 20; i++) {
                for (int k = 0; k < (forestLength); k++) {
                    int snowChance = (int) (Math.random() * 100);
                    if (snowChance <= snowIntensity) {
                        snowType = (int) (Math.random() * 100);
                        if (snowType < 50) {
                            line = line + "+";
                        } else {
                            line = line + "*";
                        }
                    } else {
                        line = line + " ";
                    }
                }
                finalLine = finalLine + line + "\n";
                line = "";
            }
            System.out.print(finalLine + finalForestLine);
            finalLine = "";
            cycleCount--;
        }

    }
}
