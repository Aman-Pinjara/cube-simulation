import java.util.ArrayList;

import lldata.zblldata;

public class TestAlg {
    public static void main(String[] args) throws Exception {
        Cube cube = new Cube();
        // String[][] plls = plldata.pll;
        // String[][] olls = olldata.oll;
        // String[][] colls = colldata.coll;
        String[][] zblls = zblldata.zbll;
        String[] rotations = {"y", "y'", "y2"};
        for(int i=0;i<zblls.length;i++){
            for(int j=0;j<zblls[i].length;j++){
                String alg = zblls[i][j];
                for(String rotate: rotations){
                    cube.reset();
                    String rotatalg = Generator.rotate(alg, rotate);
                    String inverse = Generator.inverse(rotatalg);
                    ArrayList<Rotations> moves = Cube.getMoves(inverse);
                    for(Rotations move: moves){
                        cube.rotate(move);
                    }
                    if(!cube.testF2L() || !cube.testFace(Cube.bottom)){
                        System.out.println(alg);
                        System.out.println("Failed at "+i+" -> alg no "+j);
                    }
                }
            }
        }
    }
}
