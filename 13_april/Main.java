
public class Main {
    public static void main(String[] args) {
        // int nums[][] = new int[3][];
        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];

        // for(int i =0; i < nums.length; i++){
        //     for(int j =0; j< nums[i].length; j++){
        //         nums[i][j] = (int) (Math.random() * 10);
        //     }
        // }

        // for(int n[] : nums){
        //     for(int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        Students s1 = new Students();
        s1.roll = 04;
        s1.name = "Sujith";
        s1.marks = 500;

        Students s2 = new Students();
        s2.roll = 99;
        s2.name = "Sreeja";
        s2.marks = 600;

        Students s3 = new Students();
        s3.roll = 98;
        s3.name = "Latha";
        s3.marks = 600;

        
        Students[] student = new Students[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(Students s : student){
            System.out.println(s.name + " : "+ s.marks+" : "+ s.roll);
        }
        

    }
}
class Students{
    int roll;
    String name ;
    int marks ;
}