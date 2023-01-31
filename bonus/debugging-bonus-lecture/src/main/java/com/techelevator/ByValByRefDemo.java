package com.techelevator;

public class ByValByRefDemo {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("***************************");
        System.out.println("****** Pass by value ******");
        System.out.println("***************************");
        System.out.println();

        int x=1;
        System.out.println("before method call x: " + x);
        passByValuePrimitive(x);
        System.out.println("after method call x: " + x);


        System.out.println();
        System.out.println("*******************************");
        System.out.println("****** Pass by reference ******");
        System.out.println("*******************************");
        System.out.println();

        int[] agentArr = {0, 0, 7};
        System.out.println("before the method call");
        for(int i=0; i<3; i++){
            System.out.println(agentArr[i]+ " ");
        }

        passByReferenceObject(agentArr);

        System.out.println("after the method call");
        for(int i=0; i<3; i++){
            System.out.println(agentArr[i]+ " ");
        }

    }

    public static void passByValuePrimitive(int x){
        System.out.println("Processing within primitive/pass by value");
        x=x+3;
        System.out.println("Value of x: " + x);
    }

    public static void  passByReferenceObject(int[] agentArr){
        System.out.println("Processing within method object/pass by reference");
        agentArr[0]=0;
        agentArr[1]=9;
        agentArr[2]=9;

        for(int i=0; i<3; i++){
            System.out.println(agentArr[i]+ " ");
        }
    }

}
