class RectangleTest {

    public static void findPoints(int x1, int y1, int x4, int y4) { //takes user input and finds other points to make rectangle or square
        int x2 = x1;
        int y3 = y1;
        int y2 = y4;
        int x3 = x4;

        System.out.println("Point x1 is located at (" + x1 + ", " + y1 + ")"); //prints out to user
        System.out.println("Point x2 is located at (" + x2 + ", " + y2 + ")");
        System.out.println("Point x3 is located at (" + x3 + ", " + y3 + ")");
        System.out.println("Point x4 is located at (" + x4 + ", " + y4 + ")");
    }

    public static void testPointOne(int x1, int y1) { //tests user points
         if (x1 < 0 || y1 < 0 || x1 > 20 || y1 > 20) {
            System.out.print("Invalid input, please input an integer between 0 - 20");
            System.exit(0);
        }
    }

    public static void testPointFour(int x4, int y4) { //tests user points
        if (x4 < 0 || y4 < 0 || x4 > 20 || y4 > 20) {
            System.out.print("Invalid input, please input an integer between 0 - 20");
            System.exit(0);
        }
    }

    public static int calculateArea(int x1, int y1, int x4, int y4) { // calculates the area of the rectangle
        int length = Math.abs(x4 - x1);
        int width = Math.abs(y4 - y1);

        if (length == width) {
            System.out.println("This shape is a square.");
        } else {
            System.out.println("This shape is a rectanlge.");
        }
        return length * width;
    }

    public static int calculatePerimeter(int x1, int y1, int x4, int y4) { // calculates the perimeter of the rectangle
        int length = Math.abs(x4 - x1);
        int width = Math.abs(y4 - y1);
        return 2 * (length + width);
    }
}
