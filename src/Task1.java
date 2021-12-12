public class Task1
{
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static int fact(int n){
        if(n>1)
        {
            return n*fact(n-1);
        }
        return n;
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table(){
        System.out.print("\t");
        for(int i = 1;i<11;i++)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        for(int i = 1;i<=10;i++)
        {
            System.out.print(i + "\t");
            for(int j = 1;j<11;j++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n){
        int result = 0;
        while(n>0)
        {
            result+=(n%10);
            n/=10;
        }
        return result;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if(year%4==0)
        {
            if(year%100==0 && year%400!=0)
                return false;
            return true;
        }
        return false;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        } else {
            return 365;
        }

    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n){
        switch(n)
        {
            case "Понедельник" : return 1;
            case "Вторник" : return 2;
            case "Среда"  : return 3;
            case "Четверг" : return 4 ;
            case "Пятница" : return 5;
            case "Суббота"  : return 6;
            case "Воскресенье" : return 7;
        }
        return 0;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array){
        System.out.print("[" + array[0]);
        for(int i = 1;i<array.length;i++)
        {
            System.out.print(", " + array[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array){
        for(int j = 0;j<array.length;j++)
        {
            System.out.print("[" + array[j][0]);
            for(int i = 1;i<array[j].length;i++)
            {
                System.out.print(", " + array[j][i]);
            }
            System.out.print("]");
            System.out.println();
        }

    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array){
        boolean sorted = false;
        while(!sorted)
        {
            sorted = true;
            for(int i = 0;i<array.length-1;i++)
            {
                if(array[i]>array[i+1])
                {
                    int a = array[i+1];
                    array[i+1] = array[i];
                    array[i] = a;
                    sorted = false;
                }
            }
        }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}