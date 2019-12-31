package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class KeyToPathFluentImpl<A extends KeyToPathFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements KeyToPathFluent<A>{

    private String key;
    private Integer mode;
    private String path;

    public KeyToPathFluentImpl(){
    }
    public KeyToPathFluentImpl(KeyToPath instance){
            this.withKey(instance.getKey()); 
            this.withMode(instance.getMode()); 
            this.withPath(instance.getPath()); 
    }

    public String getKey(){
            return this.key;
    }

    public A withKey(String key){
            this.key=key; return (A) this;
    }

    public Boolean hasKey(){
            return this.key != null;
    }

    public Integer getMode(){
            return this.mode;
    }

    public A withMode(Integer mode){
            this.mode=mode; return (A) this;
    }

    public Boolean hasMode(){
            return this.mode != null;
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
            KeyToPathFluentImpl that = (KeyToPathFluentImpl) o;
            if (key != null ? !key.equals(that.key) :that.key != null) return false;
            if (mode != null ? !mode.equals(that.mode) :that.mode != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            return true;
    }




}
