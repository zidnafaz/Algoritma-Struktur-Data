import java.util.Scanner;

public class itemMain {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        String inputName = "";
        double inputPrice = 0;
        int inputStock = 0;

        Item Items1 = new Item("Nasi Goreng", 15000, 10);
        Item Items2 = new Item("Donat Gula", 3000, 20);
        Item Items3 = new Item("Cimory", 7000, 15);

        Item items[] = new Item[5];

        items[0] = Items1;
        items[1] = Items2;
        items[2] = Items3;

        // for (int i = 0; i < items.length; i++) {
        //     items[i].displayInfo();
        // }

        for (int i = 3; i < items.length; i++) {
            System.out.print("Input Name  : ");
            inputName = input18.nextLine();

            System.out.print("Input price : ");
            inputPrice = input18.nextDouble();
            input18.nextLine();

            System.out.print("Input Stock : ");
            inputStock = input18.nextInt();
            input18.nextLine();

            items[i] = new Item(inputName, inputPrice, inputStock);

        }

        for (int i = 0; i < items.length; i++) {
            items[i].displayInfo();
        }
    }
}
