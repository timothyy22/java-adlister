public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album("Biscuit", "gravy", 2023, 100.50, "delicous");

        Album emptyAlbum = new Album();

        Author author = new Author("donald", "twitty");
        Quote quote = new Quote("get in there", author);
        Quote quoteTwo = new Quote("ow-ah", author);
    }

}
