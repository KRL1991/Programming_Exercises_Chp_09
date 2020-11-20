package Exercise_9_1;

public class Main {

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(4,40);
        rectangles[1] = new Rectangle(3.5,35.9);

        for (int i = 0; i < 2 ; i++) {
            System.out.println("MyRec2 " + (i+1) +":");
            System.out.print("Area = " + rectangles[i].getArea());
            System.out.println(" Perimeter = " +  rectangles[i].getPerimeter() +"\n");
        }
            
        }
    }

