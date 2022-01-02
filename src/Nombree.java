import java.util.Objects;
import java.util.Scanner;

public class Nombree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String StringValue = input.nextLine();
        if(StringValue.isEmpty()){
            System.out.println("Vous devez ecrire une expression");
            return;
        }
        String[] Values = StringValue.trim().split(",");
        for(String Value : Values){
            if(Objects.equals(Value, " ")){
                System.out.println("Syntaxe error: No whitespace between {,}");
                return;
            }
            ParseNumbers number = new ParseNumbers();
            number.ParsingFromTab(Value);
            System.out.println(number);
        }
    }
}
