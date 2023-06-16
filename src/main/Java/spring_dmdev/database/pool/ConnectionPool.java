package spring_dmdev.database.pool;

import java.util.List;
import java.util.Map;

public class ConnectionPool {
    private final String userName;
    private final int poolSize;
    private final List<Object> args;
    private final Map<String, Object> properties;


    public ConnectionPool(String userName, int poolSize, List<Object> args, Map<String, Object> properties) {
        this.userName = userName;
        this.poolSize = poolSize;
        this.args = args;
        this.properties = properties;
    }

    public String getUserName() {
        return userName;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public List<Object> getArgs() {
        return args;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "ConnectionPool{" +
                "userName='" + userName + '\'' +
                ", poolSize=" + poolSize +
                ", args=" + args +
                ", properties=" + properties +
                '}';
    }
}
