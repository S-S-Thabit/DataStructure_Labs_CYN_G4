package lab_1;

public class lab_1 {
    public static void main(String[] args) {
        // 3 Scanner scanner=new Scanner(System.in);
        Arrayss arr = new Arrayss();
        // int []numbers={1,2,3};
        int[] numbers = new int[3];
        arr.input(numbers);
        arr.traversal(numbers);

        arr.revers_traversal(numbers);

        // System.out.println(Arrayss.toString(numbers));

        // for (int i=0; i<numbers.length;i++)
        // System.out.println(numbers[i]);

        // for(int num :numbers)
        // System.out.println(num);
        //

    }
}