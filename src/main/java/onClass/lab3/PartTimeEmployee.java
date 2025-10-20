package onClass.lab3;

public class PartTimeEmployee implements Employee{
    private int hourlyRate; // lương 1 giờ.
    private float hourlyWorked; // tổng tg đã làm việc.
    private String role;

    public PartTimeEmployee(){};
    public PartTimeEmployee(int hourlyRate, float hourlyWorked, String role){
        this.hourlyRate=hourlyRate;
        this.hourlyWorked=hourlyWorked;
        this.role=role;
    }
    @Override
    public double getSalary() {
        return (float) this.hourlyRate * this.hourlyWorked;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public void display() {
        System.out.println("Chức danh: "+ role);
        if (hourlyWorked < 1){
            System.out.println("Nhân viên làm quá ít, không thể tính lương");
        }else{
            System.out.println("Lương: " + getSalary()+ "đ.");
            System.out.println("Không có thưởng :(");
        }

    }
}
