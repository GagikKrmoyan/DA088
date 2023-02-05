import org.w3c.dom.Node;

public class MyLinkedFirst<T> {
    private Node first;

    public MyLinkedFirst(){
        first = null;

    }

    public void addToLast(T item){
        Node last;
        Node prev = last;
        last = new Node(item, null);
        if(!isEmpety()){
            prev.next = last;

        } else {
            first
        }
    }

    private boolean isEmpety() {
        boolean b = false;
        return b;
    }
}
