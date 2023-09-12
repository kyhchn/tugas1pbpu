package i.before;
import java.io.File;

public class Amazon implements CloudProvider{

    @Override
    public void storeFile(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'storeFile'");
    }

    @Override
    public File getFile(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFile'");
    }

    @Override
    public void createServer(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createServer'");
    }

    @Override
    public String[] listServers(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listServers'");
    }

    @Override
    public String getCDNAdress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCDNAdress'");
    }

}
