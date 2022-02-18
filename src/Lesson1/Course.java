package Lesson1;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Competitors[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Competitors c: teamMembers){
                for (Obstacle o: obstacles){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
}
