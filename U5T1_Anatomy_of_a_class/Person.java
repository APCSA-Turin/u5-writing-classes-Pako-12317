public class Person {
    private String fName;
    private String lName;
    private int meetNum;

    public Person(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        meetNum = 0;
    }
    public int getMeetings() {
        return meetNum;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void addMeet(){
        meetNum++;
    }

    public void meet(Person person){
        System.out.println("Hello, my name is "+fName+".\nHi, my name is "+person.getfName()+".");
        meetNum++;
        person.addMeet();
    }
}
