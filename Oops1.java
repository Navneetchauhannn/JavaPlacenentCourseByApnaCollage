class student {
    String name;
    int age;

    //polymorfism(complie time)
    public  void PrintInfo(String name) {
        System.out.println(this.name);
    }
    public  void PrintInfo(int age) {
        System.out.println(this.age);
    }
    public  void PrintInfo(String name, int age) {
        System.out.println(this.name + " " + this.age);
    } 
} 
public class Oops1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "nav";
        s1.age = 18;
        //System.out.println(s1.name + " " +s1.age);
        s1.PrintInfo(s1.name, s1.age);
    }
}
