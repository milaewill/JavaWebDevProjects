package org.launchcode;

public class HelloMethods {

    public static void main(String[] args) {
        //String message = Message.getMessage("it");
        //System.out.println(message);


        Mouse m = new Mouse();
        System.out.println(m.weight);
        m.weight = 55;
        System.out.println(m.weight);

        m.squeak();


    }

}