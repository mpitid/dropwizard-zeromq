package com.datasift.dropwizard.zeromq;

import com.yammer.dropwizard.lifecycle.Managed;
import org.zeromq.ZMQ;

/** TODO: Document */
public class ManagedSocket implements Managed {

    private final ZMQ.Socket socket;

    public ManagedSocket(final ZMQ.Socket socket) {
        this.socket = socket;
    }

    @Override
    public void start() throws Exception {
        // nothing to do
    }

    @Override
    public void stop() throws Exception {
        socket.close();
    }
}
