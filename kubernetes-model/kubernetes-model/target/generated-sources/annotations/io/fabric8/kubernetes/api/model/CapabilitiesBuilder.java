package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CapabilitiesBuilder extends CapabilitiesFluentImpl<CapabilitiesBuilder> implements VisitableBuilder<Capabilities,CapabilitiesBuilder>{

    CapabilitiesFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CapabilitiesBuilder(){
            this(true);
    }
    public CapabilitiesBuilder(Boolean validationEnabled){
            this(new Capabilities(), validationEnabled);
    }
    public CapabilitiesBuilder(CapabilitiesFluent<?> fluent){
            this(fluent, true);
    }
    public CapabilitiesBuilder(CapabilitiesFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Capabilities(), validationEnabled);
    }
    public CapabilitiesBuilder(CapabilitiesFluent<?> fluent,Capabilities instance){
            this(fluent, instance, true);
    }
    public CapabilitiesBuilder(CapabilitiesFluent<?> fluent,Capabilities instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAdd(instance.getAdd()); 
            fluent.withDrop(instance.getDrop()); 
            this.validationEnabled = validationEnabled; 
    }
    public CapabilitiesBuilder(Capabilities instance){
            this(instance,true);
    }
    public CapabilitiesBuilder(Capabilities instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAdd(instance.getAdd()); 
            this.withDrop(instance.getDrop()); 
            this.validationEnabled = validationEnabled; 
    }
    public CapabilitiesBuilder(Validator validator){
            this(new Capabilities(), true);
    }
    public CapabilitiesBuilder(CapabilitiesFluent<?> fluent,Capabilities instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAdd(instance.getAdd()); 
            fluent.withDrop(instance.getDrop()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CapabilitiesBuilder(Capabilities instance,Validator validator){
            this.fluent = this; 
            this.withAdd(instance.getAdd()); 
            this.withDrop(instance.getDrop()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Capabilities build(){
            Capabilities buildable = new Capabilities(fluent.getAdd(),fluent.getDrop());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CapabilitiesBuilder that = (CapabilitiesBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
