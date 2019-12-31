package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodListBuilder extends PodListFluentImpl<PodListBuilder> implements VisitableBuilder<PodList,PodListBuilder>{

    PodListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodListBuilder(){
            this(true);
    }
    public PodListBuilder(Boolean validationEnabled){
            this(new PodList(), validationEnabled);
    }
    public PodListBuilder(PodListFluent<?> fluent){
            this(fluent, true);
    }
    public PodListBuilder(PodListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodList(), validationEnabled);
    }
    public PodListBuilder(PodListFluent<?> fluent,PodList instance){
            this(fluent, instance, true);
    }
    public PodListBuilder(PodListFluent<?> fluent,PodList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodListBuilder(PodList instance){
            this(instance,true);
    }
    public PodListBuilder(PodList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodListBuilder(Validator validator){
            this(new PodList(), true);
    }
    public PodListBuilder(PodListFluent<?> fluent,PodList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodListBuilder(PodList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodList build(){
            PodList buildable = new PodList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodListBuilder that = (PodListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
