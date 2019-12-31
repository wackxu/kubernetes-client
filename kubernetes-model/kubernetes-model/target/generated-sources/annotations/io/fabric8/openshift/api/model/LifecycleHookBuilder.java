package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LifecycleHookBuilder extends LifecycleHookFluentImpl<LifecycleHookBuilder> implements VisitableBuilder<LifecycleHook,LifecycleHookBuilder>{

    LifecycleHookFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LifecycleHookBuilder(){
            this(true);
    }
    public LifecycleHookBuilder(Boolean validationEnabled){
            this(new LifecycleHook(), validationEnabled);
    }
    public LifecycleHookBuilder(LifecycleHookFluent<?> fluent){
            this(fluent, true);
    }
    public LifecycleHookBuilder(LifecycleHookFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LifecycleHook(), validationEnabled);
    }
    public LifecycleHookBuilder(LifecycleHookFluent<?> fluent,LifecycleHook instance){
            this(fluent, instance, true);
    }
    public LifecycleHookBuilder(LifecycleHookFluent<?> fluent,LifecycleHook instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExecNewPod(instance.getExecNewPod()); 
            fluent.withFailurePolicy(instance.getFailurePolicy()); 
            fluent.withTagImages(instance.getTagImages()); 
            this.validationEnabled = validationEnabled; 
    }
    public LifecycleHookBuilder(LifecycleHook instance){
            this(instance,true);
    }
    public LifecycleHookBuilder(LifecycleHook instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExecNewPod(instance.getExecNewPod()); 
            this.withFailurePolicy(instance.getFailurePolicy()); 
            this.withTagImages(instance.getTagImages()); 
            this.validationEnabled = validationEnabled; 
    }
    public LifecycleHookBuilder(Validator validator){
            this(new LifecycleHook(), true);
    }
    public LifecycleHookBuilder(LifecycleHookFluent<?> fluent,LifecycleHook instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExecNewPod(instance.getExecNewPod()); 
            fluent.withFailurePolicy(instance.getFailurePolicy()); 
            fluent.withTagImages(instance.getTagImages()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LifecycleHookBuilder(LifecycleHook instance,Validator validator){
            this.fluent = this; 
            this.withExecNewPod(instance.getExecNewPod()); 
            this.withFailurePolicy(instance.getFailurePolicy()); 
            this.withTagImages(instance.getTagImages()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LifecycleHook build(){
            LifecycleHook buildable = new LifecycleHook(fluent.getExecNewPod(),fluent.getFailurePolicy(),fluent.getTagImages());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LifecycleHookBuilder that = (LifecycleHookBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
