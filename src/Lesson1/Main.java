package Lesson1;

    public class Main {
        public static void main(String[] args) {
//            Cat cat1 = new Cat("Барсик", "белый", 1);
//
//            System.out.println(cat1);
//
//            Cat cat2 = new Cat("Морис", "black", 1);
//
//            Cat cat3 = new Cat("Морис", "black", 1);
//
//            System.out.println(cat2.equals(cat3));
//
//            Wolf wolf = new Wolf("Тревор", "Серый", 6);
//
//            Animal cat4 = new Cat("Морис", "red", 10);
//
//            if (cat4 instanceof Wolf) {
//                Wolf cat5 = (Wolf) cat4;
//            } else {
//                System.out.println("Не является волком!");
//            }
//
//            Animal cat6 = new Cat("Морис", "red", 10);
//            cat6.voice();
//
//            //Создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв
//
//            Cat catCompetitor1 = new Cat("Морис", "red", 10);
//            catCompetitor1.setSwimmingSpeed(10);
//            Wolf wolfCompetitor1 = new Wolf("Волк", "серый", 12);
//            wolfCompetitor1.setSwimmingSpeed(12);
//            Turtle turtleCompetitor = new Turtle("Черепаха", "зеленая", 100);
//            turtleCompetitor.setSwimmingSpeed(15);
//
//
//            Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};
//
//            for (Pool pool : pools) {
//                pool.getTimeToOvercomePool(catCompetitor1);
//                pool.getTimeToOvercomePool(wolfCompetitor1);
//                pool.getTimeToOvercomePool(turtleCompetitor);
//            }

            Competitors[] competitors = {new Cat("Felix"), new Wolf("Loki"), new Turtle("Martin")};
            Obstacle[] obstacles = {new Cross(500), new Wall(2), new Water(10)};
            Team team = new Team("Winners", competitors);

            System.out.println("===created new team===");
            System.out.println(team.getTeamName());

            System.out.println("===greeting team members===");
            team.showResults();

            Course course = new Course(obstacles);
            System.out.println("===team goes to course===");
            course.doIt(team);

            System.out.println("===show team Results===");
            team.showResults();

            System.out.println("===team members finished course===");
            team.showMembersFinishedCourse();
        }

    }

