package shomama.yoursongmanager.typeClass;

public class listItemContainer {
    private String songName;
    private int keyHeight;

    //setter
    public void setSongName(String str){
        this.songName = str;
    }
    public void setKeyHeight(int num){
        this.keyHeight = num;
    }

    //getter
    public String getSongName(){
        return this.songName;
    }
    public int getKeyHeight(){
        return this.keyHeight;
    }
}
