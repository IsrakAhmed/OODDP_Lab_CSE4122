// Client
public class Main {
    public static void main(String[] args) {
        System.out.println("Basic Web Page:");
        WebPage basicPage = new BasicWebPage();
        basicPage.display();

        System.out.println("\nAuthorized Web Page:");
        WebPage authorizedPage = new AuthorizedWebPage(new BasicWebPage());
        authorizedPage.display();

        System.out.println("\nPaginated and Authorized Web Page:");
        WebPage fullFeaturePage = new PaginatedWebPage(new AuthorizedWebPage(new BasicWebPage()));
        fullFeaturePage.display();
    }
}