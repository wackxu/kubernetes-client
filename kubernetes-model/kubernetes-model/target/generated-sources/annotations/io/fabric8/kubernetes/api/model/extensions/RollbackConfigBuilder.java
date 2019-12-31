package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RollbackConfigBuilder extends RollbackConfigFluentImpl<RollbackConfigBuilder> implements VisitableBuilder<RollbackConfig,RollbackConfigBuilder>{

    RollbackConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RollbackConfigBuilder(){
            this(true);
    }
    public RollbackConfigBuilder(Boolean validationEnabled){
            this(new RollbackConfig(), validationEnabled);
    }
    public RollbackConfigBuilder(RollbackConfigFluent<?> fluent){
            this(fluent, true);
    }
    public RollbackConfigBuilder(RollbackConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RollbackConfig(), validationEnabled);
    }
    public RollbackConfigBuilder(RollbackConfigFluent<?> fluent,RollbackConfig instance){
            this(fluent, instance, true);
    }
    public RollbackConfigBuilder(RollbackConfigFluent<?> fluent,RollbackConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollbackConfigBuilder(RollbackConfig instance){
            this(instance,true);
    }
    public RollbackConfigBuilder(RollbackConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollbackConfigBuilder(Validator validator){
            this(new RollbackConfig(), true);
    }
    public RollbackConfigBuilder(RollbackConfigFluent<?> fluent,RollbackConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RollbackConfigBuilder(RollbackConfig instance,Validator validator){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RollbackConfig build(){
            RollbackConfig buildable = new RollbackConfig(fluent.getRevision());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollbackConfigBuilder that = (RollbackConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
