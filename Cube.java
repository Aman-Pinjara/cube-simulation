import java.util.*;

class Cube{
    public static int front = 0;
    public static int back = 1;
    public static int right = 2;
    public static int left = 3;
    public static int top = 4;
    public static int bottom = 5;
     
    public static int red = 0;
    public static int orange = 1;
    public static int blue = 2;
    public static int green = 3;
    public static int white = 4;
    public static int yellow = 5;

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
        int curface;
        switch (move) {
            case back:
                curface = back;
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
                curface = back;
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
                curface = bottom;
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
            curface = bottom;
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
                curface = front;
                for(int i = 2;i>=0;i--){
                    next[i] = cube[top][2][i];
                }
                for(int i=0;i<3;i++){
                    int temp = cube[right][i][0];
                    cube[right][i][0] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[bottom][0][2-i];
                    cube[bottom][0][2-i] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[left][2-i][2];
                    cube[left][2-i][2] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[top][2][i];
                    cube[top][2][i] = next[i];
                    next[i] = temp;
                }
                break;
            case frontAC:
                curface = front;
                for(int i = 0;i<3;i++){
                    next[i] = cube[top][2][2-i];
                }
                for(int i=0;i<3;i++){
                    int temp = cube[left][i][2];
                    cube[left][i][2] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[bottom][0][i];
                    cube[bottom][0][i] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[right][2-i][0];
                    cube[right][2-i][0] = next[i];
                    next[i] = temp;
                }
                for(int i=0;i<3;i++){
                    int temp = cube[top][2][2-i];
                    cube[top][2][2-i] = next[i];
                    next[i] = temp;
                }
                break;
            case left:
                curface = left;
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
            curface = left;
                for(int i = 0;i<3;i++){
                    next[i] = cube[back][i][2];
                }
                faces[0] = bottom;
                faces[1] = front;
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
            curface = right;
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
            curface = right;
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
            curface = top;
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
            case upAC:
            curface = top;
                for(int i = 0;i<3;i++){
                    next[i] = cube[front][0][i];
                }
                faces[0] = right;
                faces[1] = back;
                faces[2] = left;
                faces[3] = front;
                for(int face: faces){
                    for(int i=0;i<3;i++){
                        int temp = cube[face][0][i];
                        cube[face][0][i] = next[i];
                        next[i] = temp;
                    }
                }
                break;
            default:
                curface = -1;
                break;           
        }
        if(
            move == Rotations.right ||
            move == Rotations.left ||
            move == Rotations.up ||
            move == Rotations.back ||
            move == Rotations.bottom ||
            move == Rotations.front
        ){
            //clockwise face shuffle
            for(int i=0;i<3;i++){
                for(int j=i;j<3;j++){
                    int temp = cube[curface][i][j];
                    cube[curface][i][j] = cube[curface][j][i];
                    cube[curface][j][i] = temp;
                }
            }
    
            for(int col=0;col<(3/2);col++){
                for(int row = 0;row<3;row++){
                    int temp = cube[curface][row][col];
                    cube[curface][row][col] = cube[curface][row][cube[curface].length-col-1];
                    cube[curface][row][cube[curface].length-col-1] = temp;
                }
            }      
        }else{
            //anticlockwise face shuffle
            for(int i=0;i<3;i++){
                for(int j=0;j<3-i;j++){
                    int temp = cube[curface][2-i][2-j];
                    cube[curface][2-i][2-j] = cube[curface][j][i];
                    cube[curface][j][i] = temp;
                }
            }
    
            for(int col=0;col<(3/2);col++){
                for(int row = 0;row<3;row++){
                    int temp = cube[curface][row][col];
                    cube[curface][row][col] = cube[curface][row][cube[curface].length-col-1];
                    cube[curface][row][cube[curface].length-col-1] = temp;
                }
            }       
        }
    }

    public boolean testFace(int face){
        int val = cube[face][0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(cube[face][i][j] != val) return false;
            }
        }
        return true;
    }
        
    public boolean testF2L(){
        if(!testFace(bottom)) return false;
        int[] faces = {left, front, right, back};
        for(int face : faces){
            int val = cube[face][1][0];
            for(int i=1;i<3;i++){
                for(int j=0;j<3;j++){
                    if(cube[face][i][j] != val) return false;
                }
            }   
        }
        return true;
    }

    public static ArrayList<Rotations> getMoves(String alg) throws Exception{
        String[] movesString = alg.split(" ");
        int len = movesString.length;
        ArrayList<Rotations> ans = new ArrayList<>();
        for(int i=0;i<len;i++){
            switch(movesString[i]){
                case "R":
                    ans.add(Rotations.right);
                    break;
                case "R'":
                    ans.add(Rotations.rightAC);
                    break;
                case "R2":
                    ans.add(Rotations.rightAC);
                    ans.add(Rotations.rightAC);
                    break;
                case "L":
                    ans.add(Rotations.left);
                    break;
                case "L'":
                    ans.add(Rotations.leftAC);
                    break;
                case "L2":
                    ans.add(Rotations.leftAC);
                    ans.add(Rotations.leftAC);
                    break;
                case "U":
                    ans.add(Rotations.up);
                    break;
                case "U'":
                    ans.add(Rotations.upAC);
                    break;
                case "U2":
                    ans.add(Rotations.upAC);
                    ans.add(Rotations.upAC);
                    break;
                case "D":
                    ans.add(Rotations.bottom);
                    break;
                case "D'":
                    ans.add(Rotations.bottomAC);
                    break;
                case "D2":
                    ans.add(Rotations.bottomAC);
                    ans.add(Rotations.bottomAC);
                    break;
                case "F":
                    ans.add(Rotations.front);
                    break;
                case "F'":
                    ans.add(Rotations.frontAC);
                    break;
                case "F2":
                    ans.add(Rotations.frontAC);
                    ans.add(Rotations.frontAC);
                    break;
                case "B":
                    ans.add(Rotations.back);
                    break;
                case "B'":
                    ans.add(Rotations.backAC);
                    break;
                case "B2":
                    ans.add(Rotations.backAC);
                    ans.add(Rotations.backAC);
                    break;
                default:
                    throw new Exception("Invalid Move Encountered "+movesString[i]);
            }
        }
        return ans;
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