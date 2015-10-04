package ua.artcode.week3.oop;

import ua.artcode.utils.JsonParser;
import ua.artcode.utils.JsonParserWithOOP;

/**
 * Created by serhii on 10/4/15.
 */
public class TestJsonParserWithOOP {

    public static void main(String[] args) {
        Group group = JsonParserWithOOP.parse(
                        "Group:{name:ACB10,hours:18,friendsCount:11,friends:[Nastia;Kolia;Vasia;Andrey]}");

        String name = group.name;
    }
}
