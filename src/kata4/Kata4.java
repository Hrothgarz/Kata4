package kata4;

import java.io.File;

public class Kata4 {

    public static void main(String[] args) {
        File file = new File("D:\\Nueva Carpeta");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }
    }
    
}
