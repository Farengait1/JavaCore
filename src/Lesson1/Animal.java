package Lesson1;

public abstract class Animal implements Competitors{
//    String name;
//    String color;
//    protected int age;
//
//    public Animal(String name, String color, int age) {
//        this.name = name;
//        this.color = color;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public abstract void voice();
    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(type + " " + name + " " + " успешно справился с кросс");
        } else {
            System.out.println(type + " " + name + " " + " не смог преодолеть кросс");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(type + " " + name + " " + " успешно справился с препятствием");
        } else {
            System.out.println(type + " " + name + " " + " не смог преодолеть препятствие");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (distance <=maxSwimDistance){
            System.out.println(type + " " + name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(type + " " + name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(type + " " + name + ": " + onDistance);
    }

}
