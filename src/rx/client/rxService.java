package rx.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("rxService")
public interface rxService extends RemoteService {

    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use rxService.App.getInstance() to access static instance of rxServiceAsync
     */
    public static class App {

        private static rxServiceAsync ourInstance = GWT.create(rxService.class);

        public static synchronized rxServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
