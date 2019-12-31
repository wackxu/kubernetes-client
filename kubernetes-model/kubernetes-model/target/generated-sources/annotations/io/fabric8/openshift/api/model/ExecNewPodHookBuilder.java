package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ExecNewPodHookBuilder extends ExecNewPodHookFluentImpl<ExecNewPodHookBuilder> implements VisitableBuilder<ExecNewPodHook,ExecNewPodHookBuilder>{

    ExecNewPodHookFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ExecNewPodHookBuilder(){
            this(true);
    }
    public ExecNewPodHookBuilder(Boolean validationEnabled){
            this(new ExecNewPodHook(), validationEnabled);
    }
    public ExecNewPodHookBuilder(ExecNewPodHookFluent<?> fluent){
            this(fluent, true);
    }
    public ExecNewPodHookBuilder(ExecNewPodHookFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ExecNewPodHook(), validationEnabled);
    }
    public ExecNewPodHookBuilder(ExecNewPodHookFluent<?> fluent,ExecNewPodHook instance){
            this(fluent, instance, true);
    }
    public ExecNewPodHookBuilder(ExecNewPodHookFluent<?> fluent,ExecNewPodHook instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCommand(instance.getCommand()); 
            fluent.withContainerName(instance.getContainerName()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExecNewPodHookBuilder(ExecNewPodHook instance){
            this(instance,true);
    }
    public ExecNewPodHookBuilder(ExecNewPodHook instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCommand(instance.getCommand()); 
            this.withContainerName(instance.getContainerName()); 
            this.withEnv(instance.getEnv()); 
            this.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExecNewPodHookBuilder(Validator validator){
            this(new ExecNewPodHook(), true);
    }
    public ExecNewPodHookBuilder(ExecNewPodHookFluent<?> fluent,ExecNewPodHook instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCommand(instance.getCommand()); 
            fluent.withContainerName(instance.getContainerName()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ExecNewPodHookBuilder(ExecNewPodHook instance,Validator validator){
            this.fluent = this; 
            this.withCommand(instance.getCommand()); 
            this.withContainerName(instance.getContainerName()); 
            this.withEnv(instance.getEnv()); 
            this.withVolumes(instance.getVolumes()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ExecNewPodHook build(){
            ExecNewPodHook buildable = new ExecNewPodHook(fluent.getCommand(),fluent.getContainerName(),fluent.getEnv(),fluent.getVolumes());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExecNewPodHookBuilder that = (ExecNewPodHookBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
