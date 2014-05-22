package com.datasift.dropwizard.zeromq.socket;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.yammer.dropwizard.config.Environment;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public interface ZeroMQSocketFactory {

    public ZMQ.Socket build(ZContext context, Environment environment);
}
