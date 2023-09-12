package i.after;

import java.io.File;

public class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider{

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
    public String getCDNAdress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCDNAdress'");
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
    
}
