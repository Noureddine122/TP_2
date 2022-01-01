import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Nombree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String StringValue = input.nextLine();
        String[] Values = StringValue.trim().split(",");
        for(String Value : Values){
            ParseNumbers number = new ParseNumbers();
            number.ParsingFromTab(Value);
            System.out.println(number.nbDecimal());
        }
    }
}
