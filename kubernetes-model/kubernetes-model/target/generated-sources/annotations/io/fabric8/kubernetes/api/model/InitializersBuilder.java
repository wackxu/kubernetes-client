package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class InitializersBuilder extends InitializersFluentImpl<InitializersBuilder> implements VisitableBuilder<Initializers,InitializersBuilder>{

    InitializersFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public InitializersBuilder(){
            this(true);
    }
    public InitializersBuilder(Boolean validationEnabled){
            this(new Initializers(), validationEnabled);
    }
    public InitializersBuilder(InitializersFluent<?> fluent){
            this(fluent, true);
    }
    public InitializersBuilder(InitializersFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Initializers(), validationEnabled);
    }
    public InitializersBuilder(InitializersFluent<?> fluent,Initializers instance){
            this(fluent, instance, true);
    }
    public InitializersBuilder(InitializersFluent<?> fluent,Initializers instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPending(instance.getPending()); 
            fluent.withResult(instance.getResult()); 
            this.validationEnabled = validationEnabled; 
    }
    public InitializersBuilder(Initializers instance){
            this(instance,true);
    }
    public InitializersBuilder(Initializers instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPending(instance.getPending()); 
            this.withResult(instance.getResult()); 
            this.validationEnabled = validationEnabled; 
    }
    public InitializersBuilder(Validator validator){
            this(new Initializers(), true);
    }
    public InitializersBuilder(InitializersFluent<?> fluent,Initializers instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPending(instance.getPending()); 
            fluent.withResult(instance.getResult()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public InitializersBuilder(Initializers instance,Validator validator){
            this.fluent = this; 
            this.withPending(instance.getPending()); 
            this.withResult(instance.getResult()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Initializers build(){
            Initializers buildable = new Initializers(fluent.getPending(),fluent.getResult());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            InitializersBuilder that = (InitializersBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
