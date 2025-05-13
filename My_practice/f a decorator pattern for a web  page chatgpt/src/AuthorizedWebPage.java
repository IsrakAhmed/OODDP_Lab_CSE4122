// Concrete Decorator 1 - Authorization
class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage page) {
        super(page);
    }

    private void authorizeUser() {
        System.out.println("Checking user authorization...");
    }

    @Override
    public void display() {
        authorizeUser();
        super.display();
    }
}