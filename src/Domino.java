public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return top;
    }
    public int getBottom() {
        return bottom;
    }
    public void setTop(int top){
       this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public String toString(){
        return top + "/" + bottom;

    }
    public void flip(){
        int last = top;
        top = bottom;
        bottom = last;
    }
    public void settle(){
        if(top > bottom){
            flip();
        }
    }
    public int compareTo(Domino other) {
        if (Math.min(this.top, this.bottom) < Math.min(other.top, other.bottom)) {
            return -1;
        } else if (Math.min(this.top, this.bottom) > Math.min(other.top, other.bottom)) {
            return 1;
        } else {
            if (Math.max(this.top, this.bottom) < Math.max(other.top, other.bottom)) {
                return -1;
            } else if (Math.max(this.top, this.bottom) > Math.max(other.top, other.bottom)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public int compareToWeight(Domino other){
        int me = this.top + this.bottom;
        int you = other.top + other.bottom;
        if(me < you){
            return -1;
        }
        else if(me > you){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean canConnect(Domino other){
        if(this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom){
            return true;
        }
        else{
            return false;
        }
    }

}
