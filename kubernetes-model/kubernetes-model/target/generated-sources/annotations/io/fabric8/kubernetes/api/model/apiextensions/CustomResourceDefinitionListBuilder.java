package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceDefinitionListBuilder extends CustomResourceDefinitionListFluentImpl<CustomResourceDefinitionListBuilder> implements VisitableBuilder<CustomResourceDefinitionList,CustomResourceDefinitionListBuilder>{

    CustomResourceDefinitionListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceDefinitionListBuilder(){
            this(true);
    }
    public CustomResourceDefinitionListBuilder(Boolean validationEnabled){
            this(new CustomResourceDefinitionList(), validationEnabled);
    }
    public CustomResourceDefinitionListBuilder(CustomResourceDefinitionListFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceDefinitionListBuilder(CustomResourceDefinitionListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceDefinitionList(), validationEnabled);
    }
    public CustomResourceDefinitionListBuilder(CustomResourceDefinitionListFluent<?> fluent,CustomResourceDefinitionList instance){
            this(fluent, instance, true);
    }
    public CustomResourceDefinitionListBuilder(CustomResourceDefinitionListFluent<?> fluent,CustomResourceDefinitionList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionListBuilder(CustomResourceDefinitionList instance){
            this(instance,true);
    }
    public CustomResourceDefinitionListBuilder(CustomResourceDefinitionList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionListBuilder(Validator validator){
            this(new CustomResourceDefinitionList(), true);
    }
    public CustomResourceDefinitionListBuilder(CustomResourceDefinitionListFluent<?> fluent,CustomResourceDefinitionList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceDefinitionListBuilder(CustomResourceDefinitionList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceDefinitionList build(){
            CustomResourceDefinitionList buildable = new CustomResourceDefinitionList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionListBuilder that = (CustomResourceDefinitionListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
