import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {
    @Test
    public void testCalculateWeeklyPayNoOT() {
        SalaryWorker Salaryworker = new SalaryWorker("Olivia","Scarlatella","000001","MS.",2008,30.0,52000.0);
        double hoursWorked = 40;
        double pay = 40*13.5;
        assertEquals(pay,Salaryworker.calculateWeeklyPay(hoursWorked),0.01);
    }

    @Test
    public void testToCSV() {
        SalaryWorker Salaryworker = new SalaryWorker("Olivia","Scarlatella","000001","MS.",2008,13.5,52000.0);
        String CSV = "Olivia,Scarlatella,000001,MS.,2008,13.5,52000.0";
        assertEquals(CSV,Salaryworker.toCSVRecord());
    }
    @Test
    public void testToXML() {
        SalaryWorker Salaryworker = new SalaryWorker("Olivia","Scarlatella","000001","MS.",2008,13.5,52000.0);
        String XML = "<Person><FirstName>Olivia</FirstName><LastName>Scarlatella</LastName><ID>000001</ID><Title>MS.</Title><YOB>2008</YOB><HourlyPay>13.5</HourlyPay><Salary<52000.0</Salary></Person>";
        assertEquals(XML,Salaryworker.toXMLRecord());
    }
    @Test
    public void testToJSON() {
        SalaryWorker Salaryworker = new SalaryWorker("Olivia", "Scarlatella", "000001", "MS.",2008,13.5,52000.0);
        String expected = "{"
                + "\"firstName\": \"Olivia\", "
                + "\"lastName\": \"Scarlatella\", "
                + "\"ID\": \"000001\", "
                + "\"title\": \"MS.\", "
                + "\"YOB\": 2008, "
                + "\"hourlyPay\": 13.5"
                + "\"salary\": 52000.0"
                +
                "}";
        assertEquals(expected, Salaryworker.toJSONRecord());
    }
}
