package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface GitBuildSourceFluent<A extends GitBuildSourceFluent<A>> extends Fluent<A>{


    public String getHttpProxy();
    public A withHttpProxy(String httpProxy);
    public Boolean hasHttpProxy();
    public String getHttpsProxy();
    public A withHttpsProxy(String httpsProxy);
    public Boolean hasHttpsProxy();
    public String getNoProxy();
    public A withNoProxy(String noProxy);
    public Boolean hasNoProxy();
    public String getRef();
    public A withRef(String ref);
    public Boolean hasRef();
    public String getUri();
    public A withUri(String uri);
    public Boolean hasUri();



}
