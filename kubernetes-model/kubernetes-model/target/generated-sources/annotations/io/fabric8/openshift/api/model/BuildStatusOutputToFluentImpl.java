package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class BuildStatusOutputToFluentImpl<A extends BuildStatusOutputToFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildStatusOutputToFluent<A>{

    private String imageDigest;

    public BuildStatusOutputToFluentImpl(){
    }
    public BuildStatusOutputToFluentImpl(BuildStatusOutputTo instance){
            this.withImageDigest(instance.getImageDigest()); 
    }

    public String getImageDigest(){
            return this.imageDigest;
    }

    public A withImageDigest(String imageDigest){
            this.imageDigest=imageDigest; return (A) this;
    }

    public Boolean hasImageDigest(){
            return this.imageDigest != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildStatusOutputToFluentImpl that = (BuildStatusOutputToFluentImpl) o;
            if (imageDigest != null ? !imageDigest.equals(that.imageDigest) :that.imageDigest != null) return false;
            return true;
    }




}
