public class NumberRightToLeftPyramid {
    public static void main(String[] args) {
        //outer loop
        for(int i = 1; i <= 10; i++){
            //inner loop
            for(int j = 1; j <= 10 - i + 1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    
}
