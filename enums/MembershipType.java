package enums;

public enum MembershipType {
    REGULAR(3, 14),      // 3 books, 14 days
    PREMIUM(5, 30),      // 5 books, 30 days
    STUDENT(4, 21);      // 4 books, 21 days

    private final int maxBooks;
    private final int borrowingDays;

    MembershipType(int maxBooks, int borrowingDays) {
        this.maxBooks = maxBooks;
        this.borrowingDays = borrowingDays;
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    public int getBorrowingDays() {
        return borrowingDays;
    }
}