package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class BuildConfigStatusFluentImpl<A extends BuildConfigStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildConfigStatusFluent<A>{

    private Long lastVersion;

    public BuildConfigStatusFluentImpl(){
    }
    public BuildConfigStatusFluentImpl(BuildConfigStatus instance){
            this.withLastVersion(instance.getLastVersion()); 
    }

    public Long getLastVersion(){
            return this.lastVersion;
    }

    public A withLastVersion(Long lastVersion){
            this.lastVersion=lastVersion; return (A) this;
    }

    public Boolean hasLastVersion(){
            return this.lastVersion != null;
    }

    public A withNewLastVersion(String arg1){
            return (A)withLastVersion(new Long(arg1));
    }

    public A withNewLastVersion(long arg1){
            return (A)withLastVersion(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildConfigStatusFluentImpl that = (BuildConfigStatusFluentImpl) o;
            if (lastVersion != null ? !lastVersion.equals(that.lastVersion) :that.lastVersion != null) return false;
            return true;
    }




}
