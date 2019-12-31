package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ServiceAccountTokenProjectionFluentImpl<A extends ServiceAccountTokenProjectionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceAccountTokenProjectionFluent<A>{

    private String audience;
    private Long expirationSeconds;
    private String path;

    public ServiceAccountTokenProjectionFluentImpl(){
    }
    public ServiceAccountTokenProjectionFluentImpl(ServiceAccountTokenProjection instance){
            this.withAudience(instance.getAudience()); 
            this.withExpirationSeconds(instance.getExpirationSeconds()); 
            this.withPath(instance.getPath()); 
    }

    public String getAudience(){
            return this.audience;
    }

    public A withAudience(String audience){
            this.audience=audience; return (A) this;
    }

    public Boolean hasAudience(){
            return this.audience != null;
    }

    public Long getExpirationSeconds(){
            return this.expirationSeconds;
    }

    public A withExpirationSeconds(Long expirationSeconds){
            this.expirationSeconds=expirationSeconds; return (A) this;
    }

    public Boolean hasExpirationSeconds(){
            return this.expirationSeconds != null;
    }

    public A withNewExpirationSeconds(String arg1){
            return (A)withExpirationSeconds(new Long(arg1));
    }

    public A withNewExpirationSeconds(long arg1){
            return (A)withExpirationSeconds(new Long(arg1));
    }

    public String getPath(){
            return this.path;
    }

    public A withPath(String path){
            this.path=path; return (A) this;
    }

    public Boolean hasPath(){
            return this.path != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountTokenProjectionFluentImpl that = (ServiceAccountTokenProjectionFluentImpl) o;
            if (audience != null ? !audience.equals(that.audience) :that.audience != null) return false;
            if (expirationSeconds != null ? !expirationSeconds.equals(that.expirationSeconds) :that.expirationSeconds != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            return true;
    }




}
