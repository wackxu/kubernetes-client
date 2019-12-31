package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildPostCommitSpecBuilder extends BuildPostCommitSpecFluentImpl<BuildPostCommitSpecBuilder> implements VisitableBuilder<BuildPostCommitSpec,BuildPostCommitSpecBuilder>{

    BuildPostCommitSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildPostCommitSpecBuilder(){
            this(true);
    }
    public BuildPostCommitSpecBuilder(Boolean validationEnabled){
            this(new BuildPostCommitSpec(), validationEnabled);
    }
    public BuildPostCommitSpecBuilder(BuildPostCommitSpecFluent<?> fluent){
            this(fluent, true);
    }
    public BuildPostCommitSpecBuilder(BuildPostCommitSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildPostCommitSpec(), validationEnabled);
    }
    public BuildPostCommitSpecBuilder(BuildPostCommitSpecFluent<?> fluent,BuildPostCommitSpec instance){
            this(fluent, instance, true);
    }
    public BuildPostCommitSpecBuilder(BuildPostCommitSpecFluent<?> fluent,BuildPostCommitSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withArgs(instance.getArgs()); 
            fluent.withCommand(instance.getCommand()); 
            fluent.withScript(instance.getScript()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildPostCommitSpecBuilder(BuildPostCommitSpec instance){
            this(instance,true);
    }
    public BuildPostCommitSpecBuilder(BuildPostCommitSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withArgs(instance.getArgs()); 
            this.withCommand(instance.getCommand()); 
            this.withScript(instance.getScript()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildPostCommitSpecBuilder(Validator validator){
            this(new BuildPostCommitSpec(), true);
    }
    public BuildPostCommitSpecBuilder(BuildPostCommitSpecFluent<?> fluent,BuildPostCommitSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withArgs(instance.getArgs()); 
            fluent.withCommand(instance.getCommand()); 
            fluent.withScript(instance.getScript()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildPostCommitSpecBuilder(BuildPostCommitSpec instance,Validator validator){
            this.fluent = this; 
            this.withArgs(instance.getArgs()); 
            this.withCommand(instance.getCommand()); 
            this.withScript(instance.getScript()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildPostCommitSpec build(){
            BuildPostCommitSpec buildable = new BuildPostCommitSpec(fluent.getArgs(),fluent.getCommand(),fluent.getScript());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildPostCommitSpecBuilder that = (BuildPostCommitSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
