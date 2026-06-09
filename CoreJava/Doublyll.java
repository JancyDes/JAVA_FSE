public class Doublyll{
    public static void main(String args[])
    {
        method m = new method();
        m.insertEnd(10);
        m.insertEnd(20);
        m.insertStart(2);
        m.insertStart(1);
        m.insertAtPos(3,300);
        m.insertAtPos(5,500);
        m.deleteStart();
        m.deleteEnd();
        m.traversal();
        m.deleteFromPosition(3);
        //System.out.println(m.head.prev+" "+m.head.data+" "+m.head.next+"\n"+m.tail.prev+" "+m.tail.data+" "+m.tail.next);
        //System.out.println(m.head.data+" "+m.head.next.data+" "+m.head.next.next.data+" "+m.head.next.next.next.data);
    }
}
class Node
{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class method{
    Node head = null;
    Node tail = null;
    void insertEnd(int data)
    {
        Node nn = new Node(data);
        if(head == null)
        {
            head = tail = nn;
            return;
        }
        tail.next = nn;
        nn.prev = tail;
        tail = nn;
    }
    void insertStart(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head = nn;
            return;
        }
        head.prev = nn;
        nn.next = head;
        head = nn;
    }
    void insertAtPos(int pos,int data)
    {
        Node nn = new Node(data);
        if(pos==1)
        {
            insertStart(data);
            return;
        }
        Node temp = head;
        if(temp==tail)
        {
            insertEnd(data);
            return;
        }
        for(int i=1;i<pos-1 && temp.next!=tail;i++)
        {
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
        nn.prev = temp;
    }
    void traversal()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }
         System.out.println("null");
    }
    void deleteEnd()
    {

        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while(temp.next!=tail)
        {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    void deleteStart()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.prev =null;
    }
    void deleteFromPosition(int position) {

        if (position == 1) {
            deleteStart();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == tail) {
            deleteEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    }