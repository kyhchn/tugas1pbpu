package i.after;

import java.io.File;

interface CloudStorageProvider {
    public void storeFile(String name);

    public File getFile(String name);
}
