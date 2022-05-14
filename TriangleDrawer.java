public class TriangleDrawer {
 
   public static void drawTriangle(int N) {
       int row = 1;
       while (row <= N) {
           int col = 1;
           while (col <= row) {
               System.out.print("*");
               col = col + 1;
           }
       row = row + 1;
       System.out.println();
       }
   }

   public static void main(String[] args) {
      drawTriangle(10);
   }

}
