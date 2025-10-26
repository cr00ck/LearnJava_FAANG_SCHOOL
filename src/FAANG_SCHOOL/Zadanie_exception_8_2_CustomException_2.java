package FAANG_SCHOOL;

//это исключение сделано для урока Zadanie_massiv_5_1_posle_pepreriva проверяется что нельзя ввести определенный объект в массив
public class Zadanie_exception_8_2_CustomException_2 extends Exception{
    public Zadanie_exception_8_2_CustomException_2 (String input){
        super("Ингридиент "+input +" не очень подходит для этого, сорян!  ");
    }
}
