public class prlinked {
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
        prlinked list=new prlinked();
        list.addFirst("List");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addFirst("Hello");
        list.printList();

    }
    
}

