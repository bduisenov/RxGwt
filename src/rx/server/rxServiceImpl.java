package rx.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import rx.client.rxService;

public class rxServiceImpl extends RemoteServiceServlet implements rxService {

    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}
