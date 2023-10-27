import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Atomic weights [g/mol]
        HashMap<String, Double> atomicWeights = new HashMap<>();
        atomicWeights.put("Hydrogen", 1.00797);
        atomicWeights.put("Helium", 4.00260);
        atomicWeights.put("Lithium", 6.941);
        atomicWeights.put("Beryllium", 9.01218);
        atomicWeights.put("Boron", 10.81);
        atomicWeights.put("Carbon", 12.011);
        atomicWeights.put("Nitrogen", 14.0067);
        atomicWeights.put("Oxygen", 15.9994);

        System.out.println("HashMap:");
        for(Map.Entry<String,Double> element : atomicWeights.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue());
        }
        System.out.println();

        ArrayList<Map.Entry<String,Double>> atomicWeightsList = new ArrayList<>(atomicWeights.entrySet());

        atomicWeightsList.sort(Comparator.comparing(Map.Entry::getKey));
        System.out.println("Alphabetical order ArrayList");
        for(Map.Entry<String,Double> element : atomicWeightsList) {
            System.out.println(element.getKey() + " = " + element.getValue());
        }


        System.out.println();
        atomicWeightsList.sort(Comparator.comparing(Map.Entry::getValue));
        System.out.println("ArrayList ordered by weight");
        for(Map.Entry<String,Double> element : atomicWeightsList) {
            System.out.println(element.getKey() + " = " + element.getValue());
        }




        //--------------------------------------------------
        //LHV [MJ/kg]
        System.out.println("LinkedHashMap:");
        LinkedHashMap<String, Double> lowerHeatingValues = new LinkedHashMap<String,Double>();
        lowerHeatingValues.put("Hydrogen", 141.80);
        lowerHeatingValues.put("Methane", 55.8);
        lowerHeatingValues.put("Ethane", 51.9);
        lowerHeatingValues.put("Propane", 50.35);
        lowerHeatingValues.put("Butane", 49.5);
        lowerHeatingValues.put("Pentane", 48.6);
        lowerHeatingValues.put("Paraffin wax", 46.0);
        lowerHeatingValues.put("Kerosene", 46.2);
        lowerHeatingValues.put("Diesel", 44.8);
        lowerHeatingValues.put("Coal (Anthracite)", 32.50);
        lowerHeatingValues.put("Coal (Lignite)", 15.00);

        System.out.println();
        System.out.println("Lower heating values of common fuels unordered");
        for ( Map.Entry<String,Double> element : lowerHeatingValues.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue() + " [MJ/kg]");
        }


        System.out.println("Lower heating values of common fuels alphabetically oredered by a TreeMap");
        TreeMap<String,Double> lowerHeatingValuesTree = new TreeMap<>(lowerHeatingValues);
        System.out.println();
        for(Map.Entry<String,Double> element : lowerHeatingValuesTree.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue() + " [MJ/kg]");
        }


















    }
}
