package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class PreconditionsFluentImpl<A extends PreconditionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PreconditionsFluent<A>{

    private String uid;

    public PreconditionsFluentImpl(){
    }
    public PreconditionsFluentImpl(Preconditions instance){
            this.withUid(instance.getUid()); 
    }

    public String getUid(){
            return this.uid;
    }

    public A withUid(String uid){
            this.uid=uid; return (A) this;
    }

    public Boolean hasUid(){
            return this.uid != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PreconditionsFluentImpl that = (PreconditionsFluentImpl) o;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            return true;
    }




}
