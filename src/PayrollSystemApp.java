import java.util.Scanner;
public class PayrollSystemApp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Employee emp; // employee
        String name; // name
        int type; // type
        double rate; // hourly pay rate
        int hours; // hours worked
        String prompt; // user prompt;

        while(true) {
            System.out.println("Enter employee data");
            System.out.print(" Name (or blank to quit): ");
            name = reader.nextLine();
            name = name.trim(); // Trim off leading and trailing spaces
            if (name.length() == 0) break;

            emp = new Employee();
            emp.setName(name);

// Get the type until valid
        while (true){
            prompt = " Type (" + emp.getTypeRules() + "): ";
            System.out.print(prompt);
            type = reader.nextInt();
            if (emp.setType(type)) break;
        }
// Get the hourly pay rate until valid
        while (true){
            prompt = " Hourly rate (" + emp.getRateRules() + "): ";
            System.out.print(prompt);
            rate = reader.nextDouble();
            if (emp.setRate(rate)) break;
        }
// Get the hours worked until valid
// To illustrate the possibilities we compress
// into a hard-to-read set of statements.
        System.out.print("Hours worked (" +
                emp.getHoursRules() + "): ");
        while (!emp.setHours(reader.nextInt()))
            System.out.print("Hours worked (" +
                    emp.getHoursRules() + "): ");
// Consume the trailing newline
        reader.nextLine();
// Print the name and pay
        System.out.println(" The weekly pay for " + emp.getName() +
                " is $" + emp.getPay());
    }}
    }


