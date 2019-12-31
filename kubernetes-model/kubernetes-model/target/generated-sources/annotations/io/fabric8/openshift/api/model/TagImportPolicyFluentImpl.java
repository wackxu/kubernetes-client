package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class TagImportPolicyFluentImpl<A extends TagImportPolicyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TagImportPolicyFluent<A>{

    private Boolean insecure;
    private Boolean scheduled;

    public TagImportPolicyFluentImpl(){
    }
    public TagImportPolicyFluentImpl(TagImportPolicy instance){
            this.withInsecure(instance.getInsecure()); 
            this.withScheduled(instance.getScheduled()); 
    }

    public Boolean isInsecure(){
            return this.insecure;
    }

    public A withInsecure(Boolean insecure){
            this.insecure=insecure; return (A) this;
    }

    public Boolean hasInsecure(){
            return this.insecure != null;
    }

    public A withNewInsecure(String arg1){
            return (A)withInsecure(new Boolean(arg1));
    }

    public A withNewInsecure(boolean arg1){
            return (A)withInsecure(new Boolean(arg1));
    }

    public Boolean isScheduled(){
            return this.scheduled;
    }

    public A withScheduled(Boolean scheduled){
            this.scheduled=scheduled; return (A) this;
    }

    public Boolean hasScheduled(){
            return this.scheduled != null;
    }

    public A withNewScheduled(String arg1){
            return (A)withScheduled(new Boolean(arg1));
    }

    public A withNewScheduled(boolean arg1){
            return (A)withScheduled(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagImportPolicyFluentImpl that = (TagImportPolicyFluentImpl) o;
            if (insecure != null ? !insecure.equals(that.insecure) :that.insecure != null) return false;
            if (scheduled != null ? !scheduled.equals(that.scheduled) :that.scheduled != null) return false;
            return true;
    }




}
