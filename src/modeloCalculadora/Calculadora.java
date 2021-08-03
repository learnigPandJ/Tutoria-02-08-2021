package modeloCalculadora;

import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
public class Calculadora {
    
    public int sumar(int num1,int num2){
        return num1+num2;
    }

    public int restar(int num1,int num2){
        return num1-num2;
    }

    public int multiplicar(int num1,int num2){
        return num1*num2;
    }

    public float dividir(int num1,int num2){
        DecimalFormatSymbols sep = new DecimalFormatSymbols();
        sep.setDecimalSeparator('.');

        DecimalFormat formato = new DecimalFormat("#.##",sep);
        return Float.parseFloat(formato.format((float)num1/(float)num2));
    }
}
