/**
 * InternshipEmployee
 */
public class InternshipEmployee extends Employee{

    private int length;

    InternshipEmployee(String name, int length){
        this.name = name;
        this.length = length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as internship employee for "+length+" month/s\n";
        return info;
    }
}