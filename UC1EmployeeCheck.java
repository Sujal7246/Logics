import java.util.Random;

 class Employee{
    int salperhour=20;
    int workhour=8;
    double salary;
    int parttimehour=4;
    int p;
    int working_days=20;
    double monthsalary;


public void calculatewage(){
    
    
    salary = salperhour * workhour;
    System.out.println(salary);
    
}
public void calculatewagepermmonth(){
    monthsalary=working_days*workhour*salperhour;
    System.out.println(monthsalary);
    
}
}

public class UC1EmployeeCheck {

    public static void main(String[] args) {
        
        Random r=new Random();
        int is_fulltime=1;
        int is_parttime=2;
        int i=r.nextInt(1000)%3;
        // if(i==is_fulltime){
        //     System.out.println("  full time employee is present");
        // }
        // else if(i==is_parttime){
        //     System.out.println(" parttime employee  is present");
        // }else{
        //     System.out.println("absent");
        // }
        switch(i){
            case 1:if(i==is_fulltime){
                System.out.println("full time employee is present");
                break;
            }
            case 2:if(i==is_parttime){
                System.out.println("part time employee is present");
                break;
            }
            default:{
                System.out.println("absent");
                break;
            }
        }
        
        Employee e=new Employee();
        e.calculatewage();
        e.calculatewagepermmonth();
        
    }
    


}
