package com.newsai.newsapi.dto;

import java.time.LocalDateTime;
import java.util.List;

public record NewsApiResponse(
        String status,
        Integer totalResults,
        List<Article> articles
) {
    public record Article(
            Source source,
            String author,
            String title,
            String description,
            String url,
            String urlToImage,
            LocalDateTime publishedAt,
            String content
    ) {
    }

    public record Source(
            String id,
            String name
    ) {
    }
}
