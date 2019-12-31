package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildStatusOutputToBuilder extends BuildStatusOutputToFluentImpl<BuildStatusOutputToBuilder> implements VisitableBuilder<BuildStatusOutputTo,BuildStatusOutputToBuilder>{

    BuildStatusOutputToFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildStatusOutputToBuilder(){
            this(true);
    }
    public BuildStatusOutputToBuilder(Boolean validationEnabled){
            this(new BuildStatusOutputTo(), validationEnabled);
    }
    public BuildStatusOutputToBuilder(BuildStatusOutputToFluent<?> fluent){
            this(fluent, true);
    }
    public BuildStatusOutputToBuilder(BuildStatusOutputToFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildStatusOutputTo(), validationEnabled);
    }
    public BuildStatusOutputToBuilder(BuildStatusOutputToFluent<?> fluent,BuildStatusOutputTo instance){
            this(fluent, instance, true);
    }
    public BuildStatusOutputToBuilder(BuildStatusOutputToFluent<?> fluent,BuildStatusOutputTo instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withImageDigest(instance.getImageDigest()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildStatusOutputToBuilder(BuildStatusOutputTo instance){
            this(instance,true);
    }
    public BuildStatusOutputToBuilder(BuildStatusOutputTo instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withImageDigest(instance.getImageDigest()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildStatusOutputToBuilder(Validator validator){
            this(new BuildStatusOutputTo(), true);
    }
    public BuildStatusOutputToBuilder(BuildStatusOutputToFluent<?> fluent,BuildStatusOutputTo instance,Validator validator){
            this.fluent = fluent; 
            fluent.withImageDigest(instance.getImageDigest()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildStatusOutputToBuilder(BuildStatusOutputTo instance,Validator validator){
            this.fluent = this; 
            this.withImageDigest(instance.getImageDigest()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildStatusOutputTo build(){
            BuildStatusOutputTo buildable = new BuildStatusOutputTo(fluent.getImageDigest());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildStatusOutputToBuilder that = (BuildStatusOutputToBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
