public class Pet {
    
    private String name;
    private int age;
    private double weight;
    private String breed;
    private double price;

    public Pet(String name, int age, double weight, String breed, double price) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Pet\n{\n")
          .append("\tName = '").append(name).append('\'')
          .append("\n\tAge = '").append(age).append('\'')
          .append("\n\tWeight = '").append(weight).append('\'')
          .append("\n\tBreed = '").append(breed).append('\'')
          .append("\n\tPrice = ").append(price)
          .append("\n}");

        return sb.toString();
    }
}
