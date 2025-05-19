public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    // add - first , last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
        
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void printList(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("Null");
    }

    public static void main(String []args){
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This");
        list.printList();
        list.addLast("H");
        list.printList();

    }
    
}
