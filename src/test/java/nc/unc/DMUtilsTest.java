package nc.unc;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Test de la classe utilitaire de gestion des points
 */
public class DMUtilsTest {
    @Test
    public void getLeftPointTest (){
        List<Point> tableau = createTaleauDeTest(3);
        assertEquals(DMUtils.getPointOnLeft(tableau, new Point(1,1)), Optional.empty());
        assertEquals(DMUtils.getPointOnLeft(tableau, new Point(3,1)), Optional.of(new Point(2,1)));
    }

    @Test
    public void getRightPointTest (){
        List<Point> tableau = createTaleauDeTest(3);
        assertEquals(DMUtils.getPointOnRight(tableau, new Point(1,1)), Optional.of(new Point(2,1)));
        assertEquals(DMUtils.getPointOnRight(tableau, new Point(3,1)), Optional.empty());
    }

    @Test
    public void getAllPointByXAndYTest (){
        List<Point> tableau = createTaleauDeTest(3);
        assertEquals(DMUtils.getAllPointsByXAndY(tableau, 3,182).size(), 0);
    }

    private List<Point> createTaleauDeTest(int size) {
        List<Point> tableau = new ArrayList<>();
        tableau.add(new Point(1, 1));
        tableau.add(new Point(1, 2));
        tableau.add(new Point(1, 3));
        tableau.add(new Point(2, 1));
        tableau.add(new Point(2, 2));
        tableau.add(new Point(2, 3));
        tableau.add(new Point(1, 1));
        tableau.add(new Point(2, 2));
        tableau.add(new Point(3, 3));
        return tableau;
    }
}
