package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class AllowedHostPathFluentImpl<A extends AllowedHostPathFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AllowedHostPathFluent<A>{

    private String pathPrefix;
    private Boolean readOnly;

    public AllowedHostPathFluentImpl(){
    }
    public AllowedHostPathFluentImpl(AllowedHostPath instance){
            this.withPathPrefix(instance.getPathPrefix()); 
            this.withReadOnly(instance.getReadOnly()); 
    }

    public String getPathPrefix(){
            return this.pathPrefix;
    }

    public A withPathPrefix(String pathPrefix){
            this.pathPrefix=pathPrefix; return (A) this;
    }

    public Boolean hasPathPrefix(){
            return this.pathPrefix != null;
    }

    public Boolean isReadOnly(){
            return this.readOnly;
    }

    public A withReadOnly(Boolean readOnly){
            this.readOnly=readOnly; return (A) this;
    }

    public Boolean hasReadOnly(){
            return this.readOnly != null;
    }

    public A withNewReadOnly(String arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public A withNewReadOnly(boolean arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AllowedHostPathFluentImpl that = (AllowedHostPathFluentImpl) o;
            if (pathPrefix != null ? !pathPrefix.equals(that.pathPrefix) :that.pathPrefix != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            return true;
    }




}
