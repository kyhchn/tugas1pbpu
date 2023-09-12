package i.after;

interface CloudHostingProvider {
    public void createServer(String name);

    public String[] listServers(String name);
}
