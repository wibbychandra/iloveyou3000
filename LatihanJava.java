/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.java;
import java.util.Scanner;

/**
 *
 * @author Wibby Chandra
 */
public class LatihanJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Masukan nama anda : ");
        Scanner name = new Scanner (System.in);
        String input = name.nextLine();
        System.out.println("Nama anda adalah : " + input );
        

        System.out.println("WELKAM TO KALKULATOR WB");
        System.out.println("Masukan 1 lalu enter jika penjumlahan");
        System.out.println("Masukan 2 lalu enter jika pengurangan");
        System.out.println("Masukan 3 lalu enter jika perkalian");
        System.out.println("Masukan 4 lalu enter jika pembagian");
        System.out.println(" ");
        System.out.print("Masukan pilihan anda : ");
        Scanner number = new Scanner (System.in);
        String pilihan = number.nextLine();
        switch (pilihan){
                case "1":
                    System.out.println("Operasi Penjumlahan");
                    System.out.print("Masukan angka pertama : ");
                    Scanner a = new Scanner (System.in);
                    String input1 = a.nextLine();
                    double a1 = Double.parseDouble(input1);
                    
                    System.out.print("Masukan angka pertama : ");
                    Scanner b = new Scanner (System.in);
                    String input2 = b.nextLine();
                    double a2 = Double.parseDouble(input2);
                    double hasil = a1+a2;
                    
                    System.out.print("Hasil penjumlahan anda : "+hasil);
                    break;
                    
                case "2":
                    System.out.println("Operasi Pengurangan");
                    System.out.print("Masukan angka pertama : ");
                    Scanner c = new Scanner (System.in);
                    String input3 = c.nextLine();
                    double b1 = Double.parseDouble(input3);
                    
                    System.out.print("Masukan angka pertama : ");
                    Scanner d = new Scanner (System.in);
                    String input4 = d.nextLine();
                    double b2 = Double.parseDouble(input4);
                    double hasil2 = b1-b2;
                    
                    System.out.println("Hasil pengurangan anda : "+hasil2);
                    break;
                
                case "3":
                    System.out.println("Operasi Perkalian");
                    System.out.print("Masukan angka pertama : ");
                    Scanner e = new Scanner (System.in);
                    String input5 = e.nextLine();
                    double c1 = Double.parseDouble(input5);
                    
                    System.out.print("Masukan angka pertama : ");
                    Scanner f = new Scanner (System.in);
                    String input6 = f.nextLine();
                    double c2 = Double.parseDouble(input6);
                    double hasil3 = c1*c2;
                    
                    System.out.println("Hasil perkalian anda : "+hasil3);
                    break;
                    
                case "4":
                    System.out.println("Operasi Pembagian");
                    System.out.print("Masukan angka pertama : ");
                    Scanner g = new Scanner (System.in);
                    String input7 = g.nextLine();
                    double d1 = Double.parseDouble(input7);
                    
                    System.out.print("Masukan angka pertama : ");
                    Scanner h = new Scanner (System.in);
                    String input8 = h.nextLine();
                    double d2 = Double.parseDouble(input8);
                    double hasil4 = d1/d2;
                    
                    System.out.println("Hasil pembagian anda : "+hasil4);
                    break;
                    
                default:
                    System.out.println("Pilihan anda salah");
       }

        //If Else Condition
        int number = 8;
        if (number > 10){
        System.out.println("I Love You");
        }
        else if (number < 10){
            System.out.println("I Hate You I Love You");
        }
        else {
            System.out.println("I Hate You");
            }

        //Kondisi 1 garis
        int number = 90;
        String hello = (number < 10) ? "I Love You" : "I Hate You";
        System.out.println(hello);
     


        //Switch Case
        System.out.println("Masukan angka : ");
        Scanner input = new Scanner(System.in);
        String pilihan = input.nextLine();
        
        switch (pilihan){
            case "1":
                System.out.println("I Love You");
                break;
            case "2":
                System.out.println("I Hate You");
                break;
            case "3":
                System.out.println("I Hate You I Love You");
                break;
        }
        
        
        
        //If Else Condition
        System.out.println("Masukan angka : ");
        Scanner input = new Scanner(System.in);
        String pilihan = input.nextLine();
        
        if (pilihan.equals("1")){
                System.out.println("I Love You");
        }
        else if (pilihan.equals("2")){
                System.out.println("I Hate You");
        }
        else {
                System.out.println("I Hate You I Love You");
        }



        //Symply Task
        System.out.println("Masukan angka : ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        
        if (pilihan < 10){
                System.out.println("Under 10!");
        }
        else if (pilihan <= 31)){
                System.out.println("Above 10 under 30!");
        }
        else{
                System.out.println("Above 31");
        }


        
        //For
        int max = 1000000;
        for (int i = 0;i < max; i++){
            System.out.println(i);
        }



        //Foreach
        int arr[] = {3,2,1,5,4};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        String words[]={"Hello","World","Wibi","is","Fabolous"};
        
        for (String word : words){
            System.out.println(word);
        }
        
        
        
        //While Do
        int max = 10;
        int i = 0;
        while (i<max){
            System.out.println("I Love You");
            i++;
        }
        
        
        
        //Do While
        int max = 10;
        int x = 0;
        do{
            System.out.println("I Love You");
            x++;
        }while(x<max)

    }
}
        