package Main;

public class B {
    Integer id;
    String name;

    public B(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

