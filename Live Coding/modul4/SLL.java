import java.util.Scanner;

class Parcel {
    String trackingId;
    String recipientName;

    Parcel(String trackingId, String recipientName) {
        this.trackingId = trackingId;
        this.recipientName = recipientName;
    }
}

// Tugas 1 - Lengkapi Class Node berdasarkan ADT Linked List
class Node {
    // TODO: Definisikan atribut dan constructor Node
}

class SingleLinkedList {
    Node head;
    Node tail;
    int size;

    void initialize() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    int size() {
        return size;
    }

    void addFirst(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            input.next = head;
            head = input;
        }
        size++;
    }

    //Tugas 2 - Lengkapi Method 
    void addLast(Node input) {
        // lengkapi bagian ini. logicnya mirip kyk addFirst
    }

    // Tugas 3 - Method menghapus parsel 
    void removeParcel(String trackingId) {
        // TODO: Temukan dan hapus parcel dgn ID yg sesuai
        // Perhatikan head, tail, dan ukuran SLL
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data.trackingId + " " + current.data.recipientName);
            current = current.next;
        }
        System.out.println("Size: " + size);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SLL list = new SLL();
        list.initialize();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String trackingId = scanner.next();
            String recipientName = scanner.next();
            Parcel parcel = new Parcel(trackingId, recipientName);
            list.addLast(new Node(parcel));
        }

        String deliveredId = scanner.next();
        list.removeParcel(deliveredId);
        list.printList();
    }
}