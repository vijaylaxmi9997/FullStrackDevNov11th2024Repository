package com.gentech.DefaultConstuctor;
class Article{
    int ArticleID;
    String  Title;
    String Content;
    String Author;
    String PublicationDate;
}

class Comments{
  String  CommenterName;
  String CommentContent;
  String CommentDate;
}
public class ArticlesDemo {
    public static void main(String[] args) {
        Article a1=new Article();
        a1.ArticleID=22;
        a1.Author="John Doe";
        a1.Title="The Future of AI";
        a1.PublicationDate="2024-12-01";
        a1.Content="Artificial Intelligence is advancing rapidly...";
        System.out.println("ArticleID:"+a1.ArticleID);
        System.out.println("AuthorName:"+a1.Author);
        System.out.println(" Title:"+ a1.Title);
        System.out.println("PublicationDate:"+a1.PublicationDate);
        System.out.println("Content:"+a1.Content);
        Article a2 =new Article();
        a2.ArticleID=42;
        a2.Author="Jane Smith";
        a2.Title="Climate Change and Our Impact";
        a2.PublicationDate="2024/07/01";
        a2.Content="The Earth is experiencing significant changes...";
        System.out.println("ArticleID:"+ a2.ArticleID);
        System.out.println("AuthorName:"+ a2.Author);
        System.out.println(" Title:"+ a2.Title);
        System.out.println("PublicationDate:"+ a2.PublicationDate);
        System.out.println("Content:"+ a2.Content);
        Article a3 =new Article();
        a3.ArticleID=44;
        a3.Author="Alice Johnson";
        a3.Title="Space Exploration: A New Era";
        a3.PublicationDate="2004/07/01";
        a3.Content="The exploration of Mars and beyond is gaining momentum...";
        System.out.println("ArticleID:"+ a3.ArticleID);
        System.out.println("AuthorName:"+ a3.Author);
        System.out.println(" Title:"+ a3.Title);
        System.out.println("PublicationDate:"+ a3.PublicationDate);
        System.out.println("Content:"+ a3.Content);
        Article a4 =new Article();
        a4.ArticleID=34;
        a4.Author="Mark Brown";
        a4.Title="The Importance of Mental Health";
        a4.PublicationDate="2022/07/21";
        a4.Content="Mental health is just as important as physical health...";
        System.out.println("ArticleID:"+ a4.ArticleID);
        System.out.println("AuthorName:"+ a4.Author);
        System.out.println(" Title:"+ a4.Title);
        System.out.println("PublicationDate:"+ a4.PublicationDate);
        System.out.println("Content:"+ a4.Content);
        Article a5 =new Article();
        a5.ArticleID=34;
        a5.Author="Emily Davis";
        a5.Title="Tech Innovations in 2024";
        a5.PublicationDate="2017/09/11";
        a5.Content="2024 has seen a rise in groundbreaking technological innovations...";
        System.out.println("ArticleID:"+ a5.ArticleID);
        System.out.println("AuthorName:"+ a5.Author);
        System.out.println(" Title:"+ a5.Title);
        System.out.println("PublicationDate:"+ a5.PublicationDate);
        System.out.println("Content:"+ a5.Content);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Comments c1=new Comments();
        c1.CommentContent="I look forward to seeing how AI evolves in the next few years";
        c1.CommenterName="Sarah Lee";
        c1.CommentDate="12/3/2003";
        System.out.println("CommentContent:"+c1.CommentContent);
        System.out.println("CommenterName:"+c1.CommenterName);
        System.out.println("CommentDate:"+c1.CommentDate);
        Comments c2 =new Comments();
        c2.CommentContent="limate change is an urgent issue that requires immediate attention from governments";
        c2.CommenterName="James Wilson";
        c2.CommentDate="12/9/2003";
        System.out.println("CommentContent:"+ c2.CommentContent);
        System.out.println("CommenterName:"+ c2.CommenterName);
        System.out.println("CommentDate:"+ c2.CommentDate);
        Comments c3 =new Comments();
        c3.CommentContent="AI will certainly play a huge role in the future.";
        c3.CommenterName="Robert Clark";
        c3.CommentDate="12/9/2013";
        System.out.println("CommentContent:"+ c3.CommentContent);
        System.out.println("CommenterName:"+ c3.CommenterName);
        System.out.println("CommentDate:"+ c3.CommentDate);
        Comments c4 =new Comments();
        c4.CommentContent="AI will certainly play a huge role in the future.";
        c4.CommenterName="David White";
        c4.CommentDate="12/9/2013";
        System.out.println("CommentContent:"+ c4.CommentContent);
        System.out.println("CommenterName:"+ c4.CommenterName);
        System.out.println("CommentDate:"+ c4.CommentDate);
        Comments c5 =new Comments();
        c5.CommentContent="I can’t wait to see humans land on Mars in my lifetime";
        c5.CommenterName="Robert Clark";
        c5.CommentDate="25/9/2013";
        System.out.println("CommentContent:"+ c5.CommentContent);
        System.out.println("CommenterName:"+ c5.CommenterName);
        System.out.println("CommentDate:"+ c5.CommentDate);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}





