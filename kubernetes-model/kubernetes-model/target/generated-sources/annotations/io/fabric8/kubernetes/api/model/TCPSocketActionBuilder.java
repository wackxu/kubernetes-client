package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TCPSocketActionBuilder extends TCPSocketActionFluentImpl<TCPSocketActionBuilder> implements VisitableBuilder<TCPSocketAction,TCPSocketActionBuilder>{

    TCPSocketActionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TCPSocketActionBuilder(){
            this(true);
    }
    public TCPSocketActionBuilder(Boolean validationEnabled){
            this(new TCPSocketAction(), validationEnabled);
    }
    public TCPSocketActionBuilder(TCPSocketActionFluent<?> fluent){
            this(fluent, true);
    }
    public TCPSocketActionBuilder(TCPSocketActionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TCPSocketAction(), validationEnabled);
    }
    public TCPSocketActionBuilder(TCPSocketActionFluent<?> fluent,TCPSocketAction instance){
            this(fluent, instance, true);
    }
    public TCPSocketActionBuilder(TCPSocketActionFluent<?> fluent,TCPSocketAction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHost(instance.getHost()); 
            fluent.withPort(instance.getPort()); 
            this.validationEnabled = validationEnabled; 
    }
    public TCPSocketActionBuilder(TCPSocketAction instance){
            this(instance,true);
    }
    public TCPSocketActionBuilder(TCPSocketAction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHost(instance.getHost()); 
            this.withPort(instance.getPort()); 
            this.validationEnabled = validationEnabled; 
    }
    public TCPSocketActionBuilder(Validator validator){
            this(new TCPSocketAction(), true);
    }
    public TCPSocketActionBuilder(TCPSocketActionFluent<?> fluent,TCPSocketAction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHost(instance.getHost()); 
            fluent.withPort(instance.getPort()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TCPSocketActionBuilder(TCPSocketAction instance,Validator validator){
            this.fluent = this; 
            this.withHost(instance.getHost()); 
            this.withPort(instance.getPort()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TCPSocketAction build(){
            TCPSocketAction buildable = new TCPSocketAction(fluent.getHost(),fluent.getPort());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TCPSocketActionBuilder that = (TCPSocketActionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
