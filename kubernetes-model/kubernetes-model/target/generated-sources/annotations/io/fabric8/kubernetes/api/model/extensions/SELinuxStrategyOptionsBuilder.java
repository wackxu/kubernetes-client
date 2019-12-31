package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SELinuxStrategyOptionsBuilder extends SELinuxStrategyOptionsFluentImpl<SELinuxStrategyOptionsBuilder> implements VisitableBuilder<SELinuxStrategyOptions,SELinuxStrategyOptionsBuilder>{

    SELinuxStrategyOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SELinuxStrategyOptionsBuilder(){
            this(true);
    }
    public SELinuxStrategyOptionsBuilder(Boolean validationEnabled){
            this(new SELinuxStrategyOptions(), validationEnabled);
    }
    public SELinuxStrategyOptionsBuilder(SELinuxStrategyOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public SELinuxStrategyOptionsBuilder(SELinuxStrategyOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SELinuxStrategyOptions(), validationEnabled);
    }
    public SELinuxStrategyOptionsBuilder(SELinuxStrategyOptionsFluent<?> fluent,SELinuxStrategyOptions instance){
            this(fluent, instance, true);
    }
    public SELinuxStrategyOptionsBuilder(SELinuxStrategyOptionsFluent<?> fluent,SELinuxStrategyOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRule(instance.getRule()); 
            fluent.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.validationEnabled = validationEnabled; 
    }
    public SELinuxStrategyOptionsBuilder(SELinuxStrategyOptions instance){
            this(instance,true);
    }
    public SELinuxStrategyOptionsBuilder(SELinuxStrategyOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRule(instance.getRule()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.validationEnabled = validationEnabled; 
    }
    public SELinuxStrategyOptionsBuilder(Validator validator){
            this(new SELinuxStrategyOptions(), true);
    }
    public SELinuxStrategyOptionsBuilder(SELinuxStrategyOptionsFluent<?> fluent,SELinuxStrategyOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRule(instance.getRule()); 
            fluent.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SELinuxStrategyOptionsBuilder(SELinuxStrategyOptions instance,Validator validator){
            this.fluent = this; 
            this.withRule(instance.getRule()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SELinuxStrategyOptions build(){
            SELinuxStrategyOptions buildable = new SELinuxStrategyOptions(fluent.getRule(),fluent.getSeLinuxOptions());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SELinuxStrategyOptionsBuilder that = (SELinuxStrategyOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
