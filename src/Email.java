// Унаследуйте класс от базового класса, описывающего контакт Contact
public class Email extends Contact {
    private final String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    public Email(Email item) {
        super(item.getName());
        this.email = item.getEmail();
    }

    public Email(String name) {
        super(name);
        this.email = "";
    }

    public String getEmail() {
        return email;
    }

    // Метод sendMessage переопределяет метод базового класса
    @Override
    public void sendMessage() {
        System.out.println("Отправим новогоднюю картинку коллеге на электронную почту " + email);
    }

    @Override
    public void print() {
        System.out.println("Email: " + getEmail());
    }
}