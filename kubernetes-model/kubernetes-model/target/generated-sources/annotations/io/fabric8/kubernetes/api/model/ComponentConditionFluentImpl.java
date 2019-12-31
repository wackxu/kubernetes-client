package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ComponentConditionFluentImpl<A extends ComponentConditionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ComponentConditionFluent<A>{

    private String error;
    private String message;
    private String status;
    private String type;

    public ComponentConditionFluentImpl(){
    }
    public ComponentConditionFluentImpl(ComponentCondition instance){
            this.withError(instance.getError()); 
            this.withMessage(instance.getMessage()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
    }

    public String getError(){
            return this.error;
    }

    public A withError(String error){
            this.error=error; return (A) this;
    }

    public Boolean hasError(){
            return this.error != null;
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
            ComponentConditionFluentImpl that = (ComponentConditionFluentImpl) o;
            if (error != null ? !error.equals(that.error) :that.error != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }




}
