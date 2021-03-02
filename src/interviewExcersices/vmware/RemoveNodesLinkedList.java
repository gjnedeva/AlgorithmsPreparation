package interviewExcersices.vmware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Input : list: 7->3->4->8->5->1
//        x = 6
//Output : 3->4->5->1
public class RemoveNodesLinkedList {
    private Node first;
    private Node last;
    private int size;


    public RemoveNodesLinkedList(List<Integer> items) {
        for (Integer item : items) {
            add(item);
        }
    }

    private void add(Integer item) {
        Node node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public static class Node {
        private Node next;
        private int item;

        Node(int item) {
            this.item = item;
        }
    }

    public void deleteCurrentIfNextGreater(int n) {
        reverse();
        delete(n);
        reverse();
    }
    private void reverse() {
        Node prev = null;
        Node ptr = first;
        Node ptrNext = null;

        while (ptr != null) {
            ptrNext = ptr.next;

            ptr.next = prev;

            prev = ptr;
            ptr = ptrNext;
        }

        first = prev;
    }


    private void delete (int n) {
        Node ptr = first;

//        ToDO change to delete if item is >= n
        while (ptr.next != null ) {
            if (ptr.item > n) {
                ptr.next = ptr.next.next;
            } else {
                ptr = ptr.next.next;
            }
        }
    }

    // size of new linkedlist is unknown to us, in such a case simply return the list rather than an array.
    public List<Integer> toList() {
        List<Integer> list = new ArrayList<>();
        if (first == null) return list;

        for (Node x = first; x != null; x = x.next) {
            list.add(x.item);
        }

        return list;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            RemoveNodesLinkedList dgvol1 = new RemoveNodesLinkedList(Arrays.asList(1, 2, 3, 4, 5));
            dgvol1.deleteCurrentIfNextGreater(n);

            System.out.println(dgvol1.toList().toString());
    }
}
