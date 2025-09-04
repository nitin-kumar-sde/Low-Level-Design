package practise.notify_me;

public class EmailObserver implements Observer{

    private final String email;

    public EmailObserver(String email) {
        this.email = email;
    }
    @Override
    public void notify(Product product) {
        System.out.println("Sending email to " + email
                + " about product: " + product.getName());
    }
}
