package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildStatusOutputBuilder extends BuildStatusOutputFluentImpl<BuildStatusOutputBuilder> implements VisitableBuilder<BuildStatusOutput,BuildStatusOutputBuilder>{

    BuildStatusOutputFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildStatusOutputBuilder(){
            this(true);
    }
    public BuildStatusOutputBuilder(Boolean validationEnabled){
            this(new BuildStatusOutput(), validationEnabled);
    }
    public BuildStatusOutputBuilder(BuildStatusOutputFluent<?> fluent){
            this(fluent, true);
    }
    public BuildStatusOutputBuilder(BuildStatusOutputFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildStatusOutput(), validationEnabled);
    }
    public BuildStatusOutputBuilder(BuildStatusOutputFluent<?> fluent,BuildStatusOutput instance){
            this(fluent, instance, true);
    }
    public BuildStatusOutputBuilder(BuildStatusOutputFluent<?> fluent,BuildStatusOutput instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildStatusOutputBuilder(BuildStatusOutput instance){
            this(instance,true);
    }
    public BuildStatusOutputBuilder(BuildStatusOutput instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildStatusOutputBuilder(Validator validator){
            this(new BuildStatusOutput(), true);
    }
    public BuildStatusOutputBuilder(BuildStatusOutputFluent<?> fluent,BuildStatusOutput instance,Validator validator){
            this.fluent = fluent; 
            fluent.withTo(instance.getTo()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildStatusOutputBuilder(BuildStatusOutput instance,Validator validator){
            this.fluent = this; 
            this.withTo(instance.getTo()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildStatusOutput build(){
            BuildStatusOutput buildable = new BuildStatusOutput(fluent.getTo());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildStatusOutputBuilder that = (BuildStatusOutputBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
