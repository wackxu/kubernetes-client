package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class MicroTimeBuilder extends MicroTimeFluentImpl<MicroTimeBuilder> implements VisitableBuilder<MicroTime,MicroTimeBuilder>{

    MicroTimeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public MicroTimeBuilder(){
            this(true);
    }
    public MicroTimeBuilder(Boolean validationEnabled){
            this(new MicroTime(), validationEnabled);
    }
    public MicroTimeBuilder(MicroTimeFluent<?> fluent){
            this(fluent, true);
    }
    public MicroTimeBuilder(MicroTimeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new MicroTime(), validationEnabled);
    }
    public MicroTimeBuilder(MicroTimeFluent<?> fluent,MicroTime instance){
            this(fluent, instance, true);
    }
    public MicroTimeBuilder(MicroTimeFluent<?> fluent,MicroTime instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withTime(instance.getTime()); 
            this.validationEnabled = validationEnabled; 
    }
    public MicroTimeBuilder(MicroTime instance){
            this(instance,true);
    }
    public MicroTimeBuilder(MicroTime instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withTime(instance.getTime()); 
            this.validationEnabled = validationEnabled; 
    }
    public MicroTimeBuilder(Validator validator){
            this(new MicroTime(), true);
    }
    public MicroTimeBuilder(MicroTimeFluent<?> fluent,MicroTime instance,Validator validator){
            this.fluent = fluent; 
            fluent.withTime(instance.getTime()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public MicroTimeBuilder(MicroTime instance,Validator validator){
            this.fluent = this; 
            this.withTime(instance.getTime()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public MicroTime build(){
            MicroTime buildable = new MicroTime(fluent.getTime());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MicroTimeBuilder that = (MicroTimeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
