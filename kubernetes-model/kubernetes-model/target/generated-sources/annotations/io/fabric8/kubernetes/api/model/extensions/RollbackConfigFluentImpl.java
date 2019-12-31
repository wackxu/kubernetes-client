package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class RollbackConfigFluentImpl<A extends RollbackConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RollbackConfigFluent<A>{

    private Long revision;

    public RollbackConfigFluentImpl(){
    }
    public RollbackConfigFluentImpl(RollbackConfig instance){
            this.withRevision(instance.getRevision()); 
    }

    public Long getRevision(){
            return this.revision;
    }

    public A withRevision(Long revision){
            this.revision=revision; return (A) this;
    }

    public Boolean hasRevision(){
            return this.revision != null;
    }

    public A withNewRevision(String arg1){
            return (A)withRevision(new Long(arg1));
    }

    public A withNewRevision(long arg1){
            return (A)withRevision(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollbackConfigFluentImpl that = (RollbackConfigFluentImpl) o;
            if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
            return true;
    }




}
