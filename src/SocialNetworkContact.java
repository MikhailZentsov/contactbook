// Унаследуйте класс от базового класса, описывающего контакт Contact
public class SocialNetworkContact extends Contact {
    private final String socialNetwork;
    private final String username;

    public SocialNetworkContact(String name, String socialNetwork, String username) {
        super(name);
        this.socialNetwork = socialNetwork;
        this.username = username;
    }

    public SocialNetworkContact(SocialNetworkContact item) {
        super(item.getName());
        this.socialNetwork = item.getSocialNetwork();
        this.username = item.getUsername();
    }

    public SocialNetworkContact(String name) {
        super(name);
        this.socialNetwork = "";
        this.username = "";
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public String getUsername() {
        return username;
    }

    // Метод sendMessage переопределяет метод базового класса
    @Override
    public void sendMessage() {
        System.out.println("Отправим забавный стикер одногруппнику в соцсети " + socialNetwork + ", имя пользователя " + username);
    }

    @Override
    public void print() {
        System.out.println("Социальная сеть: " + socialNetwork);
        System.out.println("Имя пользователя: " + username);
    }
}