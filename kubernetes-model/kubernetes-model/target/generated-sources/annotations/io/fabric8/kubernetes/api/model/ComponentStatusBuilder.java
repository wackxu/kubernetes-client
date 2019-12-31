package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ComponentStatusBuilder extends ComponentStatusFluentImpl<ComponentStatusBuilder> implements VisitableBuilder<ComponentStatus,ComponentStatusBuilder>{

    ComponentStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ComponentStatusBuilder(){
            this(true);
    }
    public ComponentStatusBuilder(Boolean validationEnabled){
            this(new ComponentStatus(), validationEnabled);
    }
    public ComponentStatusBuilder(ComponentStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ComponentStatusBuilder(ComponentStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ComponentStatus(), validationEnabled);
    }
    public ComponentStatusBuilder(ComponentStatusFluent<?> fluent,ComponentStatus instance){
            this(fluent, instance, true);
    }
    public ComponentStatusBuilder(ComponentStatusFluent<?> fluent,ComponentStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ComponentStatusBuilder(ComponentStatus instance){
            this(instance,true);
    }
    public ComponentStatusBuilder(ComponentStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ComponentStatusBuilder(Validator validator){
            this(new ComponentStatus(), true);
    }
    public ComponentStatusBuilder(ComponentStatusFluent<?> fluent,ComponentStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ComponentStatusBuilder(ComponentStatus instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ComponentStatus build(){
            ComponentStatus buildable = new ComponentStatus(fluent.getApiVersion(),fluent.getConditions(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ComponentStatusBuilder that = (ComponentStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
