package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class GitBuildSourceFluentImpl<A extends GitBuildSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GitBuildSourceFluent<A>{

    private String httpProxy;
    private String httpsProxy;
    private String noProxy;
    private String ref;
    private String uri;

    public GitBuildSourceFluentImpl(){
    }
    public GitBuildSourceFluentImpl(GitBuildSource instance){
            this.withHttpProxy(instance.getHttpProxy()); 
            this.withHttpsProxy(instance.getHttpsProxy()); 
            this.withNoProxy(instance.getNoProxy()); 
            this.withRef(instance.getRef()); 
            this.withUri(instance.getUri()); 
    }

    public String getHttpProxy(){
            return this.httpProxy;
    }

    public A withHttpProxy(String httpProxy){
            this.httpProxy=httpProxy; return (A) this;
    }

    public Boolean hasHttpProxy(){
            return this.httpProxy != null;
    }

    public String getHttpsProxy(){
            return this.httpsProxy;
    }

    public A withHttpsProxy(String httpsProxy){
            this.httpsProxy=httpsProxy; return (A) this;
    }

    public Boolean hasHttpsProxy(){
            return this.httpsProxy != null;
    }

    public String getNoProxy(){
            return this.noProxy;
    }

    public A withNoProxy(String noProxy){
            this.noProxy=noProxy; return (A) this;
    }

    public Boolean hasNoProxy(){
            return this.noProxy != null;
    }

    public String getRef(){
            return this.ref;
    }

    public A withRef(String ref){
            this.ref=ref; return (A) this;
    }

    public Boolean hasRef(){
            return this.ref != null;
    }

    public String getUri(){
            return this.uri;
    }

    public A withUri(String uri){
            this.uri=uri; return (A) this;
    }

    public Boolean hasUri(){
            return this.uri != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GitBuildSourceFluentImpl that = (GitBuildSourceFluentImpl) o;
            if (httpProxy != null ? !httpProxy.equals(that.httpProxy) :that.httpProxy != null) return false;
            if (httpsProxy != null ? !httpsProxy.equals(that.httpsProxy) :that.httpsProxy != null) return false;
            if (noProxy != null ? !noProxy.equals(that.noProxy) :that.noProxy != null) return false;
            if (ref != null ? !ref.equals(that.ref) :that.ref != null) return false;
            if (uri != null ? !uri.equals(that.uri) :that.uri != null) return false;
            return true;
    }




}
