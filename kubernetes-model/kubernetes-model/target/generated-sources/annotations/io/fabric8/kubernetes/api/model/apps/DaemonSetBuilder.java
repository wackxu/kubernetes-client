package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DaemonSetBuilder extends DaemonSetFluentImpl<DaemonSetBuilder> implements VisitableBuilder<DaemonSet,DaemonSetBuilder>{

    DaemonSetFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DaemonSetBuilder(){
            this(true);
    }
    public DaemonSetBuilder(Boolean validationEnabled){
            this(new DaemonSet(), validationEnabled);
    }
    public DaemonSetBuilder(DaemonSetFluent<?> fluent){
            this(fluent, true);
    }
    public DaemonSetBuilder(DaemonSetFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DaemonSet(), validationEnabled);
    }
    public DaemonSetBuilder(DaemonSetFluent<?> fluent,DaemonSet instance){
            this(fluent, instance, true);
    }
    public DaemonSetBuilder(DaemonSetFluent<?> fluent,DaemonSet instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetBuilder(DaemonSet instance){
            this(instance,true);
    }
    public DaemonSetBuilder(DaemonSet instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetBuilder(Validator validator){
            this(new DaemonSet(), true);
    }
    public DaemonSetBuilder(DaemonSetFluent<?> fluent,DaemonSet instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DaemonSetBuilder(DaemonSet instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DaemonSet build(){
            DaemonSet buildable = new DaemonSet(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetBuilder that = (DaemonSetBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
