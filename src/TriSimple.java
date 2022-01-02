import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TriSimple {
    private final int[] tabInt;
    private int nb_elements_maxx;
    private int nb_elements = 0;

    public static void main(String[] args) {
    }
    public TriSimple(int nb_elements_max) {
        tabInt = new int[nb_elements_max];
        nb_elements_maxx = nb_elements_max;

    }
    public TriSimple(){
        tabInt = new int[20];
    }
    public  void insert(int value) {
        if(nb_elements == nb_elements_maxx){
            System.out.println("Desole le tableau est full");
            return;
        }
        tabInt[nb_elements]= value;
        nb_elements ++;
    }
    public void supprimer(int value) {
        for(int i=0;i<nb_elements;i++){
            if(tabInt[i]==value){
                for(int j=i+1;j<nb_elements_maxx;j++){
                    tabInt[j-1] = tabInt[j];
                    System.out.println("Le nombre:"+ value +" est bien suppimé");
                    return;
                }
            }
        }
        System.out.println("Le nombre que vous avez entree n'existe pas");
    }

    @Override
    public String toString() {
        return "TriSimple{" +
                "tabInt=" + Arrays.toString(tabInt) +
                ", nb_elements=" + nb_elements +
                '}';
    }
}
