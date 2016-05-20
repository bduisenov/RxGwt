package rx.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface rxServiceAsync {

    void getMessage(String msg, AsyncCallback<String> async);
}
