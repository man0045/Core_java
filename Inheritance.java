class A{
    public  void show(){
        System.out.println("The class has Fteched Perfectly");
    }
}
class B extends A{
    public void show(){
        System.out.println("The class Has fetched its data very well");
    }
}

class Inheritance {
    public static void main(String str[]){
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        
    }
}
