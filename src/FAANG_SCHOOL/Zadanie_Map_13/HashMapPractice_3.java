package FAANG_SCHOOL.Zadanie_Map_13;


import java.util.*;

public class HashMapPractice_3 {
   private String name;
    private String faculty;
    private int year;

    public HashMapPractice_3(String name, String faculty, int year) {
        this.name = name;
        this.faculty = faculty;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        // Шаг 1: Проверяем - это тот же самый объект в памяти?
        if (this == o) return true;
        // Пример:
        // Student s1 = new Student("Иван", "Инф", 1);
        // s1.equals(s1) → true (это один и тот же объект)

        // Шаг 2: Проверяем - o не null и того же класса?
        if (o == null || getClass() != o.getClass()) return false;
        // Объяснение:
        // - o == null → false (не можем сравнивать с null)
        // - getClass() != o.getClass() → false (разные классы)
        // getClass() возвращает класс объекта (Student.class)

        // Шаг 3: Приводим o к типу Student
        HashMapPractice_3 student = (HashMapPractice_3) o;
        // Теперь мы УВЕРЕНЫ, что o - Student
        // Можем безопасно обращаться к полям: student.name, student.faculty

        // Шаг 4: Сравниваем поля
        return year == student.year &&
                Objects.equals(name, student.name) &&
                Objects.equals(faculty, student.faculty);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, year);
    }
    // Преобразует все данные студента в ЧИСЛО
    // Например: "Иван Петров-Информатика-1" → 1234567
    // Администратор видит: "А, это Иван с информатики, 1 курс!" ✅

    @Override
    public String toString() {
        return name + " (" + faculty + ", " + year + " курс)";
    }
    // Student@1a2b3c4d
// Что видит администратор? МУСОР!
// "Student@1a2b3c4d - что это? Какой студент? Какой факультет?"


}