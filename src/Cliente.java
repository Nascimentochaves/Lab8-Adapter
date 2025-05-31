import adapter.ListToMap;
import adapter.MapToList;
import interfacesExamples.ExampleList;
import interfacesExamples.ExampleMap;

import java.util.*;

public class Cliente {
    public static void main(String[] args) {
        // Adaptando List para Map
        List<String> mod0_0 = new ArrayList<>();
        mod0_0.add("Maçã");
        mod0_0.add("Banana");

        ExampleMap<Integer, String> mapAdapter = new ListToMap<>(mod0_0);
        mapAdapter.put(2, "Laranja");
        System.out.println("ListToMapAdapter: " + mapAdapter.values());

        // Adaptando Map para List
        Map<Integer, String> mod0_1 = new HashMap<>();
        mod0_1.put(0, "João");
        mod0_1.put(1, "Maria");

        ExampleList<String> listAdapter = new MapToList<>(mod0_1);
        listAdapter.get("José");
        System.out.println("MapToListAdapter: " + Arrays.toString(listAdapter.toArray()));
    }
}
