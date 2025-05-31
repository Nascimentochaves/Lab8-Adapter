package interfacesExamples;

import java.util.Iterator;

public interface ExampleList<E> extends Iterable<E>{
    boolean mod3_1(E element);
    void clear();
    boolean mod3_2(Object o);
    boolean mod3_5(Object o);
    E get(int mod3_3);
    boolean mod3_4();
    Iterator<E> iterator();
    E remove(int mod3_3);
    int mod3_0();
    Object[] toArray();
}
