public class FindMax {
   public static int max(int[] m) {
      int i = 0;
      int m_max = m[0];
      while (i < m.length-1) {
         if (m[i+1] > m_max) {
            m_max = m[i+1];
         }
         i = i + 1;
      }
      return m_max;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
      System.out.print(max(numbers));
   }
}
