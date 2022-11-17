import java.util.ArrayList;

public class MyStack<E> extends ArrayList<E>
{
    public boolean isEmpty()
    {
        return super.isEmpty();
    }

    public int getSize()
    {
        return super.size();
    }

    public E peek()
    {
        return super.get(super.size() - 1);
    }

    public E pop()
    {
        return super.remove(super.size() - 1);
    }

    public void push(E x)
    {
        super.add(x);
    }

    @Override
    public String toString()
    {
        return "stack: " + super.toString();
    }
}
