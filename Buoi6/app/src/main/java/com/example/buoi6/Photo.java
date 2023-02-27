package com.example.buoi6;

public class Photo {
    private int id;
    private String source_photo;
    private  String title_photo;
    private String sub_photo;
    public Photo(int id , String source_photo, String title_photo, String sub_photo){
        this.id=id;
        this.source_photo = source_photo;
        this.title_photo = title_photo;
        this.sub_photo = sub_photo;
    }
    public int getId(){
        return id;
    }
    public String getSource_photo(){
        return source_photo;
    }
    public  String getTitle_photo(){
        return  title_photo;
    }
    public  String getSub_photo(){
        return sub_photo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSource_photo(String source_photo) {
        this.source_photo = source_photo;
    }

    public void setSub_photo(String sub_photo) {
        this.sub_photo = sub_photo;
    }

    public void setTitle_photo(String title_photo) {
        this.title_photo = title_photo;
    }
}
