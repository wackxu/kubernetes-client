package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BinaryBuildSourceBuilder extends BinaryBuildSourceFluentImpl<BinaryBuildSourceBuilder> implements VisitableBuilder<BinaryBuildSource,BinaryBuildSourceBuilder>{

    BinaryBuildSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BinaryBuildSourceBuilder(){
            this(true);
    }
    public BinaryBuildSourceBuilder(Boolean validationEnabled){
            this(new BinaryBuildSource(), validationEnabled);
    }
    public BinaryBuildSourceBuilder(BinaryBuildSourceFluent<?> fluent){
            this(fluent, true);
    }
    public BinaryBuildSourceBuilder(BinaryBuildSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BinaryBuildSource(), validationEnabled);
    }
    public BinaryBuildSourceBuilder(BinaryBuildSourceFluent<?> fluent,BinaryBuildSource instance){
            this(fluent, instance, true);
    }
    public BinaryBuildSourceBuilder(BinaryBuildSourceFluent<?> fluent,BinaryBuildSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAsFile(instance.getAsFile()); 
            this.validationEnabled = validationEnabled; 
    }
    public BinaryBuildSourceBuilder(BinaryBuildSource instance){
            this(instance,true);
    }
    public BinaryBuildSourceBuilder(BinaryBuildSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAsFile(instance.getAsFile()); 
            this.validationEnabled = validationEnabled; 
    }
    public BinaryBuildSourceBuilder(Validator validator){
            this(new BinaryBuildSource(), true);
    }
    public BinaryBuildSourceBuilder(BinaryBuildSourceFluent<?> fluent,BinaryBuildSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAsFile(instance.getAsFile()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BinaryBuildSourceBuilder(BinaryBuildSource instance,Validator validator){
            this.fluent = this; 
            this.withAsFile(instance.getAsFile()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BinaryBuildSource build(){
            BinaryBuildSource buildable = new BinaryBuildSource(fluent.getAsFile());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BinaryBuildSourceBuilder that = (BinaryBuildSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
