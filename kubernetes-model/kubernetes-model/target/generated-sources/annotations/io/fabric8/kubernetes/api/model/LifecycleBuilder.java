package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LifecycleBuilder extends LifecycleFluentImpl<LifecycleBuilder> implements VisitableBuilder<Lifecycle,LifecycleBuilder>{

    LifecycleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LifecycleBuilder(){
            this(true);
    }
    public LifecycleBuilder(Boolean validationEnabled){
            this(new Lifecycle(), validationEnabled);
    }
    public LifecycleBuilder(LifecycleFluent<?> fluent){
            this(fluent, true);
    }
    public LifecycleBuilder(LifecycleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Lifecycle(), validationEnabled);
    }
    public LifecycleBuilder(LifecycleFluent<?> fluent,Lifecycle instance){
            this(fluent, instance, true);
    }
    public LifecycleBuilder(LifecycleFluent<?> fluent,Lifecycle instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPostStart(instance.getPostStart()); 
            fluent.withPreStop(instance.getPreStop()); 
            this.validationEnabled = validationEnabled; 
    }
    public LifecycleBuilder(Lifecycle instance){
            this(instance,true);
    }
    public LifecycleBuilder(Lifecycle instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPostStart(instance.getPostStart()); 
            this.withPreStop(instance.getPreStop()); 
            this.validationEnabled = validationEnabled; 
    }
    public LifecycleBuilder(Validator validator){
            this(new Lifecycle(), true);
    }
    public LifecycleBuilder(LifecycleFluent<?> fluent,Lifecycle instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPostStart(instance.getPostStart()); 
            fluent.withPreStop(instance.getPreStop()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LifecycleBuilder(Lifecycle instance,Validator validator){
            this.fluent = this; 
            this.withPostStart(instance.getPostStart()); 
            this.withPreStop(instance.getPreStop()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Lifecycle build(){
            Lifecycle buildable = new Lifecycle(fluent.getPostStart(),fluent.getPreStop());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LifecycleBuilder that = (LifecycleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
