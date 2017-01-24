package at.aau.itec.esop16.lesson10;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.01.2017 10:38.
 */
public class FileFun {
    public static void main(String[] args) {
        File f = new File(".");
        System.out.println("Is it a directory? " + f.isDirectory());
        File[] subFiles = f.listFiles();
        ArrayList<File> fileList = new ArrayList<>(subFiles.length); // mache liste (collections)
        Collections.addAll(fileList, subFiles); // füge alle files aus array zur liste
        Collections.sort(fileList, new FileComparator()); // sortiere liste
        Iterator<File> iterator = fileList.iterator();
        while (iterator.hasNext()) { // iterator nutzen
            File s = iterator.next();
            if (s.isDirectory()) {
                System.out.printf("%s (%d)\n", s.getName(), s.listFiles().length);
            } else {
                System.out.println(s.getName());
            }
        }
    }
}

class FileComparator implements Comparator<File> {
    @Override
    public int compare(File o1, File o2) {
        if (o1.isDirectory() && o2.isDirectory()) return 0;
        if (o1.isDirectory() && !o2.isDirectory()) return -1;
        if (!o1.isDirectory() && o2.isDirectory()) return 1;

        return 0;
    }
}
