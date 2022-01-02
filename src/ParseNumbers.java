import org.junit.Assert;

import java.text.DecimalFormat;
import java.util.Objects;

public class ParseNumbers {
    private static double number;
    private static int format;

    public ParseNumbers() {
        number = 0;
        format=0;
    }

    public void ParsingFromTab(String value) {
        try{

            String[] parts = value.trim().split(" ");
            number = Double.parseDouble(parts[0]);
            int i = 1;
            while (i < parts.length) {
                if(Objects.equals(parts[i], "")){
                    i++;
                }else{
                    format = Integer.parseInt(parts[i]);
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Error during parsing " +e.getMessage());
            Assert.fail("Respectez Syntaxe s'il vous plais");
        }
    }
    public double nbDecimal() {
        DecimalFormat df = new DecimalFormat("0." + "0".repeat(Math.max(0, format)));
        return Double.parseDouble(df.format(number));
    }

    @Override
    public String toString() {
        String result = "";
        result += "{"+number + "} avec format {"+ format +"} donne : "+ nbDecimal();
        return result;
    }
}
