import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        /*System.out.print("Введите первое число: "); int num1 = in.nextInt();
        System.out.print("Введите второе число: "); int num2 = in.nextInt();
        task1(num1, num2);*/

        /*System.out.print("Введите делимое число: "); double num1 = in.nextDouble();
        System.out.print("Введите частное число: "); double num2 = in.nextDouble();
        task2(num1, num2);*/

        /*System.out.print("Введите строку: "); String str = in.nextLine();
        task3(str);*/

        /*System.out.print("Введите возраст: "); int age = in.nextInt();
        task4(age);*/

        /*System.out.print("Введите число: "); double num = in.nextDouble();
        task5(num);*/

        /*System.out.print("Введите число: "); int num = in.nextInt();
        task6(num);*/

        /*System.out.print("Введите размер массива: "); int size = in.nextInt();
        int[] mass = new int[size];

        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();
        }
        task7(mass);*/

        /*System.out.print("Введите число: "); int a = in.nextInt();
        System.out.print("Введите степень: "); int b = in.nextInt();
        task8(a, b);*/

        /*System.out.print("Введите строку: "); String str = in.nextLine();
        System.out.print("Введите количество символов для обрезки: "); int count = in.nextInt();

        System.out.println("Новая строка: " + task9(str, count));*/

        /*System.out.print("Введите размер массива: "); int size = in.nextInt();
        int[] mass = new int[size];

        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();
        }

        System.out.print("Введите искомое число: "); int num = in.nextInt();
        task10(mass, num);*/

        /*System.out.print("Введите число: "); int num = in.nextInt();
        task11(num);*/

        /*System.out.print("Введите первое число: "); int num1 = in.nextInt();
        System.out.print("Введите второе число: "); int num2 = in.nextInt();
        task12(num1, num2);*/

        System.out.print("Введите размер массива: "); int size = in.nextInt();
        int[] mass = new int[size];

        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();
        }

        System.out.print("Введите индекс элемента: "); int index = in.nextInt();
        System.out.println(task13(mass, index));

        /*System.out.print("Введите пароль: "); String password = in.nextLine();
        task14(password);*/

        /*System.out.print("Введите строку с датой: "); String dateString = in.next();
        task15(dateString);*/

        /*System.out.print("Введите первую строку: "); String str1 = in.nextLine();
        System.out.print("Введите вторую строку: "); String str2 = in.nextLine();
        task16(str1, str2);*/

        /*System.out.print("Введите первое число: "); int num1 = in.nextInt();
        System.out.print("Введите второе число: "); int num2 = in.nextInt();
        task17(num1, num2);*/

        /*System.out.print("Введите число: "); double num = in.nextDouble();
        task18(num);*/

        /*System.out.print("Введите температуру в цельсиях: "); int num = in.nextInt();
        task19(num);*/

        /*System.out.print("Введите строку: "); String str = in.nextLine();
        task20(str);*/

        in.close();
    }

    //1. Функция для нахождения максимума
    public static void task1(int num1, int num2)
    {
        Scanner in = new Scanner(System.in);

        try
        {
            if(num1 > num2)
            {
                System.out.println("Максимальное число: " + num1);
            }
            else if (num2 > num1)
            {
                System.out.println("Максимальное число: " + num2);
            }
            else
            {
                throw new Exception("Числа равны!");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

    //2. Калькулятор деления
    public static void task2(double num1, double num2)
    {
        try
        {
            if(num2 == 0)
            {
                throw new ArithmeticException("На ноль делить нельзя!");
            }
            else
            {
                System.out.println("Ответ: " + num1 / num2);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("Ответ: " + num1 / num2);
    }

    //3. Конвертер строк в числа
    public static void task3(String str)
    {
        try
        {
            Integer.parseInt(str);
            System.out.println("Строка конвертирована.");
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Неверный формат строки!");
        }
    }

    //4. Проверка возраста
    public static void task4(int age)
    {
        try
        {
            if(age > 150 || age < 0)
            {
                throw new IllegalArgumentException("Некорректный возраст");
            }

            System.out.println("Корректный возраст!");
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //5. Нахождение корня
    public static void task5(double num)
    {
        try
        {
            if(num < 0)
            {
                throw new IllegalArgumentException("Нельзя найти корень из отрицательного числа!");
            }

            System.out.printf("Корень из числа %f равен %f.", num, Math.sqrt(num));
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //6. Факториал
    public static void task6(int num)
    {
        try
        {
            if(num < 0)
            {
                throw new Exception("Нельзя найти факториал отрицательного числа!");
            }

            int mult = 1;
            for (int i = 2; i <= num; i++)
            {
                mult *= i;
            }

            System.out.printf("Факториал числа %d равен %d.", num, mult);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //7. Проверка массива на нули
    public static void task7(int[] mass)
    {
        try
        {
            for (int i : mass)
            {
                if(i == 0)
                {
                    throw new Exception("В массиве есть нули!");
                }
            }
            System.out.println("В массиве нет нулей.");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //8. Калькулятор возведения в степень
    public static void task8(int a, int b)
    {
        try
        {
            if(b < 0)
            {
                throw new IllegalArgumentException("Отрицательная степень!");
            }

            int mult = a;
            for (int i = 1; i < b; i++)
            {
                mult *= a;
            }
            System.out.printf("Число %d в степени %d равно %d.", a, b, mult);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //9. Обрезка строки
    public static String task9(String str, int count)
    {
        try
        {
            if(str.length() < count)
            {
                throw new Exception("Количество символов для обрезки слишком большое!");
            }

            return str.substring(0, count);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            return "";
        }
    }

    //10. Поиск элемента в массиве
    public static void task10(int[] mass, int num)
    {
        try
        {
            boolean flag = false;

            for (int i : mass)
            {
                if(i == num)
                {
                    flag = true;
                    break;
                }
            }

            if(flag)
            {
                System.out.printf("В массиве есть число %d.", num);
            }
            else
            {
                throw new Exception("В массиве нет числа " + num + '!');
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //11. Конвертация в двоичную систему
    public static void task11(int num)
    {
        try
        {
            if(num < 0)
            {
                throw new IllegalArgumentException("Отрицатаельное число!");
            }
            System.out.printf("Число %d в двоичной системе счисления %s", num, Integer.toBinaryString(num));
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //12. Проверка делимости
    public static void task12(int num1, int num2)
    {
        try
        {
            if(num2 == 0)
            {
                throw new ArithmeticException("Второе число равно нулю!");
            }

            if(num1 % num2 == 0)
            {
                System.out.printf("Число %d делиться на число %d", num1, num2);
            }
            else
            {
                System.out.printf("Число %d не делиться на число %d", num1, num2);
            }
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //13. Чтение элемента списка
    public static int task13(int[] mass, int index)
    {
        try
        {
            if(mass.length - 1 < index)
            {
                throw new IndexOutOfBoundsException("Индекс выходит за рамки!");
            }
            return mass[index];
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
        return mass[0];
    }

    //14. Парольная проверка
    public static void task14(String password)
    {
        try
        {
            if(password.length() < 8)
            {
                throw new Exception("Пароль слишком простой!"); // Не нашел WeakPasswordException
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //15. Проверка даты
    public static void task15(String dateString)
    {
        try
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate localDate = LocalDate.parse(dateString, formatter);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //16. Конкатенация строк
    public static void task16(String str1, String str2)
    {
        try
        {
            if(str1 == null || str2 == null)
            {
                throw new NullPointerException("Одна из строк равна null");
            }

            System.out.println("Результат конкатенации: " + str1 + str2);
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //17. Остаток от деления
    public static int task17(int num1, int num2)
    {
        try
        {
            if(num2 == 0)
            {
                throw new Exception();
            }

            return num1 % num2;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return -1;
    }

    //18. Квадратный корень
    public static void task18(double num)
    {
        try
        {
            if(num < 0)
            {
                throw new IllegalArgumentException("Нельзя найти квадратный корень из отрицательного числа!");
            }

            System.out.printf("Квадратный корень из числа %f равен %f.", num, Math.sqrt(num));
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //19. Конвертер температуры
    public static void task19(int temperatureC)
    {
        try
        {
            if(temperatureC < -273)
            {
                throw new Exception("Температура не может быть ниже абсолютного нуля");
            }

            System.out.println("Температура в фаренгейтах: " + (temperatureC * 9 / 5 + 32));
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //20. Проверка строки на пустоту
    public static void task20(String str)
    {
        try
        {
            if(str == "" || str == null)
            {
                throw new Exception("Строка пустая или равна null");
            }

            System.out.println("Строка не пустая и не равна null");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}