import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MapFichier {
    public String mapFichier(String sPath){
        FileInputStream fis = null ;
        StringBuilder FileToStr= new StringBuilder();
            try{
            fis = new FileInputStream(new File(sPath));
            byte[] buf = new byte[8];
            int n = 0;
            while ((n = fis.read(buf)) >= 0) {
                for (byte bit : buf) {
                    FileToStr.append(String.valueOf((char) bit));
                }
                buf = new byte[8];
            }
        } catch (
        IOException e) {
            e.printStackTrace();
        } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                return FileToStr.toString();
            }
    }
}
