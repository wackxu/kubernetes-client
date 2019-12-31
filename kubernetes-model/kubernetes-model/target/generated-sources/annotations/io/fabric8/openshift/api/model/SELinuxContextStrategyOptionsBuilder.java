package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SELinuxContextStrategyOptionsBuilder extends SELinuxContextStrategyOptionsFluentImpl<SELinuxContextStrategyOptionsBuilder> implements VisitableBuilder<SELinuxContextStrategyOptions,SELinuxContextStrategyOptionsBuilder>{

    SELinuxContextStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SELinuxContextStrategyOptionsBuilder(){
            this(true);
    }
    public SELinuxContextStrategyOptionsBuilder(Boolean validationEnabled){
            this(new SELinuxContextStrategyOptions(), validationEnabled);
    }
    public SELinuxContextStrategyOptionsBuilder(SELinuxContextStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public SELinuxContextStrategyOptionsBuilder(SELinuxContextStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SELinuxContextStrategyOptions(), validationEnabled);
    }
    public SELinuxContextStrategyOptionsBuilder(SELinuxContextStrategyOptionsFluent<?> fluent,SELinuxContextStrategyOptions instance){
            this(fluent, instance, true);
    }
    public SELinuxContextStrategyOptionsBuilder(SELinuxContextStrategyOptionsFluent<?> fluent,SELinuxContextStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SELinuxContextStrategyOptionsBuilder(SELinuxContextStrategyOptions instance){
            this(instance,true);
    }
    public SELinuxContextStrategyOptionsBuilder(SELinuxContextStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SELinuxContextStrategyOptionsBuilder(Validator validator){
            this(new SELinuxContextStrategyOptions(), true);
    }
    public SELinuxContextStrategyOptionsBuilder(SELinuxContextStrategyOptionsFluent<?> fluent,SELinuxContextStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SELinuxContextStrategyOptionsBuilder(SELinuxContextStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SELinuxContextStrategyOptions build(){
            SELinuxContextStrategyOptions buildable = new SELinuxContextStrategyOptions(fluent.getSeLinuxOptions(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SELinuxContextStrategyOptionsBuilder that = (SELinuxContextStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
