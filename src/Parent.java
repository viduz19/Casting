class Parent {
    void printData(){
        System.out.println("Method of Parent Class");
    }
}
class Child extends Parent{
    void printData(){
        System.out.println("Method of Child Class");
    }
}
class Test{
    public static void main(String[] args) {
        Parent p = new Child(); //Upcasting
        p.printData();
    }
}


