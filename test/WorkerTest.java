import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPayNoOT() {
        Worker worker = new Worker("Olivia","Scarlatella","000001","MS.",2008,13.5);
        double hoursWorked = 40;
        double pay = 40*13.5;
        assertEquals(pay,worker.calculateWeeklyPay(hoursWorked),0.01);
    }
    @Test
    public void testCalculateWeeklyPayOT() {
        Worker worker = new Worker("Olivia","Scarlatella","000001","MS.",2008,13.5);
        double hoursWorked = 45;
        double pay = (40*13.5) + (5*13.5*1.5);
        assertEquals(pay,worker.calculateWeeklyPay(hoursWorked),0.01);
    }


    @Test
    public void testToCSV() {
        Worker worker = new Worker("Olivia","Scarlatella","000001","MS.",2008,13.5);
        String CSV = "Olivia,Scarlatella,000001,MS.,2008,13.5";
        assertEquals(CSV,worker.toCSVRecord());
    }
    @Test
    public void testToXML() {
        Worker worker = new Worker("Olivia","Scarlatella","000001","MS.",2008,13.5);
        String XML = "<Person><FirstName>Olivia</FirstName><LastName>Scarlatella</LastName><ID>000001</ID><Title>MS.</Title><YOB>2008</YOB><HourlyPay>13.5</HourlyPay></Person>";
        assertEquals(XML,worker.toXMLRecord());
    }
    @Test
    public void testToJSON() {
        Worker worker = new Worker("Olivia", "Scarlatella", "000001", "MS.",2008,13.5);
        String expected = "{"
                + "\"firstName\": \"Olivia\", "
                + "\"lastName\": \"Scarlatella\", "
                + "\"ID\": \"000001\", "
                + "\"title\": \"MS.\", "
                + "\"YOB\": 2008, "
                + "\"hourlyPay\": 13.5"
                + "}";
        assertEquals(expected, worker.toJSONRecord());
    }
}
