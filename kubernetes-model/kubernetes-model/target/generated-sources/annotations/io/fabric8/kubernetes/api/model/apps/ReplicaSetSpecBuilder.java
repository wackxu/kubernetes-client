package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicaSetSpecBuilder extends ReplicaSetSpecFluentImpl<ReplicaSetSpecBuilder> implements VisitableBuilder<ReplicaSetSpec,ReplicaSetSpecBuilder>{

    ReplicaSetSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicaSetSpecBuilder(){
            this(true);
    }
    public ReplicaSetSpecBuilder(Boolean validationEnabled){
            this(new ReplicaSetSpec(), validationEnabled);
    }
    public ReplicaSetSpecBuilder(ReplicaSetSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicaSetSpecBuilder(ReplicaSetSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicaSetSpec(), validationEnabled);
    }
    public ReplicaSetSpecBuilder(ReplicaSetSpecFluent<?> fluent,ReplicaSetSpec instance){
            this(fluent, instance, true);
    }
    public ReplicaSetSpecBuilder(ReplicaSetSpecFluent<?> fluent,ReplicaSetSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTemplate(instance.getTemplate()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetSpecBuilder(ReplicaSetSpec instance){
            this(instance,true);
    }
    public ReplicaSetSpecBuilder(ReplicaSetSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetSpecBuilder(Validator validator){
            this(new ReplicaSetSpec(), true);
    }
    public ReplicaSetSpecBuilder(ReplicaSetSpecFluent<?> fluent,ReplicaSetSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTemplate(instance.getTemplate()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ReplicaSetSpecBuilder(ReplicaSetSpec instance,Validator validator){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ReplicaSetSpec build(){
            ReplicaSetSpec buildable = new ReplicaSetSpec(fluent.getMinReadySeconds(),fluent.getReplicas(),fluent.getSelector(),fluent.getTemplate());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicaSetSpecBuilder that = (ReplicaSetSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
