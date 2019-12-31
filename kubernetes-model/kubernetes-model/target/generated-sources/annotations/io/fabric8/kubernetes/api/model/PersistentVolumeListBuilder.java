package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeListBuilder extends PersistentVolumeListFluentImpl<PersistentVolumeListBuilder> implements VisitableBuilder<PersistentVolumeList,PersistentVolumeListBuilder>{

    PersistentVolumeListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeListBuilder(){
            this(true);
    }
    public PersistentVolumeListBuilder(Boolean validationEnabled){
            this(new PersistentVolumeList(), validationEnabled);
    }
    public PersistentVolumeListBuilder(PersistentVolumeListFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeListBuilder(PersistentVolumeListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeList(), validationEnabled);
    }
    public PersistentVolumeListBuilder(PersistentVolumeListFluent<?> fluent,PersistentVolumeList instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeListBuilder(PersistentVolumeListFluent<?> fluent,PersistentVolumeList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeListBuilder(PersistentVolumeList instance){
            this(instance,true);
    }
    public PersistentVolumeListBuilder(PersistentVolumeList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeListBuilder(Validator validator){
            this(new PersistentVolumeList(), true);
    }
    public PersistentVolumeListBuilder(PersistentVolumeListFluent<?> fluent,PersistentVolumeList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeListBuilder(PersistentVolumeList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeList build(){
            PersistentVolumeList buildable = new PersistentVolumeList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeListBuilder that = (PersistentVolumeListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
