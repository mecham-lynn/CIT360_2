public class Book {
   private int dewey;
   private String title;
   private String author; 
   private String genre;   
   private int cost;  

   public Book() {}
   public Book(String author, String bookGenre, String bookTitle,int cost) {
      this.author = auth;
      this.genre = bookGenre;
      this.cost = cost;
      this.title = bookTitle;
   }

   public String getTitle(){
       return title;
   }
   public String setTitle(int title){
       this.title = title;
   }
   public int getDewey() {
      return dewey;
   }
   public void setDewey( int dewey ) {
      this.dewey = dewey;
   }
   public String getAuthor() {
      return Author;
   }
   public void setAuthor( String author ) {
      this.author = author;
   }
   public String getGenre() {
      return genre;
   }
   public void setGenre( String bookGenre ) {
      this.bookGenre = bookGenre;
   }
   public int getCost() {
      return cost;
   }
   public void setCost( int cost ) {
      this.cost = cost;
   }
}