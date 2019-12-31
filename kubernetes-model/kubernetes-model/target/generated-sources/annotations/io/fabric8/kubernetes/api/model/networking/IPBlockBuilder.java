package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IPBlockBuilder extends IPBlockFluentImpl<IPBlockBuilder> implements VisitableBuilder<IPBlock,IPBlockBuilder>{

    IPBlockFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IPBlockBuilder(){
            this(true);
    }
    public IPBlockBuilder(Boolean validationEnabled){
            this(new IPBlock(), validationEnabled);
    }
    public IPBlockBuilder(IPBlockFluent<?> fluent){
            this(fluent, true);
    }
    public IPBlockBuilder(IPBlockFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IPBlock(), validationEnabled);
    }
    public IPBlockBuilder(IPBlockFluent<?> fluent,IPBlock instance){
            this(fluent, instance, true);
    }
    public IPBlockBuilder(IPBlockFluent<?> fluent,IPBlock instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCidr(instance.getCidr()); 
            fluent.withExcept(instance.getExcept()); 
            this.validationEnabled = validationEnabled; 
    }
    public IPBlockBuilder(IPBlock instance){
            this(instance,true);
    }
    public IPBlockBuilder(IPBlock instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCidr(instance.getCidr()); 
            this.withExcept(instance.getExcept()); 
            this.validationEnabled = validationEnabled; 
    }
    public IPBlockBuilder(Validator validator){
            this(new IPBlock(), true);
    }
    public IPBlockBuilder(IPBlockFluent<?> fluent,IPBlock instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCidr(instance.getCidr()); 
            fluent.withExcept(instance.getExcept()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IPBlockBuilder(IPBlock instance,Validator validator){
            this.fluent = this; 
            this.withCidr(instance.getCidr()); 
            this.withExcept(instance.getExcept()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IPBlock build(){
            IPBlock buildable = new IPBlock(fluent.getCidr(),fluent.getExcept());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IPBlockBuilder that = (IPBlockBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
