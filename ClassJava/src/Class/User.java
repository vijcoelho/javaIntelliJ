package Class;

public class User {

    private int age;
    private char sexo;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", sexo=" + sexo +
                ", name='" + name + '\'' +
                '}';
    }
}
