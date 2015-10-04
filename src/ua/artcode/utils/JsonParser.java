package ua.artcode.utils;

/**
 * Created by serhii on 10/4/15.
 */
public class JsonParser {


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

    public static String parse(String json){
        String body = getBody(json, "{", "}");
        String[] rows = getParts(body, ",");


        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            String[] keyValue = getParts(row,":");

            String key = keyValue[0];
            String value = keyValue[1];

            if("name".equals(key)){

            } else if("hours".equals(key)){
                // strng to int
                int hours = Integer.parseInt(value);
                hours += 2;
                // int to string
                keyValue[1] = hours + "";
            } else if("friendsCount".equals(key)){
                int friendsCount = Integer.parseInt(value);
                friendsCount += 2;
                keyValue[1] = friendsCount + "";
            } else if("friends".equals(key)){
                String[] friendsName = getParts(getBody(value, "[", "]"), ";");
                for (int j = 0; j < friendsName.length; j++) {
                    friendsName[j] = friendsName[j] + "-" + j;
                }

                String res = composeParts(friendsName,";");
                String resWithBraces = addBraces(res,"[","]");
                keyValue[1] = resWithBraces;
            }

            rows[i] = composeParts(keyValue, ":");

        }


        String resWithBraces = addBraces(composeParts(rows,","),"{","}");

        return resWithBraces;

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
