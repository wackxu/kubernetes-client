package io.fabric8.kubernetes.api.model.runtime;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RawExtensionBuilder extends RawExtensionFluentImpl<RawExtensionBuilder> implements VisitableBuilder<RawExtension,RawExtensionBuilder>{

    RawExtensionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RawExtensionBuilder(){
            this(true);
    }
    public RawExtensionBuilder(Boolean validationEnabled){
            this(new RawExtension(), validationEnabled);
    }
    public RawExtensionBuilder(RawExtensionFluent<?> fluent){
            this(fluent, true);
    }
    public RawExtensionBuilder(RawExtensionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RawExtension(), validationEnabled);
    }
    public RawExtensionBuilder(RawExtensionFluent<?> fluent,RawExtension instance){
            this(fluent, instance, true);
    }
    public RawExtensionBuilder(RawExtensionFluent<?> fluent,RawExtension instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRaw(instance.getRaw()); 
            this.validationEnabled = validationEnabled; 
    }
    public RawExtensionBuilder(RawExtension instance){
            this(instance,true);
    }
    public RawExtensionBuilder(RawExtension instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRaw(instance.getRaw()); 
            this.validationEnabled = validationEnabled; 
    }
    public RawExtensionBuilder(Validator validator){
            this(new RawExtension(), true);
    }
    public RawExtensionBuilder(RawExtensionFluent<?> fluent,RawExtension instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRaw(instance.getRaw()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RawExtensionBuilder(RawExtension instance,Validator validator){
            this.fluent = this; 
            this.withRaw(instance.getRaw()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RawExtension build(){
            RawExtension buildable = new RawExtension(fluent.getRaw());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RawExtensionBuilder that = (RawExtensionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
