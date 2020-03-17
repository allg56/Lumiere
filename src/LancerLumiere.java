import javax.swing.JFrame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;


public class LancerLumiere {

    public static void main (String args[]){
        String test;
        MapFichier mpFic = new MapFichier();
        test = mpFic.mapFichier("C:\\Users\\Admin\\IdeaProjects\\Lumiere\\src\\Ressource\\TestInterface");
        System.out.println(test);
    }

}

