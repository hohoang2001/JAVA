package DSA_List;

import java.lang.reflect.Array;
import java.util.Arrays;

public class My_List<E> {

    public int size = 0;
    public final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public My_List() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newsize = element.length * 2;
        element = Arrays.copyOf(element, newsize);
    }
    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }
    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("index: " + i + " Size : " + i);
        }
        return (E) element[i];
    }


}
