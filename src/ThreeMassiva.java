import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class ThreeMassiva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            String s = reader.readLine();
            list.add(Integer.parseInt(s));

        }
        ArrayList<Integer> First = new ArrayList<Integer>();
        ArrayList<Integer> Second = new ArrayList<Integer>();
        ArrayList<Integer> Third = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)
                Second.add(x);
            if (x % 3 == 0)
                Third.add(x);
            if (x % 2 != 0 && x % 3 != 0)
                First.add(x);
        }
        ThreeMassiva.printList(Third);
        ThreeMassiva.printList(Second);
        ThreeMassiva.printList(First);
    }

    public static void printList(List<Integer> list) {
        for (Integer Screen : list) {
            System.out.println(Screen);
        }
    }
}

