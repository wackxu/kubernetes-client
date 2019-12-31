package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicationControllerListBuilder extends ReplicationControllerListFluentImpl<ReplicationControllerListBuilder> implements VisitableBuilder<ReplicationControllerList,ReplicationControllerListBuilder>{

    ReplicationControllerListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicationControllerListBuilder(){
            this(true);
    }
    public ReplicationControllerListBuilder(Boolean validationEnabled){
            this(new ReplicationControllerList(), validationEnabled);
    }
    public ReplicationControllerListBuilder(ReplicationControllerListFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicationControllerListBuilder(ReplicationControllerListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicationControllerList(), validationEnabled);
    }
    public ReplicationControllerListBuilder(ReplicationControllerListFluent<?> fluent,ReplicationControllerList instance){
            this(fluent, instance, true);
    }
    public ReplicationControllerListBuilder(ReplicationControllerListFluent<?> fluent,ReplicationControllerList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicationControllerListBuilder(ReplicationControllerList instance){
            this(instance,true);
    }
    public ReplicationControllerListBuilder(ReplicationControllerList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicationControllerListBuilder(Validator validator){
            this(new ReplicationControllerList(), true);
    }
    public ReplicationControllerListBuilder(ReplicationControllerListFluent<?> fluent,ReplicationControllerList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ReplicationControllerListBuilder(ReplicationControllerList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ReplicationControllerList build(){
            ReplicationControllerList buildable = new ReplicationControllerList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicationControllerListBuilder that = (ReplicationControllerListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
