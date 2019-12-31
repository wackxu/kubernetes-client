package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DaemonSetSpecBuilder extends DaemonSetSpecFluentImpl<DaemonSetSpecBuilder> implements VisitableBuilder<DaemonSetSpec,DaemonSetSpecBuilder>{

    DaemonSetSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DaemonSetSpecBuilder(){
            this(true);
    }
    public DaemonSetSpecBuilder(Boolean validationEnabled){
            this(new DaemonSetSpec(), validationEnabled);
    }
    public DaemonSetSpecBuilder(DaemonSetSpecFluent<?> fluent){
            this(fluent, true);
    }
    public DaemonSetSpecBuilder(DaemonSetSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DaemonSetSpec(), validationEnabled);
    }
    public DaemonSetSpecBuilder(DaemonSetSpecFluent<?> fluent,DaemonSetSpec instance){
            this(fluent, instance, true);
    }
    public DaemonSetSpecBuilder(DaemonSetSpecFluent<?> fluent,DaemonSetSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTemplate(instance.getTemplate()); 
            fluent.withUpdateStrategy(instance.getUpdateStrategy()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetSpecBuilder(DaemonSetSpec instance){
            this(instance,true);
    }
    public DaemonSetSpecBuilder(DaemonSetSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.withUpdateStrategy(instance.getUpdateStrategy()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetSpecBuilder(Validator validator){
            this(new DaemonSetSpec(), true);
    }
    public DaemonSetSpecBuilder(DaemonSetSpecFluent<?> fluent,DaemonSetSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTemplate(instance.getTemplate()); 
            fluent.withUpdateStrategy(instance.getUpdateStrategy()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DaemonSetSpecBuilder(DaemonSetSpec instance,Validator validator){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.withUpdateStrategy(instance.getUpdateStrategy()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DaemonSetSpec build(){
            DaemonSetSpec buildable = new DaemonSetSpec(fluent.getMinReadySeconds(),fluent.getRevisionHistoryLimit(),fluent.getSelector(),fluent.getTemplate(),fluent.getUpdateStrategy());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetSpecBuilder that = (DaemonSetSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
