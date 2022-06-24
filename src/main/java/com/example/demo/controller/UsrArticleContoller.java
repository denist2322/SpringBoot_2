package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vo.Article;

@Controller
public class UsrArticleContoller {
	private int articlesLastId;
	private List<Article> articles;
	
	public UsrArticleContoller() {
		articlesLastId = 0;
		articles = new ArrayList<>();
		
		makeTestData();
	}
	
	private void makeTestData() {
		for(int i = 1; i <= 10; i++) {
			String title = "제목 "+i;
			String body = "내용 "+i;			
			writeArticle(title, body);
		}
		
	}

	public Article writeArticle(String title, String body) {
		int id = articlesLastId + 1;
		Article article = new Article(id,title,body);
		
		
		articles.add(article);
		articlesLastId = id;
		
		return article;
	}
	
	@RequestMapping("/usr/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		Article article = writeArticle(title, body);
		
		return article;
	}
	
	@RequestMapping("/usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		
		return articles;
	}
	
//	@RequestMapping("/usr/article/doDelete")
//	@ResponseBody
//	public String doDelete(int id) {
//		
//		if(articles.get(id)==null) {
//			return this.id + "번글이 존재하지 않습니다."
//		}
//		else {
//			articles.remove(this.id);
//			return this.id + "번글이 삭제 되었습니다."
//		}
//	}

		
}

