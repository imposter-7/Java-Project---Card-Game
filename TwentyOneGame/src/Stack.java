import java.util.ArrayList;

public class Stack<T>
{
    private ArrayList<T> sList;

    public Stack ()
    {
        sList= new ArrayList<> ();
    }

    public void push (T element)
    {
        sList.add (element);
    }

    public T pop ()
    {
        T tempElement= null;

        if (sList.size () != 0)
            tempElement= sList.remove (sList.size () - 1);

        return tempElement;
    }

    public int size ()
    {
        return sList.size ();
    }

    public boolean isEmpty ()
    {
        return sList.isEmpty ();
    }

    public T peek ()
    {
        T tempElement= null;

        if (sList.size () != 0)
            tempElement= sList.get (sList.size () - 1);

        return tempElement;
    }

//    public void PrintStack(T element)
//    {
//
//
//    }


    @Override
    public String toString() {
        return "Stack" + sList;
    }
}