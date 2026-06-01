class Demo {

    private String name;
    

    private int age;

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Constructorr {

    public static void main(String[] args) {

        Demo obj1 = new Demo("hello", 43);

        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}