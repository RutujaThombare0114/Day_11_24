public class Doubly{
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    Node head=null;
    Node tail=null;


    public void insertbig(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }

    public void insert_mid(int data, int pos){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            tail = new_node;
        }
        else{
            Node temp = head;
            Node ptr = temp.next;
            for(int i=0; i<pos-1;i++){
                temp = ptr;
                ptr = ptr.next;
            }
            new_node.prev = temp;
            new_node.next = ptr;
            temp.next = new_node;
            ptr.prev = new_node;
        }
    }

    public void insertend(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
    public void display(){
        if(head==null){
            System.out.println("ll is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;

        }
    }
    public void deletebig(){
        if(head==null){
            System.out.println("LL is empty");

        }
        Node temp=head;
        temp=temp.next;
        temp.prev=null;
        head=temp;
    }

    public void deletemid(int pos){
        if(head==null){
            System.out.println("LL is empty");

        }
        Node temp1=head;
        Node ptr=temp1.next;
        for(int i=0;i<pos-1;i++){
            temp1=ptr;
            ptr=ptr.next;
        }
        temp1.next=ptr.next;
        ptr.next.prev=temp1;


    }

    public void deleteend(){
        if(head==null){
            System.out.println("LL is empty");

        }
        Node last=tail;
        last=last.prev;
        last.next=null;
        

    }


    public static void main(String args[]){
        Doubly d=new Doubly();
        d.insertbig(44);
        d.insertbig(33);
        d.insertend(55);
        d.deletebig();
        d.deleteend();
        
        d.display();
    }

}

