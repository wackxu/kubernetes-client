package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildConfigStatusBuilder extends BuildConfigStatusFluentImpl<BuildConfigStatusBuilder> implements VisitableBuilder<BuildConfigStatus,BuildConfigStatusBuilder>{

    BuildConfigStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildConfigStatusBuilder(){
            this(true);
    }
    public BuildConfigStatusBuilder(Boolean validationEnabled){
            this(new BuildConfigStatus(), validationEnabled);
    }
    public BuildConfigStatusBuilder(BuildConfigStatusFluent<?> fluent){
            this(fluent, true);
    }
    public BuildConfigStatusBuilder(BuildConfigStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildConfigStatus(), validationEnabled);
    }
    public BuildConfigStatusBuilder(BuildConfigStatusFluent<?> fluent,BuildConfigStatus instance){
            this(fluent, instance, true);
    }
    public BuildConfigStatusBuilder(BuildConfigStatusFluent<?> fluent,BuildConfigStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastVersion(instance.getLastVersion()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildConfigStatusBuilder(BuildConfigStatus instance){
            this(instance,true);
    }
    public BuildConfigStatusBuilder(BuildConfigStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastVersion(instance.getLastVersion()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildConfigStatusBuilder(Validator validator){
            this(new BuildConfigStatus(), true);
    }
    public BuildConfigStatusBuilder(BuildConfigStatusFluent<?> fluent,BuildConfigStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastVersion(instance.getLastVersion()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildConfigStatusBuilder(BuildConfigStatus instance,Validator validator){
            this.fluent = this; 
            this.withLastVersion(instance.getLastVersion()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildConfigStatus build(){
            BuildConfigStatus buildable = new BuildConfigStatus(fluent.getLastVersion());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildConfigStatusBuilder that = (BuildConfigStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
