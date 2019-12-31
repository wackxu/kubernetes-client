package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicaSetBuilder extends ReplicaSetFluentImpl<ReplicaSetBuilder> implements VisitableBuilder<ReplicaSet,ReplicaSetBuilder>{

    ReplicaSetFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicaSetBuilder(){
            this(true);
    }
    public ReplicaSetBuilder(Boolean validationEnabled){
            this(new ReplicaSet(), validationEnabled);
    }
    public ReplicaSetBuilder(ReplicaSetFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicaSetBuilder(ReplicaSetFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicaSet(), validationEnabled);
    }
    public ReplicaSetBuilder(ReplicaSetFluent<?> fluent,ReplicaSet instance){
            this(fluent, instance, true);
    }
    public ReplicaSetBuilder(ReplicaSetFluent<?> fluent,ReplicaSet instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetBuilder(ReplicaSet instance){
            this(instance,true);
    }
    public ReplicaSetBuilder(ReplicaSet instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetBuilder(Validator validator){
            this(new ReplicaSet(), true);
    }
    public ReplicaSetBuilder(ReplicaSetFluent<?> fluent,ReplicaSet instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ReplicaSetBuilder(ReplicaSet instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ReplicaSet build(){
            ReplicaSet buildable = new ReplicaSet(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicaSetBuilder that = (ReplicaSetBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
