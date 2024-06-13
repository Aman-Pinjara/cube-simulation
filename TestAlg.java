public class TestAlg {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.print();
        cube.rotate(Rotations.back);
        System.out.println("After rotation");
        cube.print();
    }
}
