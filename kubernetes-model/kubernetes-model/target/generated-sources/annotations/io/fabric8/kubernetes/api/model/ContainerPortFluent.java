package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ContainerPortFluent<A extends ContainerPortFluent<A>> extends Fluent<A>{


    public Integer getContainerPort();
    public A withContainerPort(Integer containerPort);
    public Boolean hasContainerPort();
    public String getHostIP();
    public A withHostIP(String hostIP);
    public Boolean hasHostIP();
    public Integer getHostPort();
    public A withHostPort(Integer hostPort);
    public Boolean hasHostPort();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getProtocol();
    public A withProtocol(String protocol);
    public Boolean hasProtocol();



}
