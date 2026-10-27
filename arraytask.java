import java.util.Scanner;

class Array {
    private int items[];
    private int count;

    Array(int size) {
        items = new int[size];
        count = 0;
    }

    public void append(int item) {
        if (count == items.length) {
            System.out.println("Array is full");
            return;
        } else {
            items[count] = item;
            count++;
        }
    }

    public void traverse() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void index(int index) {
        System.out.println(items[index]);
    }

    public boolean search(int item) {
        for (int i = 0; i < count; i++) {
            if (item == items[i]) {
                return true;
            }
        }
        return false;

    }

    public void check() {
        if (items.length == count) {
            System.out.println("Array is full");
        } else {
            System.out.println("There are " + (items.length - count) + " available spaces");

        }
    }

    public void insert(int item, int position) {
        if (items.length == count) {
            System.out.println("Cannot insert");
            return;
        }

        for (int i = count; i > position; i--) {
            items[i] = items[i - 1];
        }
        items[position] = item;
        count++;

    }

    public void deleteLast() {
        if (count > 0) {
            count--;
        }
    }

    public void delete(int position) {
        if (count > 0) {
            for (int i = position; i < count - 1; i++) {
                items[i] = items[i + 1];

            }
            count--;
        }
    }

}

public class arraytask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = in.nextInt();
        boolean isRunning = true;
        Array a1 = new Array(size);
        while (isRunning == true) {
            System.out.println("----- ARRAY OPERATIONS MENU -----");
            System.out.println("1. Append ");
            System.out.println("2. Traverse ");
            System.out.println("3. Index");
            System.out.println("4. Search ");
            System.out.println("5. Insert");
            System.out.println("6. Delete");
            System.out.println("7. Delete last");
            System.out.println("8. Check ");
            System.out.println("9. Exit");
            System.out.println("-----------------------------------");

            System.out.println("Enter your choice");
            int choice=in.nextInt();
            switch (choice) {
                case 1:
                    int itemAppend;
                    System.out.println("Enter the item");
                    a1.append(itemAppend=in.nextInt());
                    
                    break;
                case 2:
                    a1.traverse();
                    break;

                case 3:
                    int index;
                    System.out.println("Enter the index");
                    a1.index(index=in.nextInt());
                    break;

                case 4:
                    int itemSearch;
                    System.out.println("Enter the item");
                   
                    if (a1.search(itemSearch=in.nextInt())) {
                        System.out.println("Found");
                    }else{
                        System.out.println("Not found");
                    }
                    
                    
                    break;

                case 5:
                    int itemInsert;
                    int positionInsert;
                    System.out.println("Enter the item and position");
                    a1.insert(itemInsert=in.nextInt(), positionInsert=in.nextInt());
                    break;

                case 6: 
                int positionDelete;
                System.out.println("Enter the position");
                a1.delete(positionDelete=in.nextInt());
                    break;

                case 7:
                    a1.deleteLast();
                    break;
                case 8:
                    a1.check();
                    break;

                case 9:
                    isRunning=false;
                    System.out.println("Thank you for using our program");
                    break;

                default:
                    System.out.println("Choice must be between 1 to 9");
                    break;
            }
            

        }
    }
}
