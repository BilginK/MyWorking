package com.cybertek.tests.ReplitQuestions.Assignment.Ouestion_12;

public class CameraPhone extends Phone{
    int imageSize;
    int memorySize;

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }
    public int numPictures(){

        int fotoNumbers = (memorySize*1000)/imageSize;
        return fotoNumbers;
    }

}

