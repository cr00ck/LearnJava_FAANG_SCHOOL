package UCHEBA.Arrays;

public class MyArrays {
    int [] array = new int [5];
    Candy [] box = new Candy [5];//создали для этого класс Candy//
    int [] array2 = {10,3,6,1,5,44,757,356,145,57};
    Candy candyfirst = new Candy();
    Candy candysecond = new Candy();
    Candy candythird = new Candy();
    Candy [] box2 = {candyfirst, candysecond, candythird};
    Candy [] box3;

    public void foo() {
        System.out.println(array[4]);

//                for(int i =0; i<array2.length; i++) { //выводит все элементы массива
//            System.out.println(array2[i]);
//        }

    }
}
