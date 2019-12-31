package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodTemplateListBuilder extends PodTemplateListFluentImpl<PodTemplateListBuilder> implements VisitableBuilder<PodTemplateList,PodTemplateListBuilder>{

    PodTemplateListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodTemplateListBuilder(){
            this(true);
    }
    public PodTemplateListBuilder(Boolean validationEnabled){
            this(new PodTemplateList(), validationEnabled);
    }
    public PodTemplateListBuilder(PodTemplateListFluent<?> fluent){
            this(fluent, true);
    }
    public PodTemplateListBuilder(PodTemplateListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodTemplateList(), validationEnabled);
    }
    public PodTemplateListBuilder(PodTemplateListFluent<?> fluent,PodTemplateList instance){
            this(fluent, instance, true);
    }
    public PodTemplateListBuilder(PodTemplateListFluent<?> fluent,PodTemplateList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodTemplateListBuilder(PodTemplateList instance){
            this(instance,true);
    }
    public PodTemplateListBuilder(PodTemplateList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodTemplateListBuilder(Validator validator){
            this(new PodTemplateList(), true);
    }
    public PodTemplateListBuilder(PodTemplateListFluent<?> fluent,PodTemplateList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodTemplateListBuilder(PodTemplateList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodTemplateList build(){
            PodTemplateList buildable = new PodTemplateList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodTemplateListBuilder that = (PodTemplateListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
