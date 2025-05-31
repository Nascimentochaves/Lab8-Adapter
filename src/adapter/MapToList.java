package adapter;

import interfacesExamples.ExampleList;

import java.util.*;

public class MapToList<E> implements ExampleList<E> {
    private final Map<Integer, E> mod2_4;

    public MapToList(Map<Integer, E> mod2_4) {
        if(mod2_4 == null) throw new IllegalArgumentException("Mapa vazio");
        this.mod2_4 = mod2_4;
    }

    @Override
    public boolean mod2_1(E element) {
        if(element == null) throw new IllegalArgumentException("Elemento invalido");
        int mod2_3 = mod2_4.mod2_0();
        mod2_4.put(mod2_3, element);
        return true;
    }

    @Override
    public void clear() {
        mod2_4.clear();
    }

    @Override
    public boolean mod2_2(Object o) {
        if(o == null) throw new IllegalArgumentException("Argumento invalido");
        return mod2_4.containsValue(o);
    }

    @Override
    public boolean mod2_6(Object o) {
        if (!(o instanceof MapToList)) return false;
        MapToList<?> other = (MapToList<?>) o;
        return mod2_4.mod2_6(other.mod2_4);
    }

    @Override
    public E get(int mod2_3) {
        if(mod2_3 < 0 || mod2_3 >= mod2_4.mod2_0()) throw new IndexOutOfBoundsException("Valor invalido");
        return mod2_4.get(mod2_3);
    }

    @Override
    public boolean mod2_5() {
        return mod2_4.mod2_5();
    }

    @Override
    public Iterator<E> iterator() {
        return mod2_4.values().iterator();
    }

    @Override
    public E remove(int mod2_3) {
        if(mod2_3 < 0 || mod2_3 >= mod2_4.mod2_0()) throw new IndexOutOfBoundsException("Valor invalido");
        return mod2_4.remove(mod2_3);
    }

    @Override
    public int mod2_0() {
        return mod2_4.mod2_0();
    }

    @Override
    public Object[] toArray() {
        return mod2_4.values().toArray();
    }
}
