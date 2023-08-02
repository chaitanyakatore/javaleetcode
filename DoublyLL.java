class DoublyLinkedList{

private Node head;
 
  
  public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head;
    node.prev = null;
    if(head!=null){
    head.prev = node;
    }
    head = node;
  }

  public void insertLast(int val){
    Node node = new Node(val);
    Node last = head;
    node.next = null;

    if(head==null){
      node.prev = null;
      head = node;
      return ;
    }

    while(last.next!=null){
      last = last.next;
    }
    last.next = node;
    node.prev = last;
  }

  public void display(){
    Node node = head;
    while(node!=null){
      System.out.print(node.val + " => ");
      node=node.next;
    }
    System.out.println("END");
  }
  
  
  class Node{
    private int val;
    private Node next;
    private Node prev;

    public Node(int val){
      this.val = val;
    }
    
    public Node(int val, Node prev, Node next){
      this.val = val;
      this.prev = prev;
      this.next = next;
    }
  }
}
