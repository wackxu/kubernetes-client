package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LimitRangeSpecBuilder extends LimitRangeSpecFluentImpl<LimitRangeSpecBuilder> implements VisitableBuilder<LimitRangeSpec,LimitRangeSpecBuilder>{

    LimitRangeSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LimitRangeSpecBuilder(){
            this(true);
    }
    public LimitRangeSpecBuilder(Boolean validationEnabled){
            this(new LimitRangeSpec(), validationEnabled);
    }
    public LimitRangeSpecBuilder(LimitRangeSpecFluent<?> fluent){
            this(fluent, true);
    }
    public LimitRangeSpecBuilder(LimitRangeSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LimitRangeSpec(), validationEnabled);
    }
    public LimitRangeSpecBuilder(LimitRangeSpecFluent<?> fluent,LimitRangeSpec instance){
            this(fluent, instance, true);
    }
    public LimitRangeSpecBuilder(LimitRangeSpecFluent<?> fluent,LimitRangeSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLimits(instance.getLimits()); 
            this.validationEnabled = validationEnabled; 
    }
    public LimitRangeSpecBuilder(LimitRangeSpec instance){
            this(instance,true);
    }
    public LimitRangeSpecBuilder(LimitRangeSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLimits(instance.getLimits()); 
            this.validationEnabled = validationEnabled; 
    }
    public LimitRangeSpecBuilder(Validator validator){
            this(new LimitRangeSpec(), true);
    }
    public LimitRangeSpecBuilder(LimitRangeSpecFluent<?> fluent,LimitRangeSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLimits(instance.getLimits()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LimitRangeSpecBuilder(LimitRangeSpec instance,Validator validator){
            this.fluent = this; 
            this.withLimits(instance.getLimits()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LimitRangeSpec build(){
            LimitRangeSpec buildable = new LimitRangeSpec(fluent.getLimits());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LimitRangeSpecBuilder that = (LimitRangeSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
