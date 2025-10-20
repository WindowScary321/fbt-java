package onClass.lab3;

public class intern implements Employee{
    private float supportAllowance;
    private String role;

    public intern(){};
    public intern(float supportAllowance, String role){
        this.supportAllowance=supportAllowance;
        this.role=role;
    }

    @Override
    public double getSalary() {
        return this.supportAllowance;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public void display() {
        System.out.println("Chức danh: " + role);
        System.out.println("Lương: " + supportAllowance);
        System.out.println("Không có thưởng :(");
    }
}
