public class Distancetwopoints {
    public static void main(String[] args) {

        int x1,x2;
        int y1,y2;
        double dis;
        x1=1;x2=6;
        y1=1;y2=6;
        dis=Math.sqrt(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        System.out.println("Distance between two points is:"+"("+x1+","+y1+")"+"("+x2+","+"y2"+")-->"+dis);
    }
}
