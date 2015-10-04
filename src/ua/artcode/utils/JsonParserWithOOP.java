package ua.artcode.utils;

import ua.artcode.week3.oop.Friend;
import ua.artcode.week3.oop.Group;

/**
 * Created by serhii on 10/4/15.
 */
public class JsonParserWithOOP {


    public static String getBody(String json, String startStr, String endStr){
        int start = json.indexOf(startStr);
        int end = json.lastIndexOf(endStr);

        if(start == -1 || end == -1){
            System.err.println("Wrong target symbols");
            return json;
        }

        return json.substring(start + 1, end);
    }

    public static String[] getParts(String text, String separator){
        return text.split(separator);
    }

    public static Group parse(String json){
        String body = getBody(json, "{", "}");
        String[] rows = getParts(body, ",");


        Group group = new Group();

        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            String[] keyValue = getParts(row,":");

            String key = keyValue[0];
            String value = keyValue[1];

            if("name".equals(key)){
                group.name = value;
            } else if("hours".equals(key)){
                // strng to int
                group.hours = Integer.parseInt(value);
            } else if("friendsCount".equals(key)){
                group.friendsCount = Integer.parseInt(value);
            } else if("friends".equals(key)){
                String[] friendsName = getParts(getBody(value, "[", "]"), ";");
                Friend[] friends = new Friend[friendsName.length];

                for (int j = 0; j < friendsName.length; j++) {
                    Friend friend = new Friend();
                    friend.name = friendsName[j];
                    friends[j] = friend;
                }

                group.friends = friends;
            }


        }

        return group;

    }

    public static String composeParts(String[] parts, String separator){
        String body = "";
        for (int i = 0; i < parts.length - 1; i++) {
            body += parts[i] + separator;
        }
        body += parts[parts.length - 1];

        return body;

    }

    public static String addBraces(String body, String startBrace, String endBrace){
        return startBrace + body + endBrace;
    }

}
