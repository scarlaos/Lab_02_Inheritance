public class Person {
    private String IDNum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;
    private static int IDSeed = 1;


    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNum = ID;
        this.title = title;
        this.YOB = YOB;
    }


    public Person(String IDNum, String firstName, String lastName, int YOB) {
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
    }


    public Person(String firstName, String lastName, int YOB) {
        this.IDNum = genIDNum();
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
    }


    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
    }

    public static int getIDSeed() {
        return IDSeed;
    }


    public String getIDNum() { return IDNum; }
    public void setIDNum(String IDNum) { this.IDNum = IDNum; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getYOB() { return YOB; }
    public void setYOB(int YOB) { this.YOB = YOB; }


    private String genIDNum() {
        String newID = String.valueOf(IDSeed);
        while (newID.length() < 8) {
            newID = "0" + newID;
        }
        IDSeed++;
        return newID;
    }


    public String toCSVRecord() {
        return IDNum + "," + firstName + "," + lastName + "," + YOB;
    }


    public String toXMLRecord() {
        String ret = "<Person>";
        ret += "<IDNum>" + IDNum + "</IDNum>";
        ret += "<FirstName>" + firstName + "</FirstName>";
        ret += "<LastName>" + lastName + "</LastName>";
        if (title != null) ret += "<Title>" + title + "</Title>";
        ret += "<YOB>" + YOB + "</YOB>";
        ret += "</Person>";
        return ret;
    }


    public String toJSONRecord() {
        String ret = "{";
        ret += "\"IDNum\": \"" + IDNum + "\", ";
        ret += "\"firstName\": \"" + firstName + "\", ";
        ret += "\"lastName\": \"" + lastName + "\", ";
        ret += "\"title\": \"" + (title != null ? title : "") + "\", ";
        ret += "\"YOB\": " + YOB;
        ret += "}";
        return ret;
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + IDNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return YOB == person.YOB &&
                IDNum.equals(person.IDNum) &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }
}
