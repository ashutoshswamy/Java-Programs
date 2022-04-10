public class RightToLeftPyramid {
    public static void main(String[] args) {
        //outer loop
        for(int i = 10; i >= 1; i--){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
