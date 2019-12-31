package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PreconditionsBuilder extends PreconditionsFluentImpl<PreconditionsBuilder> implements VisitableBuilder<Preconditions,PreconditionsBuilder>{

    PreconditionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PreconditionsBuilder(){
            this(true);
    }
    public PreconditionsBuilder(Boolean validationEnabled){
            this(new Preconditions(), validationEnabled);
    }
    public PreconditionsBuilder(PreconditionsFluent<?> fluent){
            this(fluent, true);
    }
    public PreconditionsBuilder(PreconditionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Preconditions(), validationEnabled);
    }
    public PreconditionsBuilder(PreconditionsFluent<?> fluent,Preconditions instance){
            this(fluent, instance, true);
    }
    public PreconditionsBuilder(PreconditionsFluent<?> fluent,Preconditions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public PreconditionsBuilder(Preconditions instance){
            this(instance,true);
    }
    public PreconditionsBuilder(Preconditions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public PreconditionsBuilder(Validator validator){
            this(new Preconditions(), true);
    }
    public PreconditionsBuilder(PreconditionsFluent<?> fluent,Preconditions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withUid(instance.getUid()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PreconditionsBuilder(Preconditions instance,Validator validator){
            this.fluent = this; 
            this.withUid(instance.getUid()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Preconditions build(){
            Preconditions buildable = new Preconditions(fluent.getUid());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PreconditionsBuilder that = (PreconditionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
