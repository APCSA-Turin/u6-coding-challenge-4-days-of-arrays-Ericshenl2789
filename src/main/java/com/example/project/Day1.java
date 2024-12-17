package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name.equals(null) || name.equals("")){
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else {
            int random = (int) (Math.random() * elf_names.length - 1) + 1;
            return elf_names[random] + " " + name;
        }
    }
}