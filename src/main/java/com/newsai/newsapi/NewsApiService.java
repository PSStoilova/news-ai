package com.newsai.newsapi;

import com.newsai.newsapi.dto.NewsApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class NewsApiService {
    private static final String SORT_BY = "relevancy";
    private static final int TOP_N = 1;
    @Value("${NEWS_API_KEY}")
    private String newsApiKey;
    private final NewsApiClient newsApiClient;

    NewsApiService(NewsApiClient newsApiClient) {
        this.newsApiClient = newsApiClient;
    }

    public NewsApiResponse getNews() {
        return newsApiClient.retrieveNews("ai", LocalDate.parse("2025-08-15"), SORT_BY, newsApiKey, TOP_N);
    }
}
