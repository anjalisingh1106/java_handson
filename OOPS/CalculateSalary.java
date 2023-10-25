package OOPS;

class Employee {
    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public double calculate(){
        return salary;
    }
}

class Manager extends Employee{
    private double incentive;
    
    public Manager(String name,double salary,double incentive){
        super(name,salary);
        this.incentive=incentive;
    }
    public double calculate(){
        return super.calculate()+incentive;
    }
}

class Labour extends Employee{
    private double overtime;
    
    public Labour(String name,double salary,double overtime){
        super(name,salary);
        this.overtime=overtime;
    }
    public double calculate(){
        return super.calculate()+overtime;
    }
}

public class CalculateSalary{
    public static void main(String[] args){
    Employee[] e = new Employee[3];
    e[0]=new Manager("M1",20000,10000);
    e[1]=new Labour("L1",40000,20000);
    e[2]=new Manager("M2",70000,30000);

    double total=0;
    for(Employee i:e){
        total+=i.calculate();
    }
    System.out.println(total);
}
}