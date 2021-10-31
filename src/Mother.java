import java.util.LinkedList;

public class Mother {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();


        list.add("mother");
        list.add("washing");
        list.add("window");

        list.add(3,"exactly");
        list.add(2,"exactly");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
    }
}
