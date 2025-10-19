package FAANG_SCHOOL;

import java.util.Random;

public class Zadanie_2_posle_pereriva {
    public  void foo (){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++){
            sb.append(random.nextInt(10000)).append(" ").append("ob").toString();
        }
        String sbS = sb.toString();
        boolean contain23 = sbS.contains("23");
        int subStob = sbS.indexOf("ob");
        System.out.println( sbS.replace("1","i").replace("-", "")
                .replace('0', 'o')
                .replace('6', 'b'));
        System.out.println("Содержит ли наши числа 23 - " + contain23);
        System.out.println("содержит подстроку 'ob' - " + subStob);
    }
    public void foo2() {
        String text = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        StringBuilder sb = new StringBuilder(text.toLowerCase());
        Random random2 = new Random(51);
        int start = random2.nextInt();
        char zero = text.charAt(0);
        char one = text.charAt(1);

//в итоге так и не смог это сделать и забил

        System.out.println(sb.reverse()
                .replace(0,1,String.valueOf(one))
                .replace(1,0,String.valueOf(zero)));




    }
}
