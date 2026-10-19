package Strings;

public class StringDisplacement {
    public static float getShortestPath(String path){
        int x = 0,y = 0;
        for(int i = 0; i <path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'W'){
                x--;
            } else if (dir == 'N') {
                y++;
            }else if (dir == 'S'){
                y--;
            }else if(dir == 'E'){
                x++;
            }
            else {
                System.out.println("Invalid Direction Symbol.");
            }
        }
        int X = x*x;
        int Y = y*y;
        return ((float)Math.sqrt(X +Y));

    }
    public static void main(String[] args){
        String path = "WNEEEEEEENESENNN";

        System.out.println("Displacement from Origin will be : " + getShortestPath(path));
    }
}
