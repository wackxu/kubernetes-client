package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class PersistentVolumeStatusFluentImpl<A extends PersistentVolumeStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PersistentVolumeStatusFluent<A>{

    private String message;
    private String phase;
    private String reason;

    public PersistentVolumeStatusFluentImpl(){
    }
    public PersistentVolumeStatusFluentImpl(PersistentVolumeStatus instance){
            this.withMessage(instance.getMessage()); 
            this.withPhase(instance.getPhase()); 
            this.withReason(instance.getReason()); 
    }

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
    }

    public String getPhase(){
            return this.phase;
    }

    public A withPhase(String phase){
            this.phase=phase; return (A) this;
    }

    public Boolean hasPhase(){
            return this.phase != null;
    }

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeStatusFluentImpl that = (PersistentVolumeStatusFluentImpl) o;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            return true;
    }




}
