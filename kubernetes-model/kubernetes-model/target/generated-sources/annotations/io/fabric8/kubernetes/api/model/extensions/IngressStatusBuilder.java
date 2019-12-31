package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IngressStatusBuilder extends IngressStatusFluentImpl<IngressStatusBuilder> implements VisitableBuilder<IngressStatus,IngressStatusBuilder>{

    IngressStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IngressStatusBuilder(){
            this(true);
    }
    public IngressStatusBuilder(Boolean validationEnabled){
            this(new IngressStatus(), validationEnabled);
    }
    public IngressStatusBuilder(IngressStatusFluent<?> fluent){
            this(fluent, true);
    }
    public IngressStatusBuilder(IngressStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IngressStatus(), validationEnabled);
    }
    public IngressStatusBuilder(IngressStatusFluent<?> fluent,IngressStatus instance){
            this(fluent, instance, true);
    }
    public IngressStatusBuilder(IngressStatusFluent<?> fluent,IngressStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLoadBalancer(instance.getLoadBalancer()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressStatusBuilder(IngressStatus instance){
            this(instance,true);
    }
    public IngressStatusBuilder(IngressStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLoadBalancer(instance.getLoadBalancer()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressStatusBuilder(Validator validator){
            this(new IngressStatus(), true);
    }
    public IngressStatusBuilder(IngressStatusFluent<?> fluent,IngressStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLoadBalancer(instance.getLoadBalancer()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IngressStatusBuilder(IngressStatus instance,Validator validator){
            this.fluent = this; 
            this.withLoadBalancer(instance.getLoadBalancer()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IngressStatus build(){
            IngressStatus buildable = new IngressStatus(fluent.getLoadBalancer());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressStatusBuilder that = (IngressStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
