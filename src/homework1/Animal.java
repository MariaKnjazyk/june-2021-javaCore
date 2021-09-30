package homework1;

public class Animal {
    private String name;
    private int age;
    private String animalType;

    public Animal(){
    }

    public Animal(String name, int age, String animalType) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
