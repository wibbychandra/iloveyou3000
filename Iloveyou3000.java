/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iloveyou3000;

/**
 *
 * @author Wibby Chandra
 */
public class Iloveyou3000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        //Inherith
//        Kiddy kiddy = new Kiddy();
//        System.out.println(kiddy.first_attribute);
//        System.out.println(kiddy.second_attribute);
//        System.out.println(kiddy.third_attribute);
//        kiddy.printHello();
//        kiddy.sendHello();
        
        
//        //PolyMorphism
//        Animal animal = new Animal();
//        animal.sound();
//        
//        Animal cat = new Cat();
//        cat.sound();
//        
//        Animal dog = new Dog();
//        dog.sound();

//        //Polymorphism
//        Operational op = new Operational();
//        op.operation("Hello Sayang");
//        op.operation(1);
//        op.operation(50, 10);
        
        
//        //Abstraction
//        Employee emp = new Employee();
//        emp.sendEmailToEmployee("Wb", "M");

        
        //Encapsulation
        Email email = new Email();
        email.setTitle("Tugas 2SC4 - Wb 1920010187");
        email.setSender("R Chandra R WIbisono");
        email.setRecepient("faculty.eng.ui.ac.id");
        email.setBody("Selamat pagi, berikut saya lampirkan tugas.");
        email.setAttachment("Tugas-2sc4.pdf");
        
        System.out.println("Sender : "+email.getSender());
        System.out.println("Recepient : "+email.getRecepient());
        System.out.println("Title : "+email.getTitle());
        System.out.println("Body : "+email.getBody());
        System.out.println("Attachment : "+email.getAttachment());
    }
    
}
