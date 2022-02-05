package persona;

public class Persona {
    private String name;
    private String surname;
    private int age;
    private char gender;
    private String nationality;
    private double weight;

    public Persona(String name, String surname, int age, char gender, String nationality, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        //Validamos la edad ingresada, en caso de ser incorrecta retornaremos cero
        if (age <= 0 ) {
            System.out.println("La edad ingresada es incorrecta");
            return 0;
        } else {
            return age;
        }   
    }

    public String getGender() {
        //Validamos que el género ingresado sea válido
        if (gender == 'm' || gender == 'M') {
            return "Masculino";
        }
        else if (gender == 'f' || gender == 'F') {
            return "Femenino";
        }
        else {
            return "Género inválido";
        }
    }

    public String getNationality() {
        return nationality;
    }

    public double getWeight() {
        return weight;
    }
    
    public String correr(){
        return "La persona está corriendo";
    }
    
    public String dormir(){
        return "La persona está durmiendo";
    }
    
    public String jugar(){
        return "La persona está jugando";
    }
    
    public String estudiar(){
        return "La persona está estudiando";
    }
    
    public String comer(){
        return "La persona está comiendo";
    }
    
}
