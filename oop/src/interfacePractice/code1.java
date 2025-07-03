package interfacePractice;

interface Animal {
    void play();

    void eat();

    void sleep();
}

interface Robot {
    void code();

    void workHour();
}

public class code1 {
    public static void main(String[] args) {
        System.out.println("Hello,World!");
        Human h = new Human();
        h.play();
        Calculator cal = new Calculator();
        System.out.println(cal.operate(2,2));
    }
}

class Human implements Animal, Robot {
    public void play() {
        System.out.println("Human like to play");
    }

    @Override
    public void eat() {
        System.out.println("Human like to eat");
    }

    @Override
    public void sleep() {
        System.out.println("Human like to sleep");
    }

    @Override
    public void code() {
        System.out.println("Human like to code");
    }

    @Override
    public void workHour() {
        System.out.println("Human like to work hour");
    }

}

//Functional Interface
interface Calculate{
    int  operate(int a, int b);

}
class Calculator implements Calculate{
    public int operate(int a, int b){
        return a+b;
    }
}


/*Why multiple is not allowed in classes but allowed in interface
* reason-->
* because when we call a method compiler get confused which one have to call first
* example-->
*
* class Cat{
* void eat();
* void walk();
* }
*
* class Dog{
* void play();
* }
* class Animal extends Cat,Dog{
* public void play(){
* sout("Animal is playing");
* }
* class Main{
* public static void main(String[] args){
* Animal a=new Animal();
* a.play();
* }
/
 */

