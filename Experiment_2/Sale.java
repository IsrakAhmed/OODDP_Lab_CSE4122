import java.time.LocalDate;

public class Sale {
    
    private Customer customer;
    private Pet pet;
    private double price;
    private LocalDate date;

    public Sale(Customer customer, Pet pet, double price) {
        this.customer = customer;
        this.pet = pet;
        this.price = pet.getPrice();
        this.date = LocalDate.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pet getPet() {
        return pet;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Sale\n{\n")
          .append("\tCustomer = ").append(customer).append('\n')
          .append("\tPet = ").append(pet).append('\n')
          .append("\tPrice = ").append(price).append('\n')
          .append("\tDate = ").append(date).append('\n')
          .append('}');

        return sb.toString();
    }
}
