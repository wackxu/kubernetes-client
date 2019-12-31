package io.fabric8.kubernetes.api.model.scheduling;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PriorityClassBuilder extends PriorityClassFluentImpl<PriorityClassBuilder> implements VisitableBuilder<PriorityClass,PriorityClassBuilder>{

    PriorityClassFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PriorityClassBuilder(){
            this(true);
    }
    public PriorityClassBuilder(Boolean validationEnabled){
            this(new PriorityClass(), validationEnabled);
    }
    public PriorityClassBuilder(PriorityClassFluent<?> fluent){
            this(fluent, true);
    }
    public PriorityClassBuilder(PriorityClassFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PriorityClass(), validationEnabled);
    }
    public PriorityClassBuilder(PriorityClassFluent<?> fluent,PriorityClass instance){
            this(fluent, instance, true);
    }
    public PriorityClassBuilder(PriorityClassFluent<?> fluent,PriorityClass instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDescription(instance.getDescription()); 
            fluent.withGlobalDefault(instance.getGlobalDefault()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public PriorityClassBuilder(PriorityClass instance){
            this(instance,true);
    }
    public PriorityClassBuilder(PriorityClass instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDescription(instance.getDescription()); 
            this.withGlobalDefault(instance.getGlobalDefault()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public PriorityClassBuilder(Validator validator){
            this(new PriorityClass(), true);
    }
    public PriorityClassBuilder(PriorityClassFluent<?> fluent,PriorityClass instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDescription(instance.getDescription()); 
            fluent.withGlobalDefault(instance.getGlobalDefault()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PriorityClassBuilder(PriorityClass instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDescription(instance.getDescription()); 
            this.withGlobalDefault(instance.getGlobalDefault()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PriorityClass build(){
            PriorityClass buildable = new PriorityClass(fluent.getApiVersion(),fluent.getDescription(),fluent.isGlobalDefault(),fluent.getKind(),fluent.getMetadata(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PriorityClassBuilder that = (PriorityClassBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
