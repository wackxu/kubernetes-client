package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ComponentStatusListBuilder extends ComponentStatusListFluentImpl<ComponentStatusListBuilder> implements VisitableBuilder<ComponentStatusList,ComponentStatusListBuilder>{

    ComponentStatusListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ComponentStatusListBuilder(){
            this(true);
    }
    public ComponentStatusListBuilder(Boolean validationEnabled){
            this(new ComponentStatusList(), validationEnabled);
    }
    public ComponentStatusListBuilder(ComponentStatusListFluent<?> fluent){
            this(fluent, true);
    }
    public ComponentStatusListBuilder(ComponentStatusListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ComponentStatusList(), validationEnabled);
    }
    public ComponentStatusListBuilder(ComponentStatusListFluent<?> fluent,ComponentStatusList instance){
            this(fluent, instance, true);
    }
    public ComponentStatusListBuilder(ComponentStatusListFluent<?> fluent,ComponentStatusList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ComponentStatusListBuilder(ComponentStatusList instance){
            this(instance,true);
    }
    public ComponentStatusListBuilder(ComponentStatusList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ComponentStatusListBuilder(Validator validator){
            this(new ComponentStatusList(), true);
    }
    public ComponentStatusListBuilder(ComponentStatusListFluent<?> fluent,ComponentStatusList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ComponentStatusListBuilder(ComponentStatusList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ComponentStatusList build(){
            ComponentStatusList buildable = new ComponentStatusList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ComponentStatusListBuilder that = (ComponentStatusListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
