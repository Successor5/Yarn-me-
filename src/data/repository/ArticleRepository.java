package data.repository;

import data.Models.Article;
import data.Models.Comment;

public interface ArticleRepository {
    Article saveArticle(Article article);
    long countArticle();
    short findById(int id);
    void deleteArticle(Article article);
}
