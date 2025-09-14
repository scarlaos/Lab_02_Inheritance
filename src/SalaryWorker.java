public class SalaryWorker extends Worker{
    protected double salary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPay, double salary){
        super(firstName, lastName, ID, title, YOB, hourlyPay);
        this.salary = salary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWork){
        return salary/52;
    }

    @Override
    public void displayWeeklyPay(double hoursWork){
        System.out.printf("Weekly pay of Annual salary: $%.2f%n", calculateWeeklyPay(hoursWork));
    }

    @Override
    public String toCSVRecord() {
        return super.toCSVRecord() + ", " + salary;
    }

    @Override
    public String toXMLRecord() {
        return "<Person>" + "<FirstName>" + getFirstName() + "</FirstName>"
                + "<LastName>" + getLastName() + "</LastName>"
                + "<ID>" + getIDNum() + "</ID>"
                + "<YOB>" + getYOB() + "</YOB>"
                + "<HourlyPay>" + this.hourlyPay + "</HourlyPay>"
                + "<Salary>" + this.salary + "</Salary>"
                + "</Person>";
    }

    public String toJSONRecord() {
        return "{"
                + "\"firstName\": \"" + getFirstName() + "\", "
                + "\"lastName\": \"" + getLastName() + "\", "
                + "\"ID\": \"" + getIDNum() + "\", "
                + "\"title\": \"" + getTitle() + "\", "
                + "\"YOB\": " + getYOB() + ", "
                + "\"hourlyPay\": " + this.hourlyPay
                + "\"salary: " + this.salary
                + "}";
    }

}


