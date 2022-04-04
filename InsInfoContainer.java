import java.util.ArrayList;

public class InsInfoContainer {
    private ArrayList<InsuranceInfo> container = new ArrayList<InsuranceInfo>();

    // Insert object in to arraylist.
    public void insertContainer(InsuranceInfo InsuranceInfo) {
        container.add(InsuranceInfo);

    }

    // Print all the contents of the container.
    public void printContainer() {
        System.out.println(container);
    }

    // Print the properties with a value higher than a boundary value, also print
    // boundary value.
    public void printHigher(double amount) {
        for (int i = 0; i < container.size(); i++) {
            InsuranceInfo tempProperty = container.get(i);
            if (tempProperty.getValue_insured() > amount) {
                System.out.println(container.get(i) + " " + "\n" + "Entered value threshold = " + amount);
            }
        }

    }

    // Print the properties with a value lower than a boundary value, also print
    // boundary value.
    public void printLower(double amount) {
        for (int i = 0; i < container.size(); i++) {
            InsuranceInfo tempProperty = container.get(i);
            if (tempProperty.getValue_insured() < amount) {
                System.out.println(container.get(i) + " " + "\n" + "Entered value threshold = " + amount);
            }
        }

    }
}
