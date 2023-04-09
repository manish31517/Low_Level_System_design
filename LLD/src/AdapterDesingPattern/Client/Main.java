package AdapterDesingPattern.Client;

import AdapterDesingPattern.Adaptee.WeightMachineForBabies;
import AdapterDesingPattern.Adapter.WeightMachineAdapter;
import AdapterDesingPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
