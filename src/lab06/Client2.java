package lab06;

import java.util.ArrayList;
import java.util.List;

public class Client2 {

    public static void main(String[] args) {

        Item i1 = new Item("Pen", 12.5);
        Item i2 = new Item("Pencil", 9.25);

        List<Item> itemList = new ArrayList<>();
        itemList.add(i1);
        itemList.add(i2);
        itemList.add(new Item("Eraser", 5));

        for (int i=0; i<itemList.size(); i++) {
            System.out.println(itemList.get(i));
        }

        for (Item item: itemList) {
            System.out.println(item);
        }

        itemList.forEach(System.out::println);

        System.out.println("Filtered");
        itemList.stream().filter(i -> i.getPrice() < 10).forEach(System.out::println);

    }

}
