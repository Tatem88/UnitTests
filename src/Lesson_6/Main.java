package Lesson_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите числа первого списка через пробел: ");
            List<Integer> list1 = readNumbers(scanner.nextLine());

            System.out.print("Введите числа второго списка через пробел: ");
            List<Integer> list2 = readNumbers(scanner.nextLine());

            double average1 = calculateAverage(list1);
            double average2 = calculateAverage(list2);

            if (average1 > average2) {
                System.out.println("Первый список имеет большее среднее значение");
            } else if (average2 > average1) {
                System.out.println("Второй список имеет большее среднее значение");
            } else {
                System.out.println("Средние значения равны");
            }
        }
        public static List<Integer> readNumbers(String input) {
            List<Integer> numbers = new ArrayList<>();
            String[] tokens = input.split(" ");

            for (String token : tokens) {
                numbers.add(Integer.parseInt(token));
            }

            return numbers;
        }
        public static double calculateAverage(List<Integer> numbers) {
            int sum = 0;

            for (int number : numbers) {
                sum += number;
            }

            return (double) sum / numbers.size();
        }
    }
