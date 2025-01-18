package com.gentech.noargsconstructor;
class Article {
    int ArticleID;
    String Title;
    String Content;
    String Author;
    String PublicationDate;

    Article() {
        ArticleID = 22;
        Author = "John Doe";
        Title = "The Future of AI";
        PublicationDate = "2024-12-01";
        Content = "Artificial Intelligence is advancing rapidly...";
        System.out.println("ArticleID:" + ArticleID);
        System.out.println("AuthorName:" + Author);
        System.out.println(" Title:" + Title);
        System.out.println("PublicationDate:" + PublicationDate);
        System.out.println("Content:" + Content);
        ArticleID = 42;
        Author = "Jane Smith";
        Title = "Climate Change and Our Impact";
        PublicationDate = "2024/07/01";
        Content = "The Earth is experiencing significant changes...";
        System.out.println("ArticleID:" + ArticleID);
        System.out.println("AuthorName:" + Author);
        System.out.println(" Title:" + Title);
        System.out.println("PublicationDate:" + PublicationDate);
        System.out.println("Content:" + Content);
        ArticleID = 44;
        Author = "Alice Johnson";
        Title = "Space Exploration: A New Era";
        PublicationDate = "2004/07/01";
        Content = "The exploration of Mars and beyond is gaining momentum...";
        System.out.println("ArticleID:" + ArticleID);
        System.out.println("AuthorName:" + Author);
        System.out.println(" Title:" + Title);
        System.out.println("PublicationDate:" + PublicationDate);
        System.out.println("Content:" + Content);
        ArticleID = 34;
        Author = "Mark Brown";
        Title = "The Importance of Mental Health";
        PublicationDate = "2022/07/21";
        Content = "Mental health is just as important as physical health...";
        System.out.println("ArticleID:" + ArticleID);
        System.out.println("AuthorName:" + Author);
        System.out.println(" Title:" + Title);
        System.out.println("PublicationDate:" + PublicationDate);
        System.out.println("Content:" + Content);
        ArticleID = 34;
        Author = "Emily Davis";
        Title = "Tech Innovations in 2024";
        PublicationDate = "2017/09/11";
        Content = "2024 has seen a rise in groundbreaking technological innovations...";
        System.out.println("ArticleID:" + ArticleID);
        System.out.println("AuthorName:" + Author);
        System.out.println(" Title:" + Title);
        System.out.println("PublicationDate:" + PublicationDate);
        System.out.println("Content:" + Content);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
    class Comments {
        String CommenterName;
        String CommentContent;
        String CommentDate;

        Comments() {
            CommentContent = "I look forward to seeing how AI evolves in the next few years";
            CommenterName = "Sarah Lee";
            CommentDate = "12/3/2003";
            System.out.println("CommentContent:" + CommentContent);
            System.out.println("CommenterName:" + CommenterName);
            System.out.println("CommentDate:" + CommentDate);

            CommentContent = "limate change is an urgent issue that requires immediate attention from governments";
            CommenterName = "James Wilson";
            CommentDate = "12/9/2003";
            System.out.println("CommentContent:" + CommentContent);
            System.out.println("CommenterName:" + CommenterName);
            System.out.println("CommentDate:" + CommentDate);

            CommentContent = "AI will certainly play a huge role in the future.";
            CommenterName = "Robert Clark";
            CommentDate = "12/9/2013";
            System.out.println("CommentContent:" + CommentContent);
            System.out.println("CommenterName:" + CommenterName);
            System.out.println("CommentDate:" + CommentDate);
            CommentContent = "AI will certainly play a huge role in the future.";
            CommenterName = "David White";
            CommentDate = "12/9/2013";
            System.out.println("CommentContent:" + CommentContent);
            System.out.println("CommenterName:" + CommenterName);
            System.out.println("CommentDate:" + CommentDate);

            CommentContent = "I can’t wait to see humans land on Mars in my lifetime";
            CommenterName = "Robert Clark";
            CommentDate = "25/9/2013";
            System.out.println("CommentContent:" + CommentContent);
            System.out.println("CommenterName:" + CommenterName);
            System.out.println("CommentDate:" + CommentDate);
            System.out.println("++++++++++++++++++++++++++++++++++++++");
        }
    }
    public class ArticlesDemo1 {
        public static void main(String[] args) {
            Article a1 = new Article();

            Comments c1 = new Comments();

        }

    }




