package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TaintBuilder extends TaintFluentImpl<TaintBuilder> implements VisitableBuilder<Taint,TaintBuilder>{

    TaintFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TaintBuilder(){
            this(true);
    }
    public TaintBuilder(Boolean validationEnabled){
            this(new Taint(), validationEnabled);
    }
    public TaintBuilder(TaintFluent<?> fluent){
            this(fluent, true);
    }
    public TaintBuilder(TaintFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Taint(), validationEnabled);
    }
    public TaintBuilder(TaintFluent<?> fluent,Taint instance){
            this(fluent, instance, true);
    }
    public TaintBuilder(TaintFluent<?> fluent,Taint instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEffect(instance.getEffect()); 
            fluent.withKey(instance.getKey()); 
            fluent.withTimeAdded(instance.getTimeAdded()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public TaintBuilder(Taint instance){
            this(instance,true);
    }
    public TaintBuilder(Taint instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEffect(instance.getEffect()); 
            this.withKey(instance.getKey()); 
            this.withTimeAdded(instance.getTimeAdded()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public TaintBuilder(Validator validator){
            this(new Taint(), true);
    }
    public TaintBuilder(TaintFluent<?> fluent,Taint instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEffect(instance.getEffect()); 
            fluent.withKey(instance.getKey()); 
            fluent.withTimeAdded(instance.getTimeAdded()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TaintBuilder(Taint instance,Validator validator){
            this.fluent = this; 
            this.withEffect(instance.getEffect()); 
            this.withKey(instance.getKey()); 
            this.withTimeAdded(instance.getTimeAdded()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Taint build(){
            Taint buildable = new Taint(fluent.getEffect(),fluent.getKey(),fluent.getTimeAdded(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TaintBuilder that = (TaintBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
