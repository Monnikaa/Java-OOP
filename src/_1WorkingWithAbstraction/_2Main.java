package _1WorkingWithAbstraction;

import java.util.Arrays;
import java.util.Scanner;

public class _2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rectangleCoordinate = Arrays.stream(sc.nextLine().split("\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        _2Point bottomLeft = new _2Point(rectangleCoordinate[0], rectangleCoordinate[1]);
        _2Point topRight = new _2Point(rectangleCoordinate[2], rectangleCoordinate[3]);
        _2Rectangle rectangle = new _2Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            int[] pointCoordinate = Arrays.stream(sc.nextLine().split("\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            _2Point point = new _2Point(pointCoordinate[0], pointCoordinate[1]);
            System.out.println(rectangle.contains(point));
        }

    }
}
