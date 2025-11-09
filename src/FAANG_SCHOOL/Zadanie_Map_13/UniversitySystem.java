package FAANG_SCHOOL.Zadanie_Map_13;

import java.util.*;

public class UniversitySystem {
    public UniversitySystem() {
        this.allStudents = new ArrayList<>();
        this.facultyYearMap = new HashMap<>();
        initializeSampleData();
        updateFacultyYearMap();
    }

    private List<HashMapPractice_3> allStudents;
    private Map<String, List<HashMapPractice_3>> facultyYearMap;
    private void updateFacultyYearMap() {
        this.facultyYearMap = groupStudentsByFacultyAndYear(allStudents);
    }

    private void initializeSampleData() {
        System.out.println("=== ИНИЦИАЛИЗАЦИЯ СИСТЕМЫ УЧЕТА СТУДЕНТОВ ===");

        allStudents.add(new HashMapPractice_3("Иван Петров", "Информатика", 1));
        allStudents.add(new HashMapPractice_3("Мария Сидорова", "Информатика", 1));
        allStudents.add(new HashMapPractice_3("Алексей Козлов", "Информатика", 2));
        allStudents.add(new HashMapPractice_3("Елена Новикова", "Математика", 1));
        allStudents.add(new HashMapPractice_3("Дмитрий Волков", "Математика", 3));
        allStudents.add(new HashMapPractice_3("Ольга Белова", "Физика", 2));
        allStudents.add(new HashMapPractice_3("Сергей Морозов", "Физика", 2));
        allStudents.add(new HashMapPractice_3("Анна Ковалева", "Химия", 1));

    }
    public Map<String, List<HashMapPractice_3>> groupStudentsByFacultyAndYear(List<HashMapPractice_3> students) {

        Map<String, List<HashMapPractice_3>> resultMap = new HashMap<>();

        for (HashMapPractice_3 student : students) {
            // Создаем ключ в формате "Факультет-Курс"
            String key = student.getFaculty() + "-" + student.getYear();

            // Если ключа нет в мапе - создаем новую пустую коллекцию
            if (!resultMap.containsKey(key)) {
                resultMap.put(key, new ArrayList<>());
            }

            // Добавляем студента в соответствующую коллекцию
            resultMap.get(key).add(student);
        }

        return resultMap;
    }
    //ДЕТАЛЬНОЕ ОБЪЯСНЕНИЕ РАБОТЫ groupStudentsByFacultyAndYear()
//    Представим, что у нас есть 3 студента:
//    Иван Петров, Информатика, 1 курс
//    Мария Сидорова, Информатика, 1 курс
//    Алексей Козлов, Информатика, 2 курс
//    Итерация 1: Иван Петров
//    -------------
//    Student student = Иван Петров
//    Шаг 1: Создание ключа
//    ---------
//    String key = "Информатика" + "-" + 1;
//// Результат: "Информатика-1"
//    Шаг 2: Проверка существования ключа
//            ----------
//if (!resultMap.containsKey("Информатика-1"))
//// resultMap пустой → условие true
//    Шаг 3: Создание новой коллекции
//            -----------
//resultMap.put("Информатика-1", new ArrayList<>());
//    Теперь resultMap содержит:
//    text
//    {
//        "Информатика-1": []  (пустой список)
//    }
//    Шаг 4: Добавление студента
//    -------------
//resultMap.get("Информатика-1").add(Иван Петров);
//    Результат:
//    text
//    {
//        "Информатика-1": [Иван Петров]
//    }
//    Итерация 2: Мария Сидорова
//    -----------
//    Student student = Мария Сидорова
//    Шаг 1: Создание ключа
//    ------------
//    String key = "Информатика-1"  // тот же ключ!
//    Шаг 2: Проверка существования ключа
//            ------------
//if (!resultMap.containsKey("Информатика-1"))
//// Ключ уже есть → условие false → пропускаем создание
//    Шаг 3: Добавление студента
//    -------------
//resultMap.get("Информатика-1").add(Мария Сидорова);
//    Результат:
//    text
//    {
//        "Информатика-1": [Иван Петров, Мария Сидорова]
//    }

// Метод добавления студента
public boolean addStudent(String name, String faculty, int year) {
    // Шаг 1: Создаем объект студента
    HashMapPractice_3 newStudent = new HashMapPractice_3(name, faculty, year);

    // Шаг 2: Проверяем, нет ли уже такого студента
    if (allStudents.contains(newStudent)) {
        System.out.println("❌ Студент " + name + " уже существует");
        return false;  // возвращаем false - не удалось добавить
    }

    // Шаг 3: Добавляем в общий список
    allStudents.add(newStudent);

    // Шаг 4: Обновляем группировку
    updateFacultyYearMap();

    System.out.println("✅ Добавлен студент: " + newStudent);
    return true;  // возвращаем true - успешно добавлен
}
// Метод удаления студента
    public boolean removeStudent(String name, String faculty, int year) {
        // Шаг 1: Создаем временный объект для поиска
        HashMapPractice_3 studentToRemove = new HashMapPractice_3(name, faculty, year);

        // Шаг 2: Пытаемся удалить из списка
        boolean removed = allStudents.remove(studentToRemove);

        if (removed) {
            // Шаг 3: Если удалили - обновляем группировку
            updateFacultyYearMap();
            System.out.println("🗑️ Удален студент: " + studentToRemove);
        } else {
            System.out.println("❌ Студент не найден");
        }

        return removed;
    }

    //Метод поиска студентов
    public List<HashMapPractice_3> findStudentsByFacultyAndYear(String faculty, int year) {
        // Шаг 1: Создаем ключ для поиска
        String key = faculty + "-" + year;

        // Шаг 2: Ищем в HashMap
        List<HashMapPractice_3> result = facultyYearMap.getOrDefault(key, new ArrayList<>());

        // Шаг 3: Логируем результат
        System.out.println("🔍 Поиск студентов: " + faculty + ", " + year + " курс");
        if (result.isEmpty()) {
            System.out.println("   Не найдено студентов");
        } else {
            System.out.println("   Найдено студентов: " + result.size());
        }

        return result;
    }
    // Метод для вывода всех студентов с группировкой
    public void printAllStudentsGrouped() {
        System.out.println("\n=== СПИСОК ВСЕХ СТУДЕНТОВ ПО ФАКУЛЬТЕТАМ И КУРСАМ ===");

        if (facultyYearMap.isEmpty()) {
            System.out.println("Нет данных о студентах");
            return;
        }
        // Сортируем ключи для красивого вывода
        List<String> sortedKeys = new ArrayList<>(facultyYearMap.keySet());
        Collections.sort(sortedKeys);

        for (String key : sortedKeys) {
            String[] parts = key.split("-");
            String faculty = parts[0];
            int year = Integer.parseInt(parts[1]);
            List<HashMapPractice_3> students = facultyYearMap.get(key);

            System.out.println("\n🎓 " + faculty + " - " + year + " курс:");
            System.out.println("   Студентов: " + students.size());

            for (int i = 0; i < students.size(); i++) {
                System.out.println("   " + (i + 1) + ". " + students.get(i).getName());
            }
        }
        System.out.println("\n📊 Всего студентов в университете: " + allStudents.size());

    }
}
