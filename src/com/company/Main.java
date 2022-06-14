package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = scanner.nextInt();
        System.out.print("Enter b ");
        int b = scanner.nextInt();
        Formula formula=Formula.getFormula();
        formula.setFormula(a,b);
        formula.displayFormula();
        Formula formula1=Formula.getFormula();
        if (formula.hashCode()==formula1.hashCode()){
            System.out.println("OK");
        }
        else {
            System.out.println("ERROR");
        }
    }
}


class Formula{
    private static Formula form = new Formula();
    private static Formula Form;
    private int a;
    private int b;
    private Formula(){

    }
    public static Formula getFormula(){
        return form;
    }
    public void setFormula(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }
    public static Formula getInstance(){
        return Form;
    }
    public void displayFormula() {
        double vector = 2 * a + 3 / b;
        System.out.println(vector);

    }
}
