package com.ignite.CBL.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

public class TopicContent {

    private String mainTitle;
    //key is language and value is language section
    private Map<String, LanguageSection> languageSections;
    private List<ComparisonSection> comparisonSections;

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public Map<String, LanguageSection> getLanguageSections() {
        return languageSections;
    }

    public void setLanguageSections(Map<String, LanguageSection> languageSections) {
        this.languageSections = languageSections;
    }

    public List<ComparisonSection> getComparisonSections() {
        return comparisonSections;
    }

    public void setComparisonSections(List<ComparisonSection> comparisonSections) {
        this.comparisonSections = comparisonSections;
    }

    public static class ComparisonSection{
        private String title;
        private List<ContentBlock> contentBlocks;

        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public List<ContentBlock> getContentBlocks() {
            return contentBlocks;
        }
        public void setContentBlocks(List<ContentBlock> contentBlocks) {
            this.contentBlocks = contentBlocks;
        }
    }





    public static class LanguageSection{
        private List<ContentBlock> contentBlocks;
        public List<ContentBlock> getContentBlocks() {
            return contentBlocks;
        }
        public void setContentBlocks(List<ContentBlock> contentBlocks) {
            this.contentBlocks = contentBlocks;
        }
    }
    public static class ContentBlock{
        private String type;
        private String content;
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }
    }

}
