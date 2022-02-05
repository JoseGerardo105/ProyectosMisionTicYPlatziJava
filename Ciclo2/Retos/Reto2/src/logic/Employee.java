package logic;

public class Employee extends Person{
    
     //Atributos propios de la clase empleado
     private double salary;
     private String typeEmployee;
     private String category;
     private Employee subordinates;
    
    public Employee(String name, String surnames, String identityDocument, String email, double salary, String typeEmployee, String category, Employee subordinates) {
        super(name, surnames, identityDocument, email);
        this.salary = salary;
        this.typeEmployee = typeEmployee;
        this.subordinates = subordinates;
    }
    
    private void characteristicsEmployee (){
        if (true) {
            
        }
    }
    
    public String informationEmployee(){
        return "Información del empleado";
    }
    
}
