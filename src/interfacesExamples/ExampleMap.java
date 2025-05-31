package interfacesExamples;

import java.util.Collection;

public interface ExampleMap<K, V> {
    void clear();
    boolean mod4_2(Object key);
    boolean mod4_1(Object value);
    boolean mod4_4(Object o);
    V get(Object key);
    boolean mod4_3();
    V put(K key, V value);
    V remove(Object key);
    int mod4_0();
    Collection<V> values();
}

