package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamedContextBuilder extends NamedContextFluentImpl<NamedContextBuilder> implements VisitableBuilder<NamedContext,NamedContextBuilder>{

    NamedContextFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamedContextBuilder(){
            this(true);
    }
    public NamedContextBuilder(Boolean validationEnabled){
            this(new NamedContext(), validationEnabled);
    }
    public NamedContextBuilder(NamedContextFluent<?> fluent){
            this(fluent, true);
    }
    public NamedContextBuilder(NamedContextFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NamedContext(), validationEnabled);
    }
    public NamedContextBuilder(NamedContextFluent<?> fluent,NamedContext instance){
            this(fluent, instance, true);
    }
    public NamedContextBuilder(NamedContextFluent<?> fluent,NamedContext instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withContext(instance.getContext()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedContextBuilder(NamedContext instance){
            this(instance,true);
    }
    public NamedContextBuilder(NamedContext instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withContext(instance.getContext()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedContextBuilder(Validator validator){
            this(new NamedContext(), true);
    }
    public NamedContextBuilder(NamedContextFluent<?> fluent,NamedContext instance,Validator validator){
            this.fluent = fluent; 
            fluent.withContext(instance.getContext()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamedContextBuilder(NamedContext instance,Validator validator){
            this.fluent = this; 
            this.withContext(instance.getContext()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NamedContext build(){
            NamedContext buildable = new NamedContext(fluent.getContext(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedContextBuilder that = (NamedContextBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
