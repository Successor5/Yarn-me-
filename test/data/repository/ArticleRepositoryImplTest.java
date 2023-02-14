package data.repository;

import data.Models.Article;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class ArticleRepositoryImplTest {
        private Article article;
        private  ArticleRepository articleRepository;

        @BeforeEach
        public void DoThis() {
            articleRepository = new ArticleRepositoryImpl();
        }

        @Test
        public  void saveArticle(){
            Article article =new Article();
            articleRepository.saveArticle(article);
            assertEquals(1,articleRepository.countArticle());
        }
        @Test
        public void  findArticle(){
            articleRepository.findById(1);
            assertEquals(0,articleRepository.findById(1));
        }
        @Test
        public void deleteArticle(){
            Article article =new Article();
            articleRepository.saveArticle(article);
            assertEquals(1,articleRepository.countArticle());
            articleRepository.deleteArticle(article);
            assertEquals(0,articleRepository.countArticle());

        }
    }

