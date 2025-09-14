public class SalaryWorker extends Worker {
    private double salary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPay, double salary) {
        super(firstName, lastName, ID, title, YOB, hourlyPay);
        this.salary = salary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return salary / 52;
    }

    @Override
    public String toCSVRecord() {
        return getIDNum() + "," + getFirstName() + "," + getLastName() + "," + getYOB() + "," + hourlyPay + "," + salary;
    }

    @Override
    public String toXMLRecord() {
        return "<Person>"
                + "<FirstName>" + getFirstName() + "</FirstName>"
                + "<LastName>" + getLastName() + "</LastName>"
                + "<ID>" + getIDNum() + "</ID>"
                + "<Title>" + getTitle() + "</Title>"
                + "<YOB>" + getYOB() + "</YOB>"
                + "<HourlyPay>" + hourlyPay + "</HourlyPay>"
                + "<Salary>" + salary + "</Salary>"
                + "</Person>";
    }

    @Override
    public String toJSONRecord() {
        return "{"
                + "\"firstName\": \"" + getFirstName() + "\", "
                + "\"lastName\": \"" + getLastName() + "\", "
                + "\"ID\": \"" + getIDNum() + "\", "
                + "\"title\": \"" + getTitle() + "\", "
                + "\"YOB\": " + getYOB() + ", "
                + "\"hourlyPay\": " + hourlyPay + ", "
                + "\"salary\": " + salary
                + "}";
    }
}
