package classes;
import java.util.Date;

public class BodyMassIndex {
    private double weight;
    private double height;
    private User user;
    private Date date;
    private double calculation;
    private static int coutsId = 0;
    private int id;
    private String diagnostic;

    public BodyMassIndex(double weight, double height, User user, Date date) {
        this.id = ++BodyMassIndex.coutsId;
        this.weight = weight;
        this.height = height;
        this.user = user;
        this.date = date;
        this.calculation = calculate();
        this.diagnostic = calcDiagnostic();
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double calculate(){
        calculation = this.weight / (Math.pow(this.height, 2)); 
        return calculation;
    }

    public double getCalculation() {
        return calculation;
    }

    public int getId() {
        return id;
    }

    public String getDiagnostic(){
        return this.diagnostic;
    }


    private String calcDiagnostic(){
        String diagnostic = "";
        if(this.calculation < 18.5){
            diagnostic = "Bajo peso";
        } else if(this.calculation >= 18.5 && this.calculation < 25){ 
            diagnostic = "Peso Normal";
        } else if(this.calculation >= 25 && this.calculation < 30){
            diagnostic = "Sobrepeso";
        } else if(this.calculation >= 30 && this.calculation < 35){
            diagnostic =  "Obesidad";
        } else if(this.calculation >= 35 && this.calculation < 40){
            diagnostic = "Obesidad Extrema";
        }

        return diagnostic;
    }

}
