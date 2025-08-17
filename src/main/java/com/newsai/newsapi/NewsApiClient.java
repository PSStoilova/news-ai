package com.newsai.newsapi;

import com.newsai.newsapi.dto.NewsApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient(name = "news-api-client", url = "https://newsapi.org")
interface NewsApiClient {

    @GetMapping("/v2/everything")
    NewsApiResponse retrieveNews(
            @RequestParam("q") String query,
            @RequestParam("from") LocalDate from,
            @RequestParam("sortBy") String sortBy,
            @RequestParam("apiKey") String apiKey,
            @RequestParam("pageSize") int pageSize
    );
}
