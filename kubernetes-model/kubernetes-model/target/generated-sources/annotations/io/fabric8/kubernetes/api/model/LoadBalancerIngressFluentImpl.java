package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class LoadBalancerIngressFluentImpl<A extends LoadBalancerIngressFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LoadBalancerIngressFluent<A>{

    private String hostname;
    private String ip;

    public LoadBalancerIngressFluentImpl(){
    }
    public LoadBalancerIngressFluentImpl(LoadBalancerIngress instance){
            this.withHostname(instance.getHostname()); 
            this.withIp(instance.getIp()); 
    }

    public String getHostname(){
            return this.hostname;
    }

    public A withHostname(String hostname){
            this.hostname=hostname; return (A) this;
    }

    public Boolean hasHostname(){
            return this.hostname != null;
    }

    public String getIp(){
            return this.ip;
    }

    public A withIp(String ip){
            this.ip=ip; return (A) this;
    }

    public Boolean hasIp(){
            return this.ip != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LoadBalancerIngressFluentImpl that = (LoadBalancerIngressFluentImpl) o;
            if (hostname != null ? !hostname.equals(that.hostname) :that.hostname != null) return false;
            if (ip != null ? !ip.equals(that.ip) :that.ip != null) return false;
            return true;
    }




}
