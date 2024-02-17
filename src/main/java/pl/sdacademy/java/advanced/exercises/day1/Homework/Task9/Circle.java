package pl.sdacademy.java.advanced.exercises.day1.Homework.Task9;

import java.util.*;

public class Circle {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow((center.getX() - point.getX()), 2) + Math.pow((center.getY() - point.getY()), 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public Map<String, Point2D> getSlicePoints() {
        double vectorX = Math.abs(center.getX() - point.getX());
        double vectorY = Math.abs(center.getY() - point.getY());
        Point2D pointFirst = new Point2D(center.getX() + vectorX, center.getY() + vectorY);
        Point2D pointSecond = new Point2D(center.getX() + vectorX, center.getY() - vectorY);
        Point2D pointThird = new Point2D(center.getX() - vectorX, center.getY() - vectorY);
        Point2D pointFourth = new Point2D(center.getX() - vectorX, center.getY() + vectorY);
        ArrayList<Point2D> point2Ds = new ArrayList<>();
        point2Ds.add(pointFirst);
        point2Ds.add(pointSecond);
        point2Ds.add(pointThird);
        point2Ds.add(pointFourth);
        Map<String, Point2D> result = new LinkedHashMap<>();
//        result.put("Point 1", pointFirst);
//        result.put("Point 2", pointSecond);
//        result.put("Point 3", pointThird);
//        result.put("Point 4", pointFourth);
//        for(Map.Entry<String, Point2D> element : result.entrySet()){
//            if(element.getValue().getX() == point.getX() && element.getValue().getY() == point.getY()){
//                pointKey = element.getKey();
//            }
//        }
        int counter = 1;
        for (int i = 0; i < 4; i++) {
            if (point2Ds.get(i).getX() == point.getX() && point2Ds.get(i).getY() == point.getY()) {
                continue;
            } else {
                result.put(("Point "+counter), point2Ds.get(i));
                counter++;
            }
        }
        return result;
    }


}
