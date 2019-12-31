package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RollingUpdateDaemonSetBuilder extends RollingUpdateDaemonSetFluentImpl<RollingUpdateDaemonSetBuilder> implements VisitableBuilder<RollingUpdateDaemonSet,RollingUpdateDaemonSetBuilder>{

    RollingUpdateDaemonSetFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RollingUpdateDaemonSetBuilder(){
            this(true);
    }
    public RollingUpdateDaemonSetBuilder(Boolean validationEnabled){
            this(new RollingUpdateDaemonSet(), validationEnabled);
    }
    public RollingUpdateDaemonSetBuilder(RollingUpdateDaemonSetFluent<?> fluent){
            this(fluent, true);
    }
    public RollingUpdateDaemonSetBuilder(RollingUpdateDaemonSetFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RollingUpdateDaemonSet(), validationEnabled);
    }
    public RollingUpdateDaemonSetBuilder(RollingUpdateDaemonSetFluent<?> fluent,RollingUpdateDaemonSet instance){
            this(fluent, instance, true);
    }
    public RollingUpdateDaemonSetBuilder(RollingUpdateDaemonSetFluent<?> fluent,RollingUpdateDaemonSet instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollingUpdateDaemonSetBuilder(RollingUpdateDaemonSet instance){
            this(instance,true);
    }
    public RollingUpdateDaemonSetBuilder(RollingUpdateDaemonSet instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.validationEnabled = validationEnabled; 
    }
    public RollingUpdateDaemonSetBuilder(Validator validator){
            this(new RollingUpdateDaemonSet(), true);
    }
    public RollingUpdateDaemonSetBuilder(RollingUpdateDaemonSetFluent<?> fluent,RollingUpdateDaemonSet instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RollingUpdateDaemonSetBuilder(RollingUpdateDaemonSet instance,Validator validator){
            this.fluent = this; 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RollingUpdateDaemonSet build(){
            RollingUpdateDaemonSet buildable = new RollingUpdateDaemonSet(fluent.getMaxUnavailable());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollingUpdateDaemonSetBuilder that = (RollingUpdateDaemonSetBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
