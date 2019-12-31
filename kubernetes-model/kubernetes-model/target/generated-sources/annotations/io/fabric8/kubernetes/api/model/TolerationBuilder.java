package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TolerationBuilder extends TolerationFluentImpl<TolerationBuilder> implements VisitableBuilder<Toleration,TolerationBuilder>{

    TolerationFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TolerationBuilder(){
            this(true);
    }
    public TolerationBuilder(Boolean validationEnabled){
            this(new Toleration(), validationEnabled);
    }
    public TolerationBuilder(TolerationFluent<?> fluent){
            this(fluent, true);
    }
    public TolerationBuilder(TolerationFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Toleration(), validationEnabled);
    }
    public TolerationBuilder(TolerationFluent<?> fluent,Toleration instance){
            this(fluent, instance, true);
    }
    public TolerationBuilder(TolerationFluent<?> fluent,Toleration instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEffect(instance.getEffect()); 
            fluent.withKey(instance.getKey()); 
            fluent.withOperator(instance.getOperator()); 
            fluent.withTolerationSeconds(instance.getTolerationSeconds()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public TolerationBuilder(Toleration instance){
            this(instance,true);
    }
    public TolerationBuilder(Toleration instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEffect(instance.getEffect()); 
            this.withKey(instance.getKey()); 
            this.withOperator(instance.getOperator()); 
            this.withTolerationSeconds(instance.getTolerationSeconds()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public TolerationBuilder(Validator validator){
            this(new Toleration(), true);
    }
    public TolerationBuilder(TolerationFluent<?> fluent,Toleration instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEffect(instance.getEffect()); 
            fluent.withKey(instance.getKey()); 
            fluent.withOperator(instance.getOperator()); 
            fluent.withTolerationSeconds(instance.getTolerationSeconds()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TolerationBuilder(Toleration instance,Validator validator){
            this.fluent = this; 
            this.withEffect(instance.getEffect()); 
            this.withKey(instance.getKey()); 
            this.withOperator(instance.getOperator()); 
            this.withTolerationSeconds(instance.getTolerationSeconds()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Toleration build(){
            Toleration buildable = new Toleration(fluent.getEffect(),fluent.getKey(),fluent.getOperator(),fluent.getTolerationSeconds(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TolerationBuilder that = (TolerationBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
