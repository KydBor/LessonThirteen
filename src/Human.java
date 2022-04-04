import java.util.Objects;

public class Human {
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(age, human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
