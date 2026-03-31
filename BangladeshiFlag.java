public class BangladeshiFlag {
    circle C;
    Rectangle R;
public BangladeshiFlag(circle C,Rectangle R){
    this.C=new circle(C.center.x,C.center.y,C.radius);
    this.R=new Rectangle(R.bottomLeft,R.topRight);
}


 public boolean isBalanced(){
     int width=R.topRight.x-R.bottomLeft.x;
     int length=R.topRight.y-R.bottomLeft.y;
     point Rcenter=new point ((R.bottomLeft.x+R.topRight.x)/2,(R.bottomLeft.y+R.topRight.y)/2);
    if ((Rcenter.x==C.center.x)&& (Rcenter.y==C.center.y)){
        if(width<(C.radius*2) && length<(C.radius*2)){
        return true;}
        else return false;
    }

    else return false;
 }

}
