// Унаследуйте класс от базового класса, описывающего контакт Contact
public class Phone extends Contact {
    private final String phoneNumber;

    public Phone(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public Phone(Phone item) {
        super(item.getName());
        this.phoneNumber = item.getPhoneNumber();
    }

    public Phone(String name) {
        super(name);
        this.phoneNumber = "";
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Метод sendMessage переопределяет метод базового класса
    @Override
    public void sendMessage() {
        System.out.println("Звоним другу по номеру " + phoneNumber + " и зовем на кофе.");
    }

    @Override
    public void print() {
        System.out.println("Номер телефона: " + getPhoneNumber());
    }
}