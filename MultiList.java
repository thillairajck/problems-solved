class Node {
    int data;
    Node right, down;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.down = null;
    }
}
public class MultiList {
    static Node head = null;
    static Node insertRow(Node lastRow, int[] values) {
        Node rowHead = new Node(values[0]);
        Node temp = rowHead;

        for (int i = 1; i < values.length; i++) {
            temp.right = new Node(values[i]);
            temp = temp.right;
        }

        if (head == null)
            head = rowHead;
        else
            lastRow.down = rowHead;

        return rowHead;
    }
    static void traverse() {
        Node row = head;

        while (row != null) {
            Node col = row;
            while (col != null) {
                System.out.print(col.data + " ");
                col = col.right;
            }
            System.out.println();
            row = row.down;
        }
    }
    static void search(int key) {
        Node row = head;

        while (row != null) {
            Node col = row;
            while (col != null) {
                if (col.data == key) {
                    System.out.println(key + " Found");
                    return;
                }
                col = col.right;
            }
            row = row.down;
        }
        System.out.println(key + " Not Found");
    }
    static void delete(int key) {
        Node row = head;

        while (row != null) {
            if (row.data == key) {
                System.out.println("Cannot delete first node of a row.");
                return;
            }
            Node temp = row;
            while (temp.right != null && temp.right.data != key)
                temp = temp.right;
            if (temp.right != null) {
                temp.right = temp.right.right;
                System.out.println(key + " Deleted");
                return;
            }
            row = row.down;
        }
        System.out.println("Element Not Found");
    }
    public static void main(String[] args) {
        Node r1 = insertRow(null, new int[]{10, 20, 30});
        Node r2 = insertRow(r1, new int[]{40, 50, 60});
        insertRow(r2, new int[]{70, 80, 90});

        System.out.println("Multilist:");
        traverse();

        System.out.println("\nSearch 50:");
        search(50);

        System.out.println("\nDelete 50:");
        delete(50);

        System.out.println("\nAfter Deletion:");
        traverse();
    }
}