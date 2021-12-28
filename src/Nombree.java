import java.text.DecimalFormat;
import java.util.Scanner;

public class Nombree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String StringValue = input.nextLine();
        String[] Values = StringValue.trim().split(",");
        String[] Vvalues;
        for(String Value : Values){
            Vvalues = Value.trim().split(" ");
            System.out.println(nbDecimal(Double.parseDouble(Vvalues[0]),Integer.parseInt(Vvalues[1])));
        }
    }
    public static double nbDecimal(Double d, int nbDecimal) {
        StringBuilder n = new StringBuilder("0.");
        n.append("0".repeat(Math.max(0, nbDecimal)));
        DecimalFormat df = new DecimalFormat(n.toString());

        return Double.parseDouble(df.format(d));
    }
}
