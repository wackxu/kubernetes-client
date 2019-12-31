package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface LoadBalancerIngressFluent<A extends LoadBalancerIngressFluent<A>> extends Fluent<A>{


    public String getHostname();
    public A withHostname(String hostname);
    public Boolean hasHostname();
    public String getIp();
    public A withIp(String ip);
    public Boolean hasIp();



}
