import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        InsInfoContainer container = new InsInfoContainer();

        System.out.println("How many objects do you want to store?");
        int index = 0;
        int objectCount = Integer.valueOf(scanner.nextLine());

        while (index < objectCount) {

            System.out.println("Property type: ");
            String property_type = scanner.nextLine();
            System.out.println("Property location: ");
            String property_location = scanner.nextLine();
            Property p = new Property(property_type, property_location);
            System.out.println("Value insured: "); 
            Double value_insured;
            while (true) {
                value_insured = scanner.nextDouble();
                if (value_insured < 0) {
                    System.out.println("The value has to be greater than 0.");
                } else {
                    break;
                }
            }
            InsuranceInfo ins = new InsuranceInfo(p, value_insured);
            container.insertContainer(ins);
            scanner.nextLine();

            index++;

        }

        container.printContainer();

        while (true) {
            System.out.println("\n1. Print all the properties");
            System.out.println("2. Print all the properties with an insured value higher than given value");
            System.out.println("3. Print all the properties with an insured value lower than the given value");
            System.out.println("4. Exit");

            int choice = 0;
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    container.printContainer();
                    continue;

                case 2:
                    System.out.println("\nGive value: ");
                    double value1 = scanner.nextDouble();
                    if (value1 > 0) {
                        container.printHigher(value1);
                    } else {
                        System.out.println("\nThe value has to be greater than 0.\n");
                    }
                    continue;

                case 3:
                    System.out.println("Give value: ");

                    double value2 = scanner.nextDouble();
                    if (value2 > 0) {
                        container.printLower(value2);
                    } else {
                        System.out.println("\nThe value has to be greater than 0.\n");
                    }
                    continue;

                case 4:
                    System.out.println("\nSee you!");
                    scanner.close();
                    System.exit(0);

                default:
                    continue;

            }
        } 
    }
}
