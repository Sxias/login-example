package com.example.loginexample.board;

import lombok.Data;

public class BoardRequest {

    @Data
    public static class SaveDTO {
        private String title;
        private String content;
        private String author;
    }

    @Data
    public static class UpdateDTO {
        private String title;
        private String content;
        private String author;
    }

    @Data
    public static class DetailDTO {
        private String title;
        private String content;
        private String author;
    }
}
