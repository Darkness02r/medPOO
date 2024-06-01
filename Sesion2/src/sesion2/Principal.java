/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.ArrayList;

/**
 *
 * @author Lab-1 Pc-4
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //aqui creamos el primer objeto//
    Person sergio = new Person ("Sergio", "Rivas", 1.75f, 19); 
    Person Belen = new Person ("Aby", "Acuña", 1.63f, 20); 
    Person Don_Erick = new Person ("Don Erick", "Martinez", 1.63f, 39); 
    Person Justin = new Person ("Justin", "Sandigo", 1.80f, 19); 
    Person Tatiana = new Person ("Tatiana", "Caceres", 1.55f, 18); 
    
    
    System.out.println("Datos del Clan: ");
    System.out.println();
    
    ArrayList<Person> people = new ArrayList <>();
    people.add(Belen);
    people.add(sergio);
    people.add(Don_Erick);
    people.add(Justin);
    people.add(Tatiana);
    
    for (Person person : people){
    System.out.println(person);
}
    }
    
//fot (int i; i<5;i++)//
    
}
