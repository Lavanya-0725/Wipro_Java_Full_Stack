class Box{
    int width;
    int height;
    int depth;

    public Box(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }


    void volume() {
        int volume=width*height*depth;
        System.out.println("volume: "+volume);
    }
    
}
public class BoxVolume {
    public static void main(String args[]) {
        Box a=new Box(7,3,9);
        a.volume();
    }
    
}
