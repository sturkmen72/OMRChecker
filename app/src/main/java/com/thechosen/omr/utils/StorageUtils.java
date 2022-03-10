package com.thechosen.omr.utils;

import android.graphics.Bitmap;
import android.os.Environment;

import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StorageUtils {

    public static void storeImageOnDevice(Mat mat, String imageName){
        FileOutputStream out = null;
        File imageFile = new File(Environment.getExternalStorageDirectory(), imageName+".jpg");

        Bitmap bmp = Bitmap.createBitmap(mat.cols(), mat.rows(), Bitmap.Config.ARGB_8888);
        Utils.matToBitmap(mat, bmp);

        try {
            if(!imageFile.exists()) {
                imageFile.createNewFile();
            }
            out = new FileOutputStream(imageFile);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, out);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void storeImageForJUnitTest(Mat mat, String imageName){
        Imgcodecs.imwrite("testimages\\verification\\"+imageName+".jpg", mat);
    }
}
