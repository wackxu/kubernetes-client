package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LimitRangeBuilder extends LimitRangeFluentImpl<LimitRangeBuilder> implements VisitableBuilder<LimitRange,LimitRangeBuilder>{

    LimitRangeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LimitRangeBuilder(){
            this(true);
    }
    public LimitRangeBuilder(Boolean validationEnabled){
            this(new LimitRange(), validationEnabled);
    }
    public LimitRangeBuilder(LimitRangeFluent<?> fluent){
            this(fluent, true);
    }
    public LimitRangeBuilder(LimitRangeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LimitRange(), validationEnabled);
    }
    public LimitRangeBuilder(LimitRangeFluent<?> fluent,LimitRange instance){
            this(fluent, instance, true);
    }
    public LimitRangeBuilder(LimitRangeFluent<?> fluent,LimitRange instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public LimitRangeBuilder(LimitRange instance){
            this(instance,true);
    }
    public LimitRangeBuilder(LimitRange instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public LimitRangeBuilder(Validator validator){
            this(new LimitRange(), true);
    }
    public LimitRangeBuilder(LimitRangeFluent<?> fluent,LimitRange instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LimitRangeBuilder(LimitRange instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LimitRange build(){
            LimitRange buildable = new LimitRange(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LimitRangeBuilder that = (LimitRangeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
