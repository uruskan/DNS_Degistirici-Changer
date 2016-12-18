import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by mrnoone-yup on 12/16/16.
 */


public class Dns_Degistirici {
    public static void main(String[] args) throws IOException {
        String str = "nameserver1 8.8.8.8 \n";
        String str2 = "nameserver2 8.8.4.4";

        File file = new File("/etc/resolv.conf");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.write(str2);
        bWriter.close();


    }

}
