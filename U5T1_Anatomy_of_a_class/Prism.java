public class Prism {
    private int len;
    private int wid;
    private int hei;

    public Prism(int length, int width, int height){
        len = length;
        wid = width;
        hei = height; 
    }

    public String dimensions(){
        return "Length = "+len+"\nWidth = "+wid+"\nHeight = "+hei;
    }

    public int surfaceArea(){
        return (2*len*wid)+(2*len*hei)+(2*wid*hei);
    }

    public int volume(){
        return len*wid*hei;
    }

    public void setLength(int length){
        len = length;
    }

    public void setWidth(int width){
        wid = width;
    }

    public void setHeight(int height){
        hei = height;
    }
}
