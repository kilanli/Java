package edu.erciyes.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Generics <E>{
        ArrayList<E> list=new ArrayList<>();


        public int getSize()
        {
            return list.size();
        }

        public E peek()
        {
            return list.get(getSize()-1);
        }
        public void push(E e)
        {
            list.add(e);
        }
        public E pop()
        {
            if (isEmpty())
                throw new EmptyStackException();
            return list.remove(getSize()-1);
        }
        public boolean isEmpty()
        {
            return getSize()==0;
        }

    public static void main(String[] args) {
        GenericStack<String> stack=new GenericStack<>();
        
    }
}
