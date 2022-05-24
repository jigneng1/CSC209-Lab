public class linkedList {
    private ToiletPaper head,tail;
    public linkedList(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return  head == null;
    }
    public void addToHead(String b,double p,int l,String c){
        head = new ToiletPaper(b,p,l,c,head); //nest of new node is current head
        if(tail == null){
            tail = head;
        }
    }
    public void addToTail(String b, double p,int l,String c){
        if(!isEmpty()){
            tail.next = new ToiletPaper(b,p,l,c,null);
            tail = tail.next;
        }
        else{
            head = tail = new ToiletPaper(b,p,l,c,head);
        }
    }

    public void deleteFromHead(){
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
        }
    }
    public void printAll(){
        for(ToiletPaper tmp = head; tmp!=null; tmp = tmp.next){
            System.out.println(tmp.getBrand());
            System.out.println(tmp.getPrice());
            System.out.println(tmp.getLength());
            System.out.println(tmp.getColor());
            System.out.println("---------------------------------");
        }
    }
    /*public void delete(int i){ // deleted by info
        if(!isEmpty()){
            if(head == tail && i == head.info){// only one node
                head =tail=null;
            }
            else if(i == head.info){ // if info is you want to delete is on head
                head = head.next;
            }
            else{
                node pred,tmp;
                for(pred = head,tmp=head.next; tmp !=null && tmp.info != i; pred =pred.next,tmp=tmp.next){
                    if(tmp != null) {// if i  found in node
                        pred.next = tmp.next;
                        if(tmp == tail)// if i is tail
                            tail = pred; // pred is tail.prev but in singly you should do this way
                    }
                }
            }
        }
    }*/
}
