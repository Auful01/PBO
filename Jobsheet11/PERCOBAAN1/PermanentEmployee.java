/**
 * PermanentEmployee
 */
public class PermanentEmployee extends Employee implements IPayable{

    private int salary;

    PermanentEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05*salary);
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as Permanent Employee with salary " + salary;
        return info;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }
}