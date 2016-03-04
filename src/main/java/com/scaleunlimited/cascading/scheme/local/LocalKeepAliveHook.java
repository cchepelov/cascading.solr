package com.scaleunlimited.cascading.scheme.local;

import java.util.Properties;

import cascading.flow.FlowProcess;

import com.scaleunlimited.cascading.scheme.core.KeepAliveHook;

public class LocalKeepAliveHook extends KeepAliveHook {

    private FlowProcess<? extends Properties> _flowProcess;

    public LocalKeepAliveHook(FlowProcess<? extends Properties> flowProcess) {
        _flowProcess = flowProcess;
    }
    
    @Override
    public void keepAlive() {
        _flowProcess.keepAlive();
    }

}
