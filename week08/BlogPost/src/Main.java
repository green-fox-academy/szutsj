public class Main {

  public static void main(String[] args) {

    BlogPost blog1 = new BlogPost();
    BlogPost blog2 = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04.");
    BlogPost blog3= new BlogPost();

    blog1.authorName = "Tim Urban";
    blog1.title= "Wait but why";
    blog1.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    blog1.publicationDate = "2010.10.10";

    blog2.text = "Lorem ipsum dolor sit amet.";

    blog3.authorName = "William Turton";
    blog3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    blog3.publicationDate = "2017.03.28.";
    blog3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

    System.out.println(blog1.toString());
    System.out.println(blog2.toString());
    System.out.println(blog3.toString());
  }
}
