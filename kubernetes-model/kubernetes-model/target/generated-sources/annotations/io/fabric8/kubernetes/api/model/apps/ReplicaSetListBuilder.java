package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicaSetListBuilder extends ReplicaSetListFluentImpl<ReplicaSetListBuilder> implements VisitableBuilder<ReplicaSetList,ReplicaSetListBuilder>{

    ReplicaSetListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicaSetListBuilder(){
            this(true);
    }
    public ReplicaSetListBuilder(Boolean validationEnabled){
            this(new ReplicaSetList(), validationEnabled);
    }
    public ReplicaSetListBuilder(ReplicaSetListFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicaSetListBuilder(ReplicaSetListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicaSetList(), validationEnabled);
    }
    public ReplicaSetListBuilder(ReplicaSetListFluent<?> fluent,ReplicaSetList instance){
            this(fluent, instance, true);
    }
    public ReplicaSetListBuilder(ReplicaSetListFluent<?> fluent,ReplicaSetList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetListBuilder(ReplicaSetList instance){
            this(instance,true);
    }
    public ReplicaSetListBuilder(ReplicaSetList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetListBuilder(Validator validator){
            this(new ReplicaSetList(), true);
    }
    public ReplicaSetListBuilder(ReplicaSetListFluent<?> fluent,ReplicaSetList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ReplicaSetListBuilder(ReplicaSetList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ReplicaSetList build(){
            ReplicaSetList buildable = new ReplicaSetList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicaSetListBuilder that = (ReplicaSetListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
