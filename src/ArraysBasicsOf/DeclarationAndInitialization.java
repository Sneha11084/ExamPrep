package ArraysBasicsOf;

public class DeclarationAndInitialization {
    public static void main(String[] args) {
        // 1. Single dimensional arrays
        // If you are initialising any array(1d or 2d) then you have to provide the size but not in the case of inline initialisation
        // Declaration
        int[] arr;

        // Initialisation
        arr = new int[5]; // Allocates memory for five integers, default values are zero
        arr = new int[]{1,2,3,4,45}; // Inline initialisation
        // *** arr = {1,2,3}; Wrong way ***

        // Combined declaration and initialisation
        int[] arr2 = {1,2,3,4,5};



        // 2. Multidimensional arrays: If array size has been declared explicitly then you have to store data accordingly
        // otherwise not declared then can store values in whichever manner you want.
        // Declaration
        int[][] matrix;

        // Initialization
        matrix = new int[3][4]; // 3 rows and four columns

        // Combined declaration and initialisation
        int[][] matrix2 = new int[3][4];
        int[][] matrix1 = {
                {1,2,3,9},
                {4,5,6,9},
                {7,8,9,9}
        };
    }
}
