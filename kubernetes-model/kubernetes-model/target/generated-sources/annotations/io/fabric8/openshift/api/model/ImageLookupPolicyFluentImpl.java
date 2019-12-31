package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ImageLookupPolicyFluentImpl<A extends ImageLookupPolicyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageLookupPolicyFluent<A>{

    private Boolean local;

    public ImageLookupPolicyFluentImpl(){
    }
    public ImageLookupPolicyFluentImpl(ImageLookupPolicy instance){
            this.withLocal(instance.getLocal()); 
    }

    public Boolean isLocal(){
            return this.local;
    }

    public A withLocal(Boolean local){
            this.local=local; return (A) this;
    }

    public Boolean hasLocal(){
            return this.local != null;
    }

    public A withNewLocal(String arg1){
            return (A)withLocal(new Boolean(arg1));
    }

    public A withNewLocal(boolean arg1){
            return (A)withLocal(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageLookupPolicyFluentImpl that = (ImageLookupPolicyFluentImpl) o;
            if (local != null ? !local.equals(that.local) :that.local != null) return false;
            return true;
    }




}
