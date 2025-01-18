package com.gentech.parameterconstructor;
class Article {
    int ArticleID;
    String Title;
    String Content;
    String Author;
    String PublicationDate;

    Article(int ID, String title, String content,String author,String publicationDate) {
        ArticleID = ID;
        Author =author ;
        Title =title;
        PublicationDate = publicationDate;
        Content = content;
        System.out.println("ArticleID:" + ArticleID);
        System.out.println("AuthorName:" + Author);
        System.out.println(" Title:" + Title);
        System.out.println("PublicationDate:" + PublicationDate);
        System.out.println("Content:" + Content);
    }
}
class Comments {
    String CommenterName;
    String CommentContent;
    String CommentDate;

    Comments(String name,String content,String date)
    {
        CommentContent = content;
        CommenterName = name;
        CommentDate = date;
        System.out.println("CommentContent:" + CommentContent);
        System.out.println("CommenterName:" + CommenterName);
        System.out.println("CommentDate:" + CommentDate);
    }
}

public class ArticlesDemo3 {
    public static void main(String[] args) {
        Article a1 = new Article(22,"The Future of AI","Artificial Intelligence is advancing rapidly...","John Doe","12/09/2019");
        Article a2 = new Article(23,"life is beautifull","About life cycle","g.s shinde","20/6/1996");

        Comments c1=new  Comments("I look forward to seeing how AI evolves in the next few years","Sarah Lee","12/3/2003");
        Comments c2=new Comments("asha","good to read","23/2/2019");
    }
}

