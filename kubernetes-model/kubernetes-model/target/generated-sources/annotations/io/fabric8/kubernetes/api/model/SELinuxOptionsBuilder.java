package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SELinuxOptionsBuilder extends SELinuxOptionsFluentImpl<SELinuxOptionsBuilder> implements VisitableBuilder<SELinuxOptions,SELinuxOptionsBuilder>{

    SELinuxOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SELinuxOptionsBuilder(){
            this(true);
    }
    public SELinuxOptionsBuilder(Boolean validationEnabled){
            this(new SELinuxOptions(), validationEnabled);
    }
    public SELinuxOptionsBuilder(SELinuxOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public SELinuxOptionsBuilder(SELinuxOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SELinuxOptions(), validationEnabled);
    }
    public SELinuxOptionsBuilder(SELinuxOptionsFluent<?> fluent,SELinuxOptions instance){
            this(fluent, instance, true);
    }
    public SELinuxOptionsBuilder(SELinuxOptionsFluent<?> fluent,SELinuxOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLevel(instance.getLevel()); 
            fluent.withRole(instance.getRole()); 
            fluent.withType(instance.getType()); 
            fluent.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public SELinuxOptionsBuilder(SELinuxOptions instance){
            this(instance,true);
    }
    public SELinuxOptionsBuilder(SELinuxOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLevel(instance.getLevel()); 
            this.withRole(instance.getRole()); 
            this.withType(instance.getType()); 
            this.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public SELinuxOptionsBuilder(Validator validator){
            this(new SELinuxOptions(), true);
    }
    public SELinuxOptionsBuilder(SELinuxOptionsFluent<?> fluent,SELinuxOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLevel(instance.getLevel()); 
            fluent.withRole(instance.getRole()); 
            fluent.withType(instance.getType()); 
            fluent.withUser(instance.getUser()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SELinuxOptionsBuilder(SELinuxOptions instance,Validator validator){
            this.fluent = this; 
            this.withLevel(instance.getLevel()); 
            this.withRole(instance.getRole()); 
            this.withType(instance.getType()); 
            this.withUser(instance.getUser()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SELinuxOptions build(){
            SELinuxOptions buildable = new SELinuxOptions(fluent.getLevel(),fluent.getRole(),fluent.getType(),fluent.getUser());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SELinuxOptionsBuilder that = (SELinuxOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
