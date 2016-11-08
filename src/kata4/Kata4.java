package kata4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        String filename = "D:\\NuevaCarpeta/emailsfilev1.txt";
        ArrayList<String> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    private static void print(File[] files, String indent){
        if(files==null) {
            return;
        }
        for (File file : files) {
            System.out.println(indent);
            System.out.println(file.isDirectory()?"+":"-");
            if(file.isHidden()){
                continue;
            }
            System.out.println(file);
            if(file.isDirectory()){
                print(file.listFiles(),indent);
                System.out.println(" ");
            }
        }
    }
}
