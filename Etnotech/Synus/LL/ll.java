package Synus.LL;

public class ll {
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            size++;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            size++;
        }
    }
    void display(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    void delete(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node lastSecond = get(size-2);
            lastSecond.next=null;
        }
    }
    Node get(int index){
        Node temp=head;
         if(head==null){
                System.out.println("List is empty");
            }
        else{
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        ll list = new ll();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
        list.delete();
        list.display();
        System.out.println("Size of the list is: "+list.size);
    }
}
