abstract class LibraryItem {
    protected int itemId;
    protected String title;
    protected boolean isIssued;

    public LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isIssued = false;
    }

    // operations to be implemented by subclasses
    public abstract void issueItem();
    public abstract void returnItem();

    public void showStatus() {
        System.out.println(itemId + " - " + title + " | Issued: " + isIssued);
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(int itemId, String title, String author) {
        super(itemId, title);
        this.author = author;
    }

    @Override
    public void issueItem() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued: " + title + " (Author: " + author + ")");
        } else {
            System.out.println("Book already issued: " + title);
        }
    }

    @Override
    public void returnItem() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued: " + title);
        }
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int itemId, String title, int issueNumber) {
        super(itemId, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public void issueItem() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Magazine issued: " + title + " (Issue No: " + issueNumber + ")");
        } else {
            System.out.println("Magazine already issued: " + title);
        }
    }

    @Override
    public void returnItem() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Magazine returned: " + title);
        } else {
            System.out.println("Magazine was not issued: " + title);
        }
    }
}

class Q3 {
    public static void main(String[] args) {
        LibraryItem b1 = new Book(101, "Java Programming", "Herbert Schildt");
        LibraryItem m1 = new Magazine(201, "Tech Today", 45);

        b1.showStatus();
        m1.showStatus();

        b1.issueItem();
        m1.issueItem();

        b1.issueItem();   // try issuing again

        b1.returnItem();
        m1.returnItem();

        m1.returnItem();  // try returning again

        b1.showStatus();
        m1.showStatus();
    }
}