package browserbuddy.impl;

public class TabHistory {

    private PageNode current;

    public void visit(String url) {
        PageNode newNode = new PageNode(url);

        if (current != null) {
            current.next = null;     // clear forward history
            newNode.prev = current;
            current.next = newNode;
        }

        current = newNode;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page");
        }
    }

    public boolean isEmpty() {
        return current == null;
    }

    public String getCurrentPage() {
        return current == null ? "Blank Tab" : current.url;
    }
}
