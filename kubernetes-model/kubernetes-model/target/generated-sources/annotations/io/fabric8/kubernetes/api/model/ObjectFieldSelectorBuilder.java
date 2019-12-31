package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ObjectFieldSelectorBuilder extends ObjectFieldSelectorFluentImpl<ObjectFieldSelectorBuilder> implements VisitableBuilder<ObjectFieldSelector,ObjectFieldSelectorBuilder>{

    ObjectFieldSelectorFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ObjectFieldSelectorBuilder(){
            this(true);
    }
    public ObjectFieldSelectorBuilder(Boolean validationEnabled){
            this(new ObjectFieldSelector(), validationEnabled);
    }
    public ObjectFieldSelectorBuilder(ObjectFieldSelectorFluent<?> fluent){
            this(fluent, true);
    }
    public ObjectFieldSelectorBuilder(ObjectFieldSelectorFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ObjectFieldSelector(), validationEnabled);
    }
    public ObjectFieldSelectorBuilder(ObjectFieldSelectorFluent<?> fluent,ObjectFieldSelector instance){
            this(fluent, instance, true);
    }
    public ObjectFieldSelectorBuilder(ObjectFieldSelectorFluent<?> fluent,ObjectFieldSelector instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withFieldPath(instance.getFieldPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectFieldSelectorBuilder(ObjectFieldSelector instance){
            this(instance,true);
    }
    public ObjectFieldSelectorBuilder(ObjectFieldSelector instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withFieldPath(instance.getFieldPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectFieldSelectorBuilder(Validator validator){
            this(new ObjectFieldSelector(), true);
    }
    public ObjectFieldSelectorBuilder(ObjectFieldSelectorFluent<?> fluent,ObjectFieldSelector instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withFieldPath(instance.getFieldPath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ObjectFieldSelectorBuilder(ObjectFieldSelector instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withFieldPath(instance.getFieldPath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ObjectFieldSelector build(){
            ObjectFieldSelector buildable = new ObjectFieldSelector(fluent.getApiVersion(),fluent.getFieldPath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectFieldSelectorBuilder that = (ObjectFieldSelectorBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
