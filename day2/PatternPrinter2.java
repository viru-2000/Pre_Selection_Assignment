/*/*b.
1010101
10101 
  101  
   1    */

   public class PatternPrinter2 {
    public static void main(String[] args) {
        
        System.out.println("Pattern B:");
        for (int i = 1; i <= 4; i++) {
            
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= 2 * (5 - i) - 1; k++) {
                System.out.print((k % 2 == 0) ? "0" : "1");
            }

            System.out.println();
        }
    }
}
 



