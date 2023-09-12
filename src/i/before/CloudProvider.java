package i.before;
import java.io.File;

interface CloudProvider {
    public void storeFile(String name);

    public File getFile(String name);

    public void createServer(String name);

    public String[] listServers(String name);

    public String getCDNAdress();
}
