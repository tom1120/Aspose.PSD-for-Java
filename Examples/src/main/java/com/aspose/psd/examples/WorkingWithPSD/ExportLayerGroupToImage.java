package com.aspose.psd.examples.WorkingWithPSD;

import com.aspose.psd.Image;
import com.aspose.psd.examples.Utils.Utils;
import com.aspose.psd.fileformats.psd.PsdImage;
import com.aspose.psd.fileformats.psd.layers.Layer;
import com.aspose.psd.fileformats.psd.layers.LayerGroup;
import com.aspose.psd.fileformats.psd.layers.TextLayer;
import com.aspose.psd.imageoptions.PngOptions;


public class ExportLayerGroupToImage {
    public static void main(String[] args) {
        String sourceDir = Utils.GetDataDir_PSD();
        String outputDir = Utils.GetDataDir_Output();

        //ExStart:1
        PsdImage psdImage = null;
        try
        {
            psdImage = (PsdImage)Image.load(sourceDir + "ExportLayerGroupToImageSample.psd");
//            psdImage = (PsdImage)Image.load(sourceDir + "psd35547.psd");
            System.out.println("psdImage.getLayers().length = " + psdImage.getLayers().length);
            // folder with background
            LayerGroup bgFolder = (LayerGroup)psdImage.getLayers()[0];
            // folder with content
            LayerGroup contentFolder = (LayerGroup)psdImage.getLayers()[4];
            Layer nineFolder = psdImage.getLayers()[8];
            TextLayer lastFolder = (TextLayer)psdImage.getLayers()[10];
            Layer oneFolder = psdImage.getLayers()[1];
            Layer twoFolder = psdImage.getLayers()[2];
            Layer threeFolder = psdImage.getLayers()[3];
            bgFolder.save(outputDir + "background.png", new PngOptions());
            contentFolder.save(outputDir + "content.png", new PngOptions());
//            lastFolder.save(outputDir + "last.png", new PngOptions());
            System.out.println(lastFolder.getText());
            nineFolder.save(outputDir + "nine.png", new PngOptions());
            oneFolder.save(outputDir + "one.png", new PngOptions());
            twoFolder.save(outputDir + "two.png", new PngOptions());
            threeFolder.save(outputDir + "threeFolder.png", new PngOptions());
        }
        finally
        {
            if (psdImage != null) psdImage.dispose();
        }
        //ExEnd:1

        System.out.println("ExportLayerGroupToImage executed successfully");
    }
}
