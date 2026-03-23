package Utils;

import java.io.File;

public class FileUpload {

        public static String getFilePath(String fileName) {
            String projectPath = System.getProperty("user.dir");
            return projectPath + File.separator
                    + "src" + File.separator
                    + "test" + File.separator
                    + "resources" + File.separator
                    + "uploads" + File.separator
                    + fileName;
        }
    }

