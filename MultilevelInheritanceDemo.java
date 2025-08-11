import java.util.Scanner;

// Base class
class Shape {
    double radius, length, width, height;

    void inputDimensions() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
}

// Intermediate class
class AreaCalculator extends Shape {

    double areaOfCircle() {
        return Math.PI * radius * radius;
    }

    double areaOfRectangle() {
        return length * width;
    }

    double areaOfTriangle() {
        return 0.5 * length * height;
    }
}

// Derived class
class VolumeCalculator extends AreaCalculator {

    double volumeOfSphere() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    double volumeOfCuboid() {
        return length * width * height;
    }

    double volumeOfCylinder() {
        return Math.PI * radius * radius * height;
    }

    void displayResults() {
        System.out.println("\n--- Calculated Areas ---");
        System.out.printf("Area of Circle: %.2f\n", areaOfCircle());
        System.out.printf("Area of Rectangle: %.2f\n", areaOfRectangle());
        System.out.printf("Area of Triangle: %.2f\n", areaOfTriangle());

        System.out.println("\n--- Calculated Volumes ---");
        System.out.printf("Volume of Sphere: %.2f\n", volumeOfSphere());
        System.out.printf("Volume of Cuboid: %.2f\n", volumeOfCuboid());
        System.out.printf("Volume of Cylinder: %.2f\n", volumeOfCylinder());
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();
        vc.inputDimensions();
        vc.displayResults();
    }
}
