package practiceproblem1;

public class commandLineArguments {
    public static void main(String[] args){
        System.out.println("Command Line Arguments are");
        for(String str: args){
            System.out.println(str);
        }
    }
}