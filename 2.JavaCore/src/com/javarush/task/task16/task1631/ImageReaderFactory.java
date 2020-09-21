package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes){
        ImageReader reader = null;

        switch (imageTypes){

            case BMP: {
                reader=  new BmpReader();
                break;
            }
            case JPG:{
                reader =  new JpgReader();
                break;
            }
            case PNG:{
                reader = new PngReader();
                break;
            }
            default:{
                reader = null;
                throw new IllegalArgumentException();
            }
        }
        if(reader == null){
            throw new IllegalArgumentException();
        }
        return  reader;

    }

}
