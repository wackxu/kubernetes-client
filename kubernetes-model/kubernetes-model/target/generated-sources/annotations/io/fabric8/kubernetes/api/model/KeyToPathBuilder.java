package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class KeyToPathBuilder extends KeyToPathFluentImpl<KeyToPathBuilder> implements VisitableBuilder<KeyToPath,KeyToPathBuilder>{

    KeyToPathFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public KeyToPathBuilder(){
            this(true);
    }
    public KeyToPathBuilder(Boolean validationEnabled){
            this(new KeyToPath(), validationEnabled);
    }
    public KeyToPathBuilder(KeyToPathFluent<?> fluent){
            this(fluent, true);
    }
    public KeyToPathBuilder(KeyToPathFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new KeyToPath(), validationEnabled);
    }
    public KeyToPathBuilder(KeyToPathFluent<?> fluent,KeyToPath instance){
            this(fluent, instance, true);
    }
    public KeyToPathBuilder(KeyToPathFluent<?> fluent,KeyToPath instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withMode(instance.getMode()); 
            fluent.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public KeyToPathBuilder(KeyToPath instance){
            this(instance,true);
    }
    public KeyToPathBuilder(KeyToPath instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withMode(instance.getMode()); 
            this.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public KeyToPathBuilder(Validator validator){
            this(new KeyToPath(), true);
    }
    public KeyToPathBuilder(KeyToPathFluent<?> fluent,KeyToPath instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withMode(instance.getMode()); 
            fluent.withPath(instance.getPath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public KeyToPathBuilder(KeyToPath instance,Validator validator){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withMode(instance.getMode()); 
            this.withPath(instance.getPath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public KeyToPath build(){
            KeyToPath buildable = new KeyToPath(fluent.getKey(),fluent.getMode(),fluent.getPath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            KeyToPathBuilder that = (KeyToPathBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
