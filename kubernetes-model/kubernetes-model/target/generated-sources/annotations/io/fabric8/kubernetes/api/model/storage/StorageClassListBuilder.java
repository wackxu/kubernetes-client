package io.fabric8.kubernetes.api.model.storage;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StorageClassListBuilder extends StorageClassListFluentImpl<StorageClassListBuilder> implements VisitableBuilder<StorageClassList,StorageClassListBuilder>{

    StorageClassListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StorageClassListBuilder(){
            this(true);
    }
    public StorageClassListBuilder(Boolean validationEnabled){
            this(new StorageClassList(), validationEnabled);
    }
    public StorageClassListBuilder(StorageClassListFluent<?> fluent){
            this(fluent, true);
    }
    public StorageClassListBuilder(StorageClassListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StorageClassList(), validationEnabled);
    }
    public StorageClassListBuilder(StorageClassListFluent<?> fluent,StorageClassList instance){
            this(fluent, instance, true);
    }
    public StorageClassListBuilder(StorageClassListFluent<?> fluent,StorageClassList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public StorageClassListBuilder(StorageClassList instance){
            this(instance,true);
    }
    public StorageClassListBuilder(StorageClassList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public StorageClassListBuilder(Validator validator){
            this(new StorageClassList(), true);
    }
    public StorageClassListBuilder(StorageClassListFluent<?> fluent,StorageClassList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StorageClassListBuilder(StorageClassList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StorageClassList build(){
            StorageClassList buildable = new StorageClassList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StorageClassListBuilder that = (StorageClassListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
