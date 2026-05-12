public class Hello {
    public static void main(String[] args) {
        int nums [] = {6,86,2,9,24,34,36};
        System.out.println(nums[0]);


        int num1[] = new int[3];
        num1[0] = 3;
        num1[1] = 6;
        num1[2] = 56;
        for(int i = 0; i <= 2; i++){
            System.out.println(num1[i]);
        }

        int num2[][] = new int[3][4];
        for(int i = 0; i< 3;i++){
            for(int j =0; j<4; j++){
                num2[i][j] = (int)(Math.random() * 100);
                System.out.print(num2[i][j]+ " ");
            }
            System.out.println();
        }

    }    
}
