package exercices.facteursPremiers;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FacteursPremiersTest {

        public List<Integer> actualFacteurs;
        public List<Integer> expectedFacteurs;


        private List<Integer> listeFab(int... composants){
            List<Integer> listeARetourner = new ArrayList<Integer>();
            for(int i : composants){
                listeARetourner.add(i);
            }
            return listeARetourner;
        }


        @BeforeEach
         void setUp() {
            actualFacteurs = new ArrayList<Integer>();
            expectedFacteurs = new ArrayList<Integer>();
        }
        @AfterEach
         void tearDown() {
            actualFacteurs = null;
            expectedFacteurs = null;
        }


    @Test
    void generate_1_devrait_retourner_liste_vide() {
            //GIVEN
        expectedFacteurs= listeFab();
        // WHEN
        actualFacteurs = FacteursPremiers.generate(1);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
    @Test
    void generate_2_devrait_retourner_liste_contenant_2() {
        // GIVEN
        expectedFacteurs=listeFab(2);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(2);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_3_devrait_retourner_liste_contenant_3() {
        // GIVEN
        expectedFacteurs = listeFab(3) ;

        // WHEN
        actualFacteurs = FacteursPremiers.generate(3);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_4_devrait_retourner_liste_contenant_2_2() {
        // GIVEN
        expectedFacteurs = listeFab(2,2);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(4);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_6_devrait_retourner_liste_contenant_2_3() {
        // GIVEN
        expectedFacteurs = listeFab(2,3);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(6);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }
    @Test
    void generate_8_devrait_retourner_liste_contenant_2_2_2() {
        // GIVEN
        expectedFacteurs = listeFab(2,2,2);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(8);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_9_devrait_retourner_liste_contenant_3_3() {
        // GIVEN
       expectedFacteurs = listeFab(3,3);
        //expectedFacteurs .add(3);
       // expectedFacteurs .add(3);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(9);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }


    @Test
    void generate_12_devrait_retourner_liste_contenant_2_2_3() {
        // GIVEN
        expectedFacteurs = listeFab(2,2,3);
        //expectedFacteurs .add(3);
        // expectedFacteurs .add(3);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(12);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_220_devrait_retourner_liste_contenant_2_2_5_11() {
        // GIVEN
        expectedFacteurs = listeFab(2,2,5,11);
        //expectedFacteurs .add(3);
        // expectedFacteurs .add(3);

        // WHEN
        actualFacteurs = FacteursPremiers.generate(220);

        // THEN
        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

}
