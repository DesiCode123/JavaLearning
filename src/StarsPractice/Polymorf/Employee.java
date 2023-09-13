package StarsPractice.Polymorf;

public class Employee {

    /*compliletime polymorfisem
     * Constructor chaining: The parent constructor will be called first, before the
     * child constructor when creating the object of the child class.
     * If the parent class has multiple constructors and you want to direct to a
     * particular constructor, use the super() method.
     * The super() method should be the first line in your constructor.
     *
     * super(), super, this(), this:
     * - super() calls the superclass constructor.
     * - super refers to the superclasses instance variables.
     * - this() calls the current class constructor.
     * - this refers to the current class's instance variables.
     *
     * In every default constructor of a child class, by default, the super() method will be called,
     * pointing to the default constructor of the parent class
     *
     * Every default ore parameterize constructor of child class by default, the super() method will be called,
     * pointing to the default constructor of the parent clas
     *
     * Using constructor chaining that is buy using super method i can pas the values of instance variables from child clas to parents clas.
     */


    String name = "Emplyee";
    public void creditSalery(){
        System.out.println(name +" hello");
    }
    public Employee(){
        System.out.println("nothing");
    }
    public Employee(String name){
        System.out.println("name from paremetaise constructur");
    }

}
