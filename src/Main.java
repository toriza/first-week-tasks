public class Main{
    public static void main(String[] args){
        String firstBookTitle = "Hobbit";
        String firstBookAuthor = "Tolkien";
        int firstBookPublicationYear = 1937;
        int firstBookNumberOfPages = 314;
        boolean firstBookRead = true;
        /// some space between the books
        String secondBookTitle = "Atomic Habits";
        String secondBookAuthor = "James Clear";
        int secondBookPublicationYear = 2019;
        int secondBookNumberOfPages = 300;
        boolean secondBookRead = false;
        /// some space between the books
        String thirdBookTitle = "How the World Thinks";
        String thirdBookAuthor = "Julian Baggini";
        int thirdBookPublicationYear = 2018;
        int thirdBookNumberOfPages = 390;
        boolean thirdBookRead = true;
        System.out.println("The book name is " + firstBookTitle + " by " + firstBookAuthor + " which was published in " +
                firstBookPublicationYear + " and has " + firstBookNumberOfPages + " pages.");
        if (firstBookRead){System.out.println("I read it.");
        };
    }
}
