package test;
//import java.util.Date;
import java.util.GregorianCalendar;

import classes.BodyMassIndex;
import classes.User;

/**
 * 
        Ejemplos de uso de la palabra public, private, protected, en un programa para calcular el índice de masa corporal el cual debe tener una clase usuario con nombre, apellido, cedula, email, y genero. Una clase llamada IMC, imc va a tener el peso de la persona, la altura de la persona, y el usuario, fecha, El usuario debe tener una lista de IMC 
 */


public class Main {
    public static void main(String[]args){

        User user = new User("Juan", "Perez", 50, 1.75, "123456789", "Masculino", "juanperez@gmail.com");
        user.calculateBodyMassIndex();

        user.addBodyMassIndex(new BodyMassIndex(80, 1.76, user, new GregorianCalendar(2024, 1, 1).getTime()));

        User user2 = new User("Marian", "Ramirez", 80, 1.75, "123456789", "Femenino", "marianramirez@gmail.com");

        user2.calculateBodyMassIndex();
        user2.setHeight(1.60);
        user2.setWeight(100);
        user2.calculateBodyMassIndex();
        user2.addBodyMassIndex(new BodyMassIndex(90, 1.73, user2, new GregorianCalendar(2024, 1, 1).getTime()));

        
        user.listBodyMassIndex();
        user2.listBodyMassIndex();
        System.out.println("---------------------");
    }
}