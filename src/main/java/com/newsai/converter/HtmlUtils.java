package com.newsai.converter;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

public final class HtmlUtils {

    public static String convertHtmlToMarkdown(String html) {
        return FlexmarkHtmlConverter.builder().build().convert(html);
    }
}
