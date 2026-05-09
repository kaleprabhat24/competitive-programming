class Solution{
    static int solve(Node root){
        if (root == null || root.next == null || root.next.next == null) {
            return 0;
        }

        int count = 0;

        Node prev = root;
        Node curr = root.next;

        while (curr.next != null) {
            Node next = curr.next;

            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {
                count++;
            }

            prev = curr;
            curr = next;
        }

        return count;
    }
}