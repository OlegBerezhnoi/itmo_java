package itmo.java.basics.ex3;

public class Tree {
    private Integer age;
    private Boolean isLive;
    private String name;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean isLive, String name) {
        this.age = age;
        this.isLive = isLive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Имя : " + name + "; Живое : " + isLive + "; Возраст : " + age;
    }
}

