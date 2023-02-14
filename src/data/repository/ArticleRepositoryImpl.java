package data.repository;

import data.Models.Article;
import java.util.ArrayList;
import java.util.List;

public  class ArticleRepositoryImpl implements ArticleRepository {

    private int count;

    private List<Article> articles=new ArrayList<>();

    @Override
    public Article saveArticle(Article article) {
        boolean articleHasNotBeenSaved=article.getId()==0;
        if (articleHasNotBeenSaved){article.setId(generateArticleId());
            article.setId(generateArticleId());
            articles.add(article);
            count++;}
        return article;
    }
    private int generateArticleId() {
        return count+1 ;
    }

    @Override
    public long countArticle() {
        return count;
    }

    @Override
    public short findById(int id) {
        return 0;
    }

    @Override
    public void deleteArticle(Article article) {
        for (Article article1: articles){
            if (article.equals(article1)) {
                articles.remove(article);
                count--;
                break;
            }}

    }
}