package UCHEBA.UchebaIfElse;

public class IfElse {
    Integer a=600;
    Integer b=90;
    Boolean value = false;
    String slovo = "kirill";


    public void foo(){
        if (value){
            System.out.println("BREHNIA");
        }
        if (a<b){
            System.out.println("A smaller then B");
        }
        if (slovo == "kirill"){
            System.out.println("Znachit tak");
        }
        else if (a == b){
                System.out.println("A equally B");
    }
        else {
            System.out.println("NO Fuck");
}}}
