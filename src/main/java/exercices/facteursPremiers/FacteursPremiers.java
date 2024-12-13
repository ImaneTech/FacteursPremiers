package exercices.facteursPremiers;
import java.util.List;
import java.util.ArrayList;


public class FacteursPremiers {

    public static List<Integer> generate(int nbr) {
        List<Integer> facteurs = new ArrayList<Integer>();
        int candidat=2;
        while(nbr > 1) {

            while (nbr % candidat == 0) {
                facteurs.add(candidat);
                nbr = nbr / candidat;
            }
            candidat++;
        }
            if (nbr > 1) {
                facteurs.add(nbr);
            }
        return facteurs;
    }
}
