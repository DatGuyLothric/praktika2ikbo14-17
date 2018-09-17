package com.lab_2;

public class TestAuthor {

    public static void main(String[] args) {
        Author author = new Author ("John Lennon", "jl@mail.com", 'M');
        System.out.println(author);
        author.setEmail("johnlennon@gmail.com");
        System.out.println(author);
    }
}

