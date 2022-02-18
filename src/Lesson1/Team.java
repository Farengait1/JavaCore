package Lesson1;

public class Team {
    String teamName;
    Competitors[] teamMembers = new Competitors[4];


    public Team(String teamName, Competitors[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Team name: "+teamName;
    }

    public Competitors[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for(Competitors c: teamMembers){
            c.showResult();
        }
    }

    public void showMembersFinishedCourse(){
        for(Competitors c: teamMembers){
            if(c.isOnDistance())
                c.showResult();
        }
    }
}

