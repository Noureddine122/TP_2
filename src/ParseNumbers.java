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
    }
    public double nbDecimal() {
        DecimalFormat df = new DecimalFormat("0." + "0".repeat(Math.max(0, format)));
        return Double.parseDouble(df.format(number));
    }
}
