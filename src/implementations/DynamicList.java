package implementations;

/**
 * exercises from Nakov book *
 * @author Gloria Nedeva
 */
public class DynamicList {
    private class Node {
        Object element;
        Node next;

        Node(Object element, Node prevNode) {
            this.element = element;
            prevNode.next = this;
        }

        Node(Object element) {
            this.element = element;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int count;