import java.util.Comparator;

public class Worker implements Comparable<Worker>{
    private String name;
    private int age;
    private String profession;

    public Worker(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "\nname       :" + name + '\'' +
                "\nage       :" + age +
                "\nprofession:'" + profession + '\'' +
                "\n-------------------------------";
    }

    @Override
    public int compareTo(Worker o) {
        return o.age-this.age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}
