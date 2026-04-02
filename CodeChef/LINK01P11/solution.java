void insertAfterK(int value, int k) {
    Node newNode = new Node(value);
    Node current = head;

    if (current == null) {
        head = newNode;
        return;
    }

    for (int i = 1; i < k && current != null; i++) {
        current = current.next;
    }

    if (current == null) return;

    newNode.next = current.next;
    current.next = newNode;
}