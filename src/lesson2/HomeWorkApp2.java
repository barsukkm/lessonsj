package lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        myTask1();
        System.out.println(" ");
        myTask2();
        System.out.println(" ");
        myTask3();
        System.out.println(" ");
        myTask4();
        myTask5(7, 10);
    }

    public static void myTask1() {
        int[] arr = {0, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
            System.out.print(arr[i] + " ");
        }
    }

    public static void myTask2() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.print(arr2[i] + " ");
        }
    }

    public static void myTask3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + " ");
        }

    }

    public static void myTask4() {
        int arr4[][] = new int[5][5];
        for(int i = 0; i < arr4.length; i++) {
            for(int j = 0; j < arr4[i].length; j++) {
                if(i == j){ arr4[i][j] = 1; }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void myTask5(int len, int initialValue){
        int [] arr5 = new int[len];
        for(int i = 0; i < arr5.length; i++){
            arr5[i] = initialValue;
            System.out.print(arr5[i] + " ");
        }
    }

}


