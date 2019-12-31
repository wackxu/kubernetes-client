package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildOutputBuilder extends BuildOutputFluentImpl<BuildOutputBuilder> implements VisitableBuilder<BuildOutput,BuildOutputBuilder>{

    BuildOutputFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildOutputBuilder(){
            this(true);
    }
    public BuildOutputBuilder(Boolean validationEnabled){
            this(new BuildOutput(), validationEnabled);
    }
    public BuildOutputBuilder(BuildOutputFluent<?> fluent){
            this(fluent, true);
    }
    public BuildOutputBuilder(BuildOutputFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildOutput(), validationEnabled);
    }
    public BuildOutputBuilder(BuildOutputFluent<?> fluent,BuildOutput instance){
            this(fluent, instance, true);
    }
    public BuildOutputBuilder(BuildOutputFluent<?> fluent,BuildOutput instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withImageLabels(instance.getImageLabels()); 
            fluent.withPushSecret(instance.getPushSecret()); 
            fluent.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildOutputBuilder(BuildOutput instance){
            this(instance,true);
    }
    public BuildOutputBuilder(BuildOutput instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withImageLabels(instance.getImageLabels()); 
            this.withPushSecret(instance.getPushSecret()); 
            this.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildOutputBuilder(Validator validator){
            this(new BuildOutput(), true);
    }
    public BuildOutputBuilder(BuildOutputFluent<?> fluent,BuildOutput instance,Validator validator){
            this.fluent = fluent; 
            fluent.withImageLabels(instance.getImageLabels()); 
            fluent.withPushSecret(instance.getPushSecret()); 
            fluent.withTo(instance.getTo()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildOutputBuilder(BuildOutput instance,Validator validator){
            this.fluent = this; 
            this.withImageLabels(instance.getImageLabels()); 
            this.withPushSecret(instance.getPushSecret()); 
            this.withTo(instance.getTo()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildOutput build(){
            BuildOutput buildable = new BuildOutput(fluent.getImageLabels(),fluent.getPushSecret(),fluent.getTo());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildOutputBuilder that = (BuildOutputBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
