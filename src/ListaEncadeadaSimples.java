public class ListaEncadeadaSimples<T> {
    class Node {
        T data;
        Node next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int nextId;
    public int size;

    public ListaEncadeadaSimples() {
        head = null;
        tail = null;
        nextId = 1;
        size = 0;
    }

    public void show() {
        Node p = head;

        if (p == null) {
            System.out.println("LISTA VAZIA \n");
        } else {
            while (p != null) {
                System.out.println("Dado: " + p.data);
                p = p.next;
            }
        }

        System.out.println("size = " + size + "\n");
    }

    public void addFirst(T dado) {
        Node novo = new Node(dado);
        if (head == null) {
            head = novo;
            tail = novo;
        } else {
            novo.next = head;
            head = novo;
        }

        size++;
    }

    public void addLast(T dado) {
        Node novo = new Node(dado);

        if (head == null) {
            head = novo;
            tail = novo;
        } else {
            tail.next = novo;
            tail = novo;
        }

        size++;
    }

    private Node searchNode(T criterio) {
        Node p = head;

        while (p != null) {
            if (p.data.equals(criterio)) {
                return p;
            }
            p = p.next;
        }

        return null;
    }

    public T search(T criterio) {
        Node p = searchNode(criterio);

        if (p == null) {
            return null;
        } else {
            return p.data;
        }
    }
}