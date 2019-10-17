package com.example.climate;

public class Model {
    public String text;
   public int image;
    public Model(String text,int image){
        this.text=text;
        this.image=image;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
