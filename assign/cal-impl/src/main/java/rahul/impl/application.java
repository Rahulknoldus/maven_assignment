package rahul.impl;

public class application {
    //class declaration

    class Calculator {

        //this is a static method and cannot call an instance method without a object
        public static void main(String[] args) {

            //create instance of object
            Calculator thisObj = new Calculator();
            //call instance method using object
            thisObj.calculator();
        }

        //instance method
        public void calculator() {
            System.out.print("some message...");
        }


    }


}
