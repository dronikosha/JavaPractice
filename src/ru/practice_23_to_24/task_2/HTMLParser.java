package ru.practice_23_to_24.task_2;

import java.io.*;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParser {
    private static String IMAGE_DESTINATION_FOLDER = "src/ru/luckoff/mirea/exercies23and24/task_2/images";

    public static void main(String[] args) throws IOException {
        new File("src/ru/practice_23_to_24/task_2/images").mkdirs();

        String strURL = "http://www.mirea.ru";
        Document document = Jsoup
                .connect(strURL)
                .userAgent("Mozilla/5.0")
                .timeout(10 * 1000)
                .get();

        Elements imageElements = document.select("img");

        for(Element imageElement : imageElements){
            String strImageURL = imageElement.attr("abs:src");
            downloadImage(strImageURL);
        }
    }

    private static void downloadImage(String strImageURL){
        String strImageName =
                strImageURL.substring( strImageURL.lastIndexOf("/") + 1 );

        System.out.println("Saving: " + strImageName + ", from: " + strImageURL);
        try {
            URL urlImage = new URL(strImageURL);
            InputStream in = urlImage.openStream();

            byte[] buffer = new byte[4096];
            int n = -1;

            OutputStream os =
                    new FileOutputStream( IMAGE_DESTINATION_FOLDER + "/" + strImageName );

            while ( (n = in.read(buffer)) != -1 ){
                os.write(buffer, 0, n);
            }

            os.close();
            System.out.println("Image saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

