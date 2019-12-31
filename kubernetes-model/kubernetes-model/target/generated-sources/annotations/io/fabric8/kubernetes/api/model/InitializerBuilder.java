package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class InitializerBuilder extends InitializerFluentImpl<InitializerBuilder> implements VisitableBuilder<Initializer,InitializerBuilder>{

    InitializerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public InitializerBuilder(){
            this(true);
    }
    public InitializerBuilder(Boolean validationEnabled){
            this(new Initializer(), validationEnabled);
    }
    public InitializerBuilder(InitializerFluent<?> fluent){
            this(fluent, true);
    }
    public InitializerBuilder(InitializerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Initializer(), validationEnabled);
    }
    public InitializerBuilder(InitializerFluent<?> fluent,Initializer instance){
            this(fluent, instance, true);
    }
    public InitializerBuilder(InitializerFluent<?> fluent,Initializer instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public InitializerBuilder(Initializer instance){
            this(instance,true);
    }
    public InitializerBuilder(Initializer instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public InitializerBuilder(Validator validator){
            this(new Initializer(), true);
    }
    public InitializerBuilder(InitializerFluent<?> fluent,Initializer instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public InitializerBuilder(Initializer instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Initializer build(){
            Initializer buildable = new Initializer(fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            InitializerBuilder that = (InitializerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
