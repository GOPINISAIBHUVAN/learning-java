public class Strings {
    public static void main(String[] args) {
        // two types of string creation
        String name1 = new String("java_coder");
        // using a keyword new
        String name2 = "java_coder";
        // using a string literal
        System.out.println(name1);
        System.out.println(name2);
        // four types of printing statements
        int a = 19;
        float b =97.6f;
        char c = 'c';
        String f = "JAVA_coder";
        System.out.print("my name is:");
                // this print statement does not add new line after printing statement
                System.out.println("java_coder");
                // this print statement add new line after printing statement
                System.out.printf("My name is %s.My age is %d.I got %f percentage in 10th class.I got %c garde in java",f,a,b,c);
                System.out.format("My name is %s.My age is %d.I got %f percentage in 10th class.I got %c garde in java",f,a,b,c);
                // printf and format works same
    }
}




