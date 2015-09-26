package ua.artcode.week2;

/**
 * 1) Where is my location?
 * 2) What can i take?
 *
 *
 */
public class _04VariableScope {

    public static void main(String[] args) {
        int methodVar = 89;
        String ifVar = "if";
        while(true) {
            int whileVar = 88;

            methodVar++;

            if(true){
                ifVar = "hello";
            }

            if(true){
                int if2Var = 89;
            }

        }

        //whileVar++;


    }
}
