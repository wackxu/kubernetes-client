package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HandlerBuilder extends HandlerFluentImpl<HandlerBuilder> implements VisitableBuilder<Handler,HandlerBuilder>{

    HandlerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HandlerBuilder(){
            this(true);
    }
    public HandlerBuilder(Boolean validationEnabled){
            this(new Handler(), validationEnabled);
    }
    public HandlerBuilder(HandlerFluent<?> fluent){
            this(fluent, true);
    }
    public HandlerBuilder(HandlerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Handler(), validationEnabled);
    }
    public HandlerBuilder(HandlerFluent<?> fluent,Handler instance){
            this(fluent, instance, true);
    }
    public HandlerBuilder(HandlerFluent<?> fluent,Handler instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExec(instance.getExec()); 
            fluent.withHttpGet(instance.getHttpGet()); 
            fluent.withTcpSocket(instance.getTcpSocket()); 
            this.validationEnabled = validationEnabled; 
    }
    public HandlerBuilder(Handler instance){
            this(instance,true);
    }
    public HandlerBuilder(Handler instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExec(instance.getExec()); 
            this.withHttpGet(instance.getHttpGet()); 
            this.withTcpSocket(instance.getTcpSocket()); 
            this.validationEnabled = validationEnabled; 
    }
    public HandlerBuilder(Validator validator){
            this(new Handler(), true);
    }
    public HandlerBuilder(HandlerFluent<?> fluent,Handler instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExec(instance.getExec()); 
            fluent.withHttpGet(instance.getHttpGet()); 
            fluent.withTcpSocket(instance.getTcpSocket()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HandlerBuilder(Handler instance,Validator validator){
            this.fluent = this; 
            this.withExec(instance.getExec()); 
            this.withHttpGet(instance.getHttpGet()); 
            this.withTcpSocket(instance.getTcpSocket()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Handler build(){
            Handler buildable = new Handler(fluent.getExec(),fluent.getHttpGet(),fluent.getTcpSocket());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HandlerBuilder that = (HandlerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
