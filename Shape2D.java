public class Shape2D {
    int length;
    int width;


    public Shape2D(int length,int width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length * width;
    }
    double perimeter(){
        return 2*(length+width);
    }
}
