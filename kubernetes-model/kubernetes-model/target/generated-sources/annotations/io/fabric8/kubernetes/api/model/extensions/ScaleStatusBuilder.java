package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ScaleStatusBuilder extends ScaleStatusFluentImpl<ScaleStatusBuilder> implements VisitableBuilder<ScaleStatus,ScaleStatusBuilder>{

    ScaleStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ScaleStatusBuilder(){
            this(true);
    }
    public ScaleStatusBuilder(Boolean validationEnabled){
            this(new ScaleStatus(), validationEnabled);
    }
    public ScaleStatusBuilder(ScaleStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ScaleStatusBuilder(ScaleStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ScaleStatus(), validationEnabled);
    }
    public ScaleStatusBuilder(ScaleStatusFluent<?> fluent,ScaleStatus instance){
            this(fluent, instance, true);
    }
    public ScaleStatusBuilder(ScaleStatusFluent<?> fluent,ScaleStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTargetSelector(instance.getTargetSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScaleStatusBuilder(ScaleStatus instance){
            this(instance,true);
    }
    public ScaleStatusBuilder(ScaleStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTargetSelector(instance.getTargetSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScaleStatusBuilder(Validator validator){
            this(new ScaleStatus(), true);
    }
    public ScaleStatusBuilder(ScaleStatusFluent<?> fluent,ScaleStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTargetSelector(instance.getTargetSelector()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ScaleStatusBuilder(ScaleStatus instance,Validator validator){
            this.fluent = this; 
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTargetSelector(instance.getTargetSelector()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ScaleStatus build(){
            ScaleStatus buildable = new ScaleStatus(fluent.getReplicas(),fluent.getSelector(),fluent.getTargetSelector());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScaleStatusBuilder that = (ScaleStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
