public class Person1 {
    public void speak() {
        System.out.println("I am efe");
    }
    public static void main(String[] args) {
        Person1 p1 = new Student();
        p1.speak();
    }
}
class Student extends Person1 {
    public void speak(){
        super.speak();
        System.out.println("I am a barbie girl");
    }
}
