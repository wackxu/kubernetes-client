package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface HostAliasFluent<A extends HostAliasFluent<A>> extends Fluent<A>{


    public A addToHostnames(int index,String item);
    public A setToHostnames(int index,String item);
    public A addToHostnames(String... items);
    public A addAllToHostnames(Collection<String> items);
    public A removeFromHostnames(String... items);
    public A removeAllFromHostnames(Collection<String> items);
    public List<String> getHostnames();
    public String getHostname(int index);
    public String getFirstHostname();
    public String getLastHostname();
    public String getMatchingHostname(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withHostnames(List<String> hostnames);
    public A withHostnames(String... hostnames);
    public Boolean hasHostnames();
    public String getIp();
    public A withIp(String ip);
    public Boolean hasIp();



}
