package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class StatusCauseFluentImpl<A extends StatusCauseFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StatusCauseFluent<A>{

    private String field;
    private String message;
    private String reason;

    public StatusCauseFluentImpl(){
    }
    public StatusCauseFluentImpl(StatusCause instance){
            this.withField(instance.getField()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
    }

    public String getField(){
            return this.field;
    }

    public A withField(String field){
            this.field=field; return (A) this;
    }

    public Boolean hasField(){
            return this.field != null;
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatusCauseFluentImpl that = (StatusCauseFluentImpl) o;
            if (field != null ? !field.equals(that.field) :that.field != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            return true;
    }




}
