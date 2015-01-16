/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esempiopersonapolimorfismo;

/**
 *
 * @author paolo
 */
class Persona {
    String name;
    int age;
    Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void descrivi(){
        System.out.print("Hi, my name is " + name);
        System.out.println(". I am " + age + " years old.");
    }
}

