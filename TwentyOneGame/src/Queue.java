import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Queue<T>
{
    ArrayList<T> qList;

    public Queue ()
    {
        qList= new ArrayList<T> ();
    }

    public void enQ (T element)
    {
        qList.add (element);
    }

    public T deQ ()
    {
        T item= null;

        if (this.size () > 0)
            item= qList.remove (0);

        return item;
    }

    public int size ()
    {
        return qList.size ();
    }

    public void printQ ()
    {
        for (T element : qList)
            System.out.println (element + " ");


    }

    public  void fillQueues(Queue queue1, Queue queue2, Queue queue3, Stack stack)
    {
        // this function works on distributing papers into 3 columns

        for (int i=0; i<7; i++)
        {

            queue1.enQ(stack.pop());
            queue2.enQ(stack.pop());
            queue3.enQ(stack.pop());

        }

    }
    public  void printQueues(Queue queue1,Queue queue2,Queue queue3) {
        Iterator<Card> iterator1 = queue1.qList.iterator();
        Iterator<Card> iterator2 = queue2.qList.iterator();
        Iterator<Card> iterator3 = queue3.qList.iterator();

        for (int i=0 ; i<7 ; i++)
        {
            System.out.print(iterator1.next()+ " \t\t "+ iterator2.next()+" \t\t "+iterator3.next());
            System.out.println();
        }
    }



}
