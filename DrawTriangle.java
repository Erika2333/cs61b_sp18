public class DrawTriangle {
    public static void main(String[] args) {
	int row = 1;
        while (row < 6){
             int col = 1;
             while (col <= row){
                 System.out.print("*");
                 col = col + 1;
             }
        row = row + 1;
        System.out.println("");
        }
    }
}
