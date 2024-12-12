package ua.edu.chmnu.ce.c2.jid;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class EmployeeAnalyzer {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Укажіть шлях до файлу CSV як аргумент командного рядка.");
            return;
        }

        String filePath = args[0];
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 3) {
                    try {
                        String name = data[0].trim();
                        int age = Integer.parseInt(data[1].trim());
                        double salary = Double.parseDouble(data[2].trim());
                        employees.add(new Employee(name, age, salary));
                    } catch (NumberFormatException e) {
                        System.out.println("Пропуск недійсного рядка: " + line);
                    }
                } else {
                    System.out.println("Пропуск недійсного рядка: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
            return;
        }

        Employee result = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparingInt(Employee::getAge))
                .orElse(null);

        if (result != null) {
            System.out.println("Наймолодший працівник із найвищою зарплатою:");
            System.out.println(result);
        } else {
            System.out.println("Не знайдено дійсних даних про співробітника.");
        }
    }
}

class Employee {
    private final String name;
    private final int age;
    private final double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}
