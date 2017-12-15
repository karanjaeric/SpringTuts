/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtuts;

/**
 *
 * @author ekaranja
 */
public class Test {
    private String name;
    private int age;
    private String emailAddress;

    public Test(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Test(){
    System.out.println("class Test initialized successfully");
    }
    
    public void test1(){
        System.out.println("welcome senior"+name);
    }
    
    
}
