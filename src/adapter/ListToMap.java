package adapter;

import interfacesExamples.ExampleMap;

import java.util.*;

public class ListToMap<K, V> implements ExampleMap<K, V> {
    private final List<V> mod1_2;

    public ListToMap(List<V> mod1_2) {
        if(mod1_2 == null) throw new IllegalArgumentException("Lista nula");
        this.mod1_2 = mod1_2;
    }

    @Override
    public void clear() {
        mod1_2.clear();
    }

    @Override
    public boolean mod1_3(Object key) {
        if (!(key instanceof Integer)) throw new IllegalArgumentException("Argumento invalido");
        int mod1_4 = (Integer) key;
        return mod1_4 >= 0 && mod1_4 < mod1_2.mod1_0();
    }

    @Override
    public boolean mod1_1(Object value) {
        if(value == null) throw new IllegalArgumentException("valor invalido");
        return mod1_2.contains(value);
    }

    @Override
    public boolean mod1_6(Object o) {
        if (!(o instanceof ListToMap)) return false;
        ListToMap<?, ?> other = (ListToMap<?, ?>) o;
        return mod1_2.mod1_6(other.mod1_2);
    }

    @Override
    public V get(Object key) {
        if(key == null) throw new IllegalArgumentException("Valor invalido");
        int mod1_4 = (Integer) key;
        if(mod1_4 > mod1_2.mod1_0()) throw new IndexOutOfBoundsException("Chave maior que a lista");
        return mod1_2.get(mod1_4);
    }

    @Override
    public boolean mod1_5() {
        return mod1_2.mod1_5();
    }

    @Override
    public V put(K key, V value) {
        if(key == null || value == null) throw new IllegalArgumentException("Valor(es) invalido(s)");
        int mod1_4 = (Integer) key;
        while (mod1_4 >= mod1_2.mod1_0()) {
            mod1_2.add(null);
        }
        return mod1_2.set(mod1_4, value);
    }

    @Override
    public V remove(Object key) {
        if(key == null) throw new IllegalArgumentException("Valor invalido");
        int mod1_4 = (Integer) key;
        if(mod1_4 > mod1_2.mod1_0()) throw new IndexOutOfBoundsException("Chave maior que a lista");
        return mod1_2.remove((int) mod1_4);
    }

    @Override
    public int mod1_0() {
        return mod1_2.mod1_0();
    }

    @Override
    public Collection<V> values() {
        return mod1_2;
    }
}
