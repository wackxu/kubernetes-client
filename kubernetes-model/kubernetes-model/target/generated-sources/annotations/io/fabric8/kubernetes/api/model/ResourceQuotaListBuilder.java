package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceQuotaListBuilder extends ResourceQuotaListFluentImpl<ResourceQuotaListBuilder> implements VisitableBuilder<ResourceQuotaList,ResourceQuotaListBuilder>{

    ResourceQuotaListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceQuotaListBuilder(){
            this(true);
    }
    public ResourceQuotaListBuilder(Boolean validationEnabled){
            this(new ResourceQuotaList(), validationEnabled);
    }
    public ResourceQuotaListBuilder(ResourceQuotaListFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceQuotaListBuilder(ResourceQuotaListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceQuotaList(), validationEnabled);
    }
    public ResourceQuotaListBuilder(ResourceQuotaListFluent<?> fluent,ResourceQuotaList instance){
            this(fluent, instance, true);
    }
    public ResourceQuotaListBuilder(ResourceQuotaListFluent<?> fluent,ResourceQuotaList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceQuotaListBuilder(ResourceQuotaList instance){
            this(instance,true);
    }
    public ResourceQuotaListBuilder(ResourceQuotaList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceQuotaListBuilder(Validator validator){
            this(new ResourceQuotaList(), true);
    }
    public ResourceQuotaListBuilder(ResourceQuotaListFluent<?> fluent,ResourceQuotaList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceQuotaListBuilder(ResourceQuotaList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceQuotaList build(){
            ResourceQuotaList buildable = new ResourceQuotaList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceQuotaListBuilder that = (ResourceQuotaListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
