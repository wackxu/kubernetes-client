package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamedExtensionBuilder extends NamedExtensionFluentImpl<NamedExtensionBuilder> implements VisitableBuilder<NamedExtension,NamedExtensionBuilder>{

    NamedExtensionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamedExtensionBuilder(){
            this(true);
    }
    public NamedExtensionBuilder(Boolean validationEnabled){
            this(new NamedExtension(), validationEnabled);
    }
    public NamedExtensionBuilder(NamedExtensionFluent<?> fluent){
            this(fluent, true);
    }
    public NamedExtensionBuilder(NamedExtensionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NamedExtension(), validationEnabled);
    }
    public NamedExtensionBuilder(NamedExtensionFluent<?> fluent,NamedExtension instance){
            this(fluent, instance, true);
    }
    public NamedExtensionBuilder(NamedExtensionFluent<?> fluent,NamedExtension instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExtension(instance.getExtension()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedExtensionBuilder(NamedExtension instance){
            this(instance,true);
    }
    public NamedExtensionBuilder(NamedExtension instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExtension(instance.getExtension()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedExtensionBuilder(Validator validator){
            this(new NamedExtension(), true);
    }
    public NamedExtensionBuilder(NamedExtensionFluent<?> fluent,NamedExtension instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExtension(instance.getExtension()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamedExtensionBuilder(NamedExtension instance,Validator validator){
            this.fluent = this; 
            this.withExtension(instance.getExtension()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NamedExtension build(){
            NamedExtension buildable = new NamedExtension(fluent.getExtension(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedExtensionBuilder that = (NamedExtensionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
