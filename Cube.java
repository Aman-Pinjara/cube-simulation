import java.util.*;

class Cube{
    private static int front = 0;    
    private static int back = 1;    
    private static int right = 2;    
    private static int left = 3;    
    private static int top = 4;    
    private static int bottom = 5;

    private static int red = 0;
    private static int orange = 1;
    private static int blue = 2;
    private static int green = 3;
    private static int white = 4;
    private static int yellow = 5;

    int[][][] cube = new int[6][3][3];

    public Cube(){
        this.reset();
    }
    public void reset(){
        for(int i = 0;i<3;i++){
            Arrays.fill(cube[front][i], green);
            Arrays.fill(cube[top][i], yellow);
            Arrays.fill(cube[left][i], red);
            Arrays.fill(cube[right][i], orange);
            Arrays.fill(cube[back][i], blue);
            Arrays.fill(cube[bottom][i], white);
        }
    }
    public void print(){
        System.out.println("Front");
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(this.getColor(cube[front][i][j])+" ");
            }
            System.out.println();
        }
        System.out.println("top");
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(this.getColor(cube[top][i][j])+" ");
            }
            System.out.println();
        }
        System.out.println("left");
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(this.getColor(cube[left][i][j])+" ");
            }
            System.out.println();
        }
        System.out.println("right");
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(this.getColor(cube[right][i][j])+" ");
            }
            System.out.println();
        }
        System.out.println("bottom");
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(this.getColor(cube[bottom][i][j])+" ");
            }
            System.out.println();
        }
        System.out.println("back");
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(this.getColor(cube[back][i][j])+" ");
            }
            System.out.println();
        }
    }
    public String getColor(int a){
        switch (a) {
            case 0:
                return "Red";
            case 1:
                return "Orange";
            case 2:
                return "Blue";
            case 3:
                return "Green";
            case 4:
                return "White";
            case 5:
                return "Yellow";
            default:
                return "Error";
        }
    }
    public void rotate(Rotations move){
        int[] next = new int[3];
        int[] faces = new int[4];
        switch (move) {
            case back:
                for(int i = 2;i>=0;i--){
                    next[2-i] = cube[top][0][i];
                }
                for(int i=0;i<3;i++){
                    int temp = cube[left][i][0];
                    cube[left][i][0] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[bottom][2][i];
                    cube[bottom][2][i] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[right][2-i][2];
                    cube[right][2-i][2] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[top][0][2-i];
                    cube[top][0][2-i] = next[i];
                    next[i] = temp;
                }
                break;
            case backAC:
                for(int i = 0;i<3;i++){
                    next[i] = cube[top][0][i];
                }
                for(int i=0;i<3;i++){
                    int temp = cube[right][i][2];
                    cube[right][i][2] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[bottom][2][2-i];
                    cube[bottom][2][2-i] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[left][2-i][0];
                    cube[left][2-i][0] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[top][0][i];
                    cube[top][0][i] = next[i];
                    next[i] = temp;
                }
                break;
            case bottom:
                for(int i = 0;i<3;i++){
                    next[i] = cube[front][2][i];
                }
                faces[0] = right;
                faces[1] = back;
                faces[2] = left;
                faces[3] = front;
                for(int face: faces){
                    for(int i=0;i<3;i++){
                        int temp = cube[face][2][i];
                        cube[face][2][i] = next[i];
                        next[i] = temp;
                    }
                }
                break;
            case bottomAC:
                for(int i = 0;i<3;i++){
                    next[i] = cube[front][2][2-i];
                }
                faces[0] = left;
                faces[1] = back;
                faces[2] = right;
                faces[3] = front;
                for(int face: faces){
                    for(int i=0;i<3;i++){
                        int temp = cube[face][2][2-i];
                        cube[face][2][2-i] = next[i];
                        next[i] = temp;
                    }
                }
                break;
            case front:
                //TODO
                break;
            case frontAC:
            //Todo
                break;
            case left:
                for(int i = 0;i<3;i++){
                    next[i] = cube[top][i][0];
                }
                faces[0] = front;
                faces[1] = bottom;
                faces[2] = -1;
                faces[3] = -1;
                for(int faceidx=0;faceidx<2;faceidx++){
                    for(int i=0;i<3;i++){
                        int face = faces[faceidx];
                        int temp = cube[face][i][0];
                        cube[face][i][0] = next[i];
                        next[i] = temp;
                    }
                }
                for(int i=0;i<3;i++){
                    int temp = cube[back][2-i][2];
                    cube[back][2-i][2] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[top][i][0];
                    cube[top][i][0] = next[i];
                    next[i] = temp;
                }
                break;
            case leftAC:
                for(int i = 0;i<3;i++){
                    next[i] = cube[back][i][2];
                }
                faces[1] = bottom;
                faces[0] = front;
                faces[2] = top;
                faces[3] = -1;
                for(int faceidx=0;faceidx<3;faceidx++){
                    for(int i=0;i<3;i++){
                        int face = faces[faceidx];
                        int temp = cube[face][2-i][0];
                        cube[face][2-i][0] = next[i];
                        next[i] = temp;
                    }
                }
                for(int i=0;i<3;i++){
                    int temp = cube[back][i][2];
                    cube[back][i][2] = next[i];
                    next[i] = temp;
                }
                break;
            case right:
                for(int i = 0;i<3;i++){
                    next[i] = cube[back][i][0];
                }
                faces[0] = bottom;
                faces[1] = front;
                faces[2] = top;
                faces[3] = -1;
                for(int faceidx=0;faceidx<3;faceidx++){
                    for(int i=0;i<3;i++){
                        int face = faces[faceidx];
                        int temp = cube[face][2-i][2];
                        cube[face][2-i][2] = next[i];
                        next[i] = temp;
                    }
                }
                for(int i=0;i<3;i++){
                    int temp = cube[back][i][0];
                    cube[back][i][0] = next[i];
                    next[i] = temp;
                }
                break;
            case rightAC:
                for(int i = 0;i<3;i++){
                    next[i] = cube[back][2-i][0];
                }
                faces[0] = top;
                faces[1] = front;
                faces[2] = bottom;
                faces[3] = -1;
                for(int faceidx=0;faceidx<3;faceidx++){
                    for(int i=0;i<3;i++){
                        int face = faces[faceidx];
                        int temp = cube[face][i][2];
                        cube[face][i][2] = next[i];
                        next[i] = temp;
                    }
                }
                for(int i=0;i<3;i++){
                    int temp = cube[back][2-i][0];
                    cube[back][2-i][0] = next[i];
                    next[i] = temp;
                }
                break;
            case up:
                for(int i = 0;i<3;i++){
                    next[i] = cube[front][2][i];
                }
                faces[0] = left;
                faces[1] = back;
                faces[2] = right;
                faces[3] = front;
                for(int face: faces){
                    for(int i=0;i<3;i++){
                        int temp = cube[face][2][i];
                        cube[face][2][i] = next[i];
                        next[i] = temp;
                    }
                }
                break;
            case upAC:
                for(int i = 0;i<3;i++){
                    next[i] = cube[front][0][2-i];
                }
                faces[0] = left;
                faces[1] = back;
                faces[2] = right;
                faces[3] = front;
                for(int face: faces){
                    for(int i=0;i<3;i++){
                        int temp = cube[face][0][2-i];
                        cube[face][0][2-i] = next[i];
                        next[i] = temp;
                    }
                }
                break;
            default:
                break;
            
        }
    }
}

enum Rotations{
    right,
    rightAC,
    left,
    leftAC,
    up,
    upAC,
    front,
    frontAC,
    back,
    backAC,
    bottom,
    bottomAC,
}