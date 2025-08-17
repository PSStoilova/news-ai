package com.newsai.controller;

import com.newsai.newsapi.NewsApiService;
import com.newsai.newsapi.dto.NewsApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NewsController {
    private final NewsApiService newsApiService;

    public NewsController(NewsApiService newsApiService){
        this.newsApiService = newsApiService;
    }

    @GetMapping("/news")
    public NewsApiResponse getNews(){
        return newsApiService.getNews();
    }
}
