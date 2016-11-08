package kata4;

import java.io.File;

public class Kata4 {

    public static void main(String[] args) {
        File file = new File("D:\\Nueva Carpeta");
        print(file.listFiles()," ");
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
