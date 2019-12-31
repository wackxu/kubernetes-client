package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class DaemonSetConditionFluentImpl<A extends DaemonSetConditionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DaemonSetConditionFluent<A>{

    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public DaemonSetConditionFluentImpl(){
    }
    public DaemonSetConditionFluentImpl(DaemonSetCondition instance){
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
    }

    public String getLastTransitionTime(){
            return this.lastTransitionTime;
    }

    public A withLastTransitionTime(String lastTransitionTime){
            this.lastTransitionTime=lastTransitionTime; return (A) this;
    }

    public Boolean hasLastTransitionTime(){
            return this.lastTransitionTime != null;
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

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
    }

    public String getStatus(){
            return this.status;
    }

    public A withStatus(String status){
            this.status=status; return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetConditionFluentImpl that = (DaemonSetConditionFluentImpl) o;
            if (lastTransitionTime != null ? !lastTransitionTime.equals(that.lastTransitionTime) :that.lastTransitionTime != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }




}
