import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker sw = new SalaryWorker("Olivia","Scarlatella","000001","MS.",2008,30.0,52000.0);
        double expectedWeeklyPay = 52000.0 / 52;
        assertEquals(expectedWeeklyPay, sw.calculateWeeklyPay(40), 0.01);
        assertEquals(expectedWeeklyPay, sw.calculateWeeklyPay(50), 0.01);
    }

    @Test
    public void testToCSV() {
        SalaryWorker sw = new SalaryWorker("Olivia","Scarlatella","000001","MS.",2008,13.5,52000.0);
        String expectedCSV = "000001,Olivia,Scarlatella,2008,13.5,52000.0";
        assertEquals(expectedCSV, sw.toCSVRecord());
    }

    @Test
    public void testToXML() {
        SalaryWorker sw = new SalaryWorker("Olivia","Scarlatella","000001","MS.",2008,13.5,52000.0);
        String expectedXML = "<Person>"
                + "<FirstName>Olivia</FirstName>"
                + "<LastName>Scarlatella</LastName>"
                + "<ID>000001</ID>"
                + "<Title>MS.</Title>"
                + "<YOB>2008</YOB>"
                + "<HourlyPay>13.5</HourlyPay>"
                + "<Salary>52000.0</Salary>"
                + "</Person>";
        assertEquals(expectedXML, sw.toXMLRecord());
    }

    @Test
    public void testToJSON() {
        SalaryWorker sw = new SalaryWorker("Olivia", "Scarlatella", "000001", "MS.", 2008, 13.5, 52000.0);
        String expectedJSON = "{"
                + "\"firstName\": \"Olivia\", "
                + "\"lastName\": \"Scarlatella\", "
                + "\"ID\": \"000001\", "
                + "\"title\": \"MS.\", "
                + "\"YOB\": 2008, "
                + "\"hourlyPay\": 13.5, "
                + "\"salary\": 52000.0"
                + "}";
        assertEquals(expectedJSON, sw.toJSONRecord());
    }
}
