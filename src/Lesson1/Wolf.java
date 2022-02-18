package Lesson1;

public class Wolf extends Animal {
//    private int swimmingSpeed;
//
//    public Wolf(String name, String color, int age) {
//        super(name, color, age);
//    }
//
//    public int getSwimmingSpeed() {
//        return swimmingSpeed;
//    }
//
//    public void setSwimmingSpeed(int swimmingSpeed) {
//        this.swimmingSpeed = swimmingSpeed;
//    }
//
//    @Override
//    public void voice() {
//        System.out.println("Волк воет!");
//    }
//
//    public double swim(Pool pool) {
//        System.out.println("Я волк, я плыву!");
//        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
//        return pool.getLength() / swimmingSpeed;
//    }
    public Wolf(String name){
        super("Волк", name, 800, 4,10);
    }
}