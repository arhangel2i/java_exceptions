import java.util.Random;

public class Dz_01 {
    public static void main(String[] args) {
        // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
        int[] a = createFilledArray(10);
        PrintArray(a);
        int[] b = createFilledArray(10);
        PrintArray(b);

        int[] c = arrayOperMinus(a,b);
        PrintArray(c);
        // вывод с обработками ошибок реализация просто через System.out.println
        int[] b1 = createFilledArray(9);
        int[] c1 = arrayOperMinus(a,b1);
        PrintArray(c1);
    }

    public static int[] arrayOperMinus(int[] a, int[] b){
        if (a.length!=b.length){
            System.out.println("Массивы не равны по кол-ву данных");
            return null;
        }
        int[] c = new int[a.length];
        for (int i=0; i<a.length; i++){
            c[i]=a[i]-b[i];
        }
        return c;
    }

    public static int[] createFilledArray(int itemsCount){
        int[] retInt = new int[itemsCount];
        for (int i=0; i<itemsCount; i++)
        {
            retInt[i]=new Random().nextInt(0,99);
        }
        return retInt;
    }
    public static void PrintArray(int[] ar)
    {
        if (ar != null)
        {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<ar.length; i++)
            {
                sb.append(ar[i]);
                sb.append(" ");
            }
            System.out.println("Вывод массива:" + sb.toString());
        }
        else{
            System.out.println("В массиве нет значений");
        }
    }
}
