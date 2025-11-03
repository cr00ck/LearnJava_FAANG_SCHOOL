package FAANG_SCHOOL.Zadanie_Set_12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Создаем Set из списка - дубликаты автоматически удаляются
// Добавляем все элементы списка в Set
// LinkedHashSet сохраняет порядок добавления


public class RemoveDuplicates {
    List<Integer> numbers;
    public RemoveDuplicates() {
        this.numbers = new ArrayList<>(
    List.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 5, 6, 6, 2,7,7,9,3,24,3,5,346,346,23,5,37));
    }
    public void PrintAllList (){
        //for(int i=0; i< numbers.size(); i++){
            //System.out.println(i+": "+numbers.get(i));
        System.out.println("Cет изначальный : "+numbers);
    }
    public Set<Integer> PrintAfterSet (){
        Set<Integer> noDoubleNum = new HashSet<>(numbers);
        System.out.println("Cет после HashSet : "+noDoubleNum);
        return Set.of();
    }
}
//решение для этого задания
//RemoveDuplicates rem = new RemoveDuplicates();
//        rem.PrintAllList();
//        rem.PrintAfterSet();




