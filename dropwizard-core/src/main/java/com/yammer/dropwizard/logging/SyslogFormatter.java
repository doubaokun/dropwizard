package com.yammer.dropwizard.logging;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.PatternLayout;

import java.util.TimeZone;

public class SyslogFormatter extends PatternLayout {
    private final String name;

    public SyslogFormatter(LoggerContext context, TimeZone timeZone, String name) {
        super();
        this.name = name;
        getDefaultConverterMap().put("ex", PrefixedThrowableProxyConverter.class.getName());
        setPattern(name + ": %d{ISO8601," + timeZone.getID() + "}] %-5p [%t] %c{2} %X - %m\n");
        setContext(context);
    }
}
