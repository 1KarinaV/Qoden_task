import java.util.Scanner;

class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class HashTable {
    private ListNode[] values;

    public HashTable(int size) {
        values = new ListNode[size];
    }

    public void insert(int newValue) {
        int index = newValue % values.length;
        ListNode newNode = new ListNode(newValue);
        ListNode current = values[index];
        if (current == null) {
            values[index] = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void print() {
        for (int i = 0; i < values.length; i++) {
            System.out.print(i + ":");
            ListNode current = values[i];
            while (current != null) {
                System.out.print(" " + current.value);
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        HashTable hashTable = new HashTable(N);

        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            int newValue = Integer.parseInt(number);
            hashTable.insert(newValue);
        }

        hashTable.print();
    }
}
