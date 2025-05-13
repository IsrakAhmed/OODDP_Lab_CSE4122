
// Concrete Decorator 2 - Pagination
class PaginatedWebPage extends WebPageDecorator {
    public PaginatedWebPage(WebPage page) {
        super(page);
    }

    private void addPagination() {
        System.out.println("Adding pagination to the web page...");
    }

    @Override
    public void display() {
        super.display();
        addPagination();
    }
}