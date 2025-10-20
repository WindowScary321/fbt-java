package onClass.lab3;

public class FullTimeEmployee implements Employee{
    private float basicSalary; // lương cơ bản
    private float bonus; // trợ cấp
    private String role;

    public FullTimeEmployee(){};
    public FullTimeEmployee(float basicSalary, float bonus, String role){
        this.basicSalary=basicSalary;
        this.bonus=bonus;
        this.role=role;
    }

    @Override
    public double getSalary() {
        return this.basicSalary;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public void display() {
        System.out.println("Chức danh: " + role);
        System.out.printf("Lương: %.2f\nđ.", basicSalary);
        System.out.println("Thưởng: "+ bonus + "đ.");
        System.out.println("Tổng: "+ ((float) basicSalary+bonus));

    }
}
