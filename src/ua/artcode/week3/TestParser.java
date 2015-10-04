package ua.artcode.week3;

import ua.artcode.utils.JsonParser;

/**
 * Created by serhii on 10/4/15.
 */
public class TestParser {

    public static void main(String[] args) {
        String jsonText = "Group:{name:ACB10,hours:18,friendsCount:11,friends:[Nastia;Kolia;Vasia;Andrey]}";

        String res = JsonParser.parse(jsonText);

        System.out.println(res);


        /*String jsonText2 = "Group:{\n" +
                "    name:ACB10,\n" +
                "    hours:18,\n" +
                "    friendsCount:11,\n" +
                "    friends:[Nastia;Kolia;Vasia;Andrey]\n" +
                "}";
        System.out.println(JsonParser.parse(jsonText2));
*/
        // dosent work -> trim

        //"    Serhii    ".trim();
        // "Serhii"

    }
}
