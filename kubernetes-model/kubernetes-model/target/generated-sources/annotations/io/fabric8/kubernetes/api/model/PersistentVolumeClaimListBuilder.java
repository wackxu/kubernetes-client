package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeClaimListBuilder extends PersistentVolumeClaimListFluentImpl<PersistentVolumeClaimListBuilder> implements VisitableBuilder<PersistentVolumeClaimList,PersistentVolumeClaimListBuilder>{

    PersistentVolumeClaimListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeClaimListBuilder(){
            this(true);
    }
    public PersistentVolumeClaimListBuilder(Boolean validationEnabled){
            this(new PersistentVolumeClaimList(), validationEnabled);
    }
    public PersistentVolumeClaimListBuilder(PersistentVolumeClaimListFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeClaimListBuilder(PersistentVolumeClaimListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeClaimList(), validationEnabled);
    }
    public PersistentVolumeClaimListBuilder(PersistentVolumeClaimListFluent<?> fluent,PersistentVolumeClaimList instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeClaimListBuilder(PersistentVolumeClaimListFluent<?> fluent,PersistentVolumeClaimList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimListBuilder(PersistentVolumeClaimList instance){
            this(instance,true);
    }
    public PersistentVolumeClaimListBuilder(PersistentVolumeClaimList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimListBuilder(Validator validator){
            this(new PersistentVolumeClaimList(), true);
    }
    public PersistentVolumeClaimListBuilder(PersistentVolumeClaimListFluent<?> fluent,PersistentVolumeClaimList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeClaimListBuilder(PersistentVolumeClaimList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeClaimList build(){
            PersistentVolumeClaimList buildable = new PersistentVolumeClaimList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimListBuilder that = (PersistentVolumeClaimListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
