package L06;

import java.util.LinkedList;

public class QueueLL {

    //[1,2,3,4,5,6,7,8]
    private LinkedList<Integer> qu;

    //Memory(n)
    public QueueLL() {
        this.qu = new LinkedList<>();
    }

    //O(1)
    public void enQueue(int data){
        qu.addFirst(data);
    }

    //O(1)
    public int deQueue(){
        if(qu.isEmpty())
            return Integer.MAX_VALUE;
        return qu.removeLast();
    }

    //O(1)
    public boolean isEmpty(){
        return qu.isEmpty();
    }

    //O(n)
    public int get(int index) {
        if(qu.isEmpty()||index<0||index>=qu.size())
            return Integer.MAX_VALUE;
        return qu.get(index);

    }



}
