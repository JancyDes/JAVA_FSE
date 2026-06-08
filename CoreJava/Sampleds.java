public class Sampleds
{
    public static void main(String args[])
    {
        sll s = new sll();
        s.insertStart(20);
        s.insertStart(10);
        s.insertStart(60);
        s.insertEnd(30);
        s.insertPos(40,2);
        s.removeFirst();
        s.removeLast();
        s.traversal();
        System.out.println(s.find(30));
        System.out.println(s.length());
        s.traversal();
        System.out.println("Middle: " + s.findMiddle());
        s.updateValue(20, 25);
        s.updatePosition(2, 99);
        s.traversal();
        s.insertEnd(1);
        s.insertEnd(2);
        s.insertEnd(3);
        s.insertEnd(4);
        s.insertEnd(1);
        s.insertEnd(1);
        s.insertEnd(2);
        System.out.println(s.countOccurrence(1));
    }
}
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
class sll{
        
    Node head = null;
    Node tail = null;
    void insertStart(int data)
    {
        Node n = new Node(data);
        if(head==null)
        {
            this.head = n;
            this.tail = n;
            return;
        }
        n.next = head;
        head = n;
    }
    void insertEnd(int data)
    {
        Node n = new Node(data);
        if(head==null)
        {
            this.head = n;
            this.tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }
    void insertPos(int data,int pos)
    {
        if(pos==1)
        {
            insertStart(data);
            return;
        }
        Node temp = head;
        for(int i = 1;i<pos-1 && temp.next!=null;i++)
        {
            temp = temp.next;
        }
        if(temp.next==null)
        {
            insertEnd(data);
            return;
        }
        Node n =new Node(data);
        n.next = temp.next;
        temp.next = n;
    }

        void removeFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;         
    }

   void removeLast() {
    if(head == null) {
        System.out.println("List is Empty");
        return;
    }

    if(head.next == null) {
        head = null;
        tail = null;
        return;
    }

    Node temp = head;

    while(temp.next != tail) {
        temp = temp.next;
    }
    
    temp.next = null;
    tail = temp;
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
    public int find(int key)
    {
        int pos = 1;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return pos;
            }
            temp=temp.next;
            pos++;
        }
        return -1;
    }
    public int length() {
    int count = 0;
    Node temp = head;

    while (temp != null) {
        count++;
        temp = temp.next;
    }

    return count;
}
public int findMiddle() {
    if (head == null) {
        throw new RuntimeException("List is empty");
    }

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow.data;
}
public boolean updateValue(int oldValue, int newValue) {
    Node temp = head;

    while (temp != null) {
        if (temp.data == oldValue) {
            temp.data = newValue;
            return true;
        }
        temp = temp.next;
    }

    return false;
}
public boolean updatePosition(int pos, int newValue) {
    if (pos <= 0) {
        return false;
    }

    Node temp = head;
    int currentPos = 1;

    while (temp != null && currentPos < pos) {
        temp = temp.next;
        currentPos++;
    }

    if (temp == null) {
        return false;
    }

    temp.data = newValue;
    return true;
}
public int countOccurrence(int key) {
    int count = 0;
    Node temp = head;

    while (temp != null) {
        if (temp.data == key) {
            count++;
        }
        temp = temp.next;
    }

    return count;
}
}