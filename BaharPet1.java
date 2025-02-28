package baharpet1;

/**
 *
 * @author baharozer
 */
public class BaharPet1 {

    private String name;
    private String type;
    private String color;
    private int age;
    private float weight;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        BaharPet1 myPet = new BaharPet1();
        myPet.setName("Fido");
        myPet.setType("Dog");
        myPet.setColor("Brown");
        myPet.setAge(3);
        myPet.setWeight(20.5f);

        System.out.println("My pet's name is " + myPet.getName());
        System.out.println("My pet is a " + myPet.getType());
        System.out.println("My pet's color is " + myPet.getColor());
        System.out.println("My pet is " + myPet.getAge() + " years old");
        System.out.println("My pet weighs " + myPet.getWeight() + " kg");
    }
}
