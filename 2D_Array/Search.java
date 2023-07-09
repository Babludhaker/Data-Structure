public class Search {

    static boolean Search_sorted_matrix(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1; 
        while(row < matrix.length && col>= 0){
            if(matrix[row][col]== key){
                System.out.println("key found at index"+"("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col] > key){  // move to Left
                col--;
            } else{   // matrix[row][col] < Key  -- move to bottom 
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
       System.out.println( Search_sorted_matrix(matrix, key));
    }
}
