package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private String lastName;
    private String docNumber;
    private String gender;
    private String email;
    private double weight;
    private double height;
    private int id;
    private static int coutsId = 0;

    private List<BodyMassIndex> imcList;

    // Constructor sin parametros
    // Se llama al constructor sin parametros cuando se crea un objeto de la clase
    // Se coloca privado para que solo se pueda usar dentro de esta clase
    // Ejemplo de uso de private: constructor sin parametros
    private User(){
        this.id = ++User.coutsId;
    }

    public User(String name, String lastName, double weight, double height, String docNumber, String gender, String email) {
        // Llamamos al constructor sin parametros para inicializar el id
        this();
        this.name = name;
        this.lastName = lastName;
        this.docNumber = docNumber;
        this.gender = gender;
        this.email = email;
        this.weight = weight;
        this.height = height;
        this.imcList = new ArrayList<BodyMassIndex>();
    }


    // Ejemplo de uso de public: 
    // Metodos getter y setter publicos para acceder a los atributos  desde fuera de la clase

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BodyMassIndex> getImcList() {
        return imcList;
    }

    public void setImcList(List<BodyMassIndex> imcList) {
        this.imcList = imcList;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateBodyMassIndex(){
        BodyMassIndex imc = new BodyMassIndex(this.weight, this.height, this, new Date());
        this.imcList.add(imc);
    }

    public void listBodyMassIndex(){
        System.out.println("Lista de IMC para el usuario " + this.name + " " + this.lastName);
        for(BodyMassIndex imc : this.imcList){
            System.out.println("---------------------");
            System.out.println("Id: "+imc.getId());
            System.out.println("Imc: "+imc.getCalculation());
            System.out.println("Fecha: "+imc.getDate());
            System.out.println("Nombre: "+imc.getUser().getName());
            System.out.println("Apellido:"+imc.getUser().getLastName());
            System.out.println("Genero: "+imc.getUser().getGender());
            System.out.println("Diagnostico: El resultado de tu diagnostico es "+imc.getDiagnostic() );
            System.out.println("----------------------------");
        }
    }

    public void addBodyMassIndex(BodyMassIndex imc){
        this.imcList.add(imc);
    }
}
