package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SysctlBuilder extends SysctlFluentImpl<SysctlBuilder> implements VisitableBuilder<Sysctl,SysctlBuilder>{

    SysctlFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SysctlBuilder(){
            this(true);
    }
    public SysctlBuilder(Boolean validationEnabled){
            this(new Sysctl(), validationEnabled);
    }
    public SysctlBuilder(SysctlFluent<?> fluent){
            this(fluent, true);
    }
    public SysctlBuilder(SysctlFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Sysctl(), validationEnabled);
    }
    public SysctlBuilder(SysctlFluent<?> fluent,Sysctl instance){
            this(fluent, instance, true);
    }
    public SysctlBuilder(SysctlFluent<?> fluent,Sysctl instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public SysctlBuilder(Sysctl instance){
            this(instance,true);
    }
    public SysctlBuilder(Sysctl instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public SysctlBuilder(Validator validator){
            this(new Sysctl(), true);
    }
    public SysctlBuilder(SysctlFluent<?> fluent,Sysctl instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SysctlBuilder(Sysctl instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Sysctl build(){
            Sysctl buildable = new Sysctl(fluent.getName(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SysctlBuilder that = (SysctlBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
