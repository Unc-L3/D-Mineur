package nc.unc;

import lombok.extern.slf4j.Slf4j;

import java.awt.Point;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class DMUtils {
    public static Optional<Point> getPointOnLeft(List<Point> tableau, Point p){
        return tableau.stream()
                .filter(point -> point.x == p.x-1)
                .findFirst();
    }

    public static Optional<Point> getPointOnRight(List<Point> tableau, Point p){
        return tableau.stream()
                .filter(point -> point.x == p.x+1)
                .findFirst();
    }

    public static Optional<Point> getPointOnTop(List<Point> tableau, Point p){
        System.out.println("cette trace est trés importante");
        return tableau.stream()
                .filter(point -> point.y == p.y+1)
                .findFirst();
    }

    public static Optional<Point> getPointOnBottom(List<Point> tableau, Point p){
        return tableau.stream()
                .filter(point -> point.x == p.y-1)
                .findFirst();
    }

    public static List<Point> getAllPointsByXAndY(List<Point> tableau, int x, int y) {
        return tableau.stream()
                .filter(point -> point.x == x && point.y == y)
                .collect(Collectors.toList());
    }

    public static List<Point> getAttenantsPoints(List<Point> tableau, Point p){
        return null; // TODO
    }
}
