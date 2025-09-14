public class Worker extends Person {
    protected double hourlyPay;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPay) {
        super(firstName,lastName,ID,title,YOB);
        this.hourlyPay = hourlyPay;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regHours = Math.min(hoursWorked, 40);
        double overTime = Math.max(0,hoursWorked-40);
        return (regHours * hourlyPay) + (overTime * hourlyPay * 1.5);
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regHours = Math.min(hoursWorked, 40);
        double overTime = Math.max(0,hoursWorked-40);
        double regPay = regHours * hourlyPay;
        double overPay = overTime * hourlyPay * 1.5;
        double totalPay = regPay + overPay;

        System.out.printf("Regular Hours: %.2f, Regular pay: $%.2f, Overtime Hours: %.2f, Overtime Pay: $%.2f, Total pay: $%.2f%n", regHours, regPay, overTime, overPay, totalPay);

    }
@Override
    public String toString() {
        return super.toString();
}

@Override
    public String toCSVRecord() {
        return super.toCSVRecord() + ", " + this.hourlyPay;
}

@Override
    public String toXMLRecord() {
        return "<Person>" + "<FirstName>" + getFirstName() + "</FirstName>" + "<LastName>" + getLastName() + "</LastName>" + "<ID>" + getIDNum() + "</ID>" + "<YOB>" + getYOB() + "</YOB>" + "<HourlyPay>" + this.hourlyPay + "</HourlyPay>" + "</Person>";
    }

    public String toJSONRecord() {
        return "{"
                + "\"firstName\": \"" + getFirstName() + "\", "
                + "\"lastName\": \"" + getLastName() + "\", "
                + "\"ID\": \"" + getIDNum() + "\", "
                + "\"title\": \"" + getTitle() + "\", "
                + "\"YOB\": " + getYOB() + ", "
                + "\"hourlyPay\": " + this.hourlyPay
                + "}";
    }


}


