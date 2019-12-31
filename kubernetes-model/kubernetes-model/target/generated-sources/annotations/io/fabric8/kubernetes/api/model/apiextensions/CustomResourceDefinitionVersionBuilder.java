package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceDefinitionVersionBuilder extends CustomResourceDefinitionVersionFluentImpl<CustomResourceDefinitionVersionBuilder> implements VisitableBuilder<CustomResourceDefinitionVersion,CustomResourceDefinitionVersionBuilder>{

    CustomResourceDefinitionVersionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceDefinitionVersionBuilder(){
            this(true);
    }
    public CustomResourceDefinitionVersionBuilder(Boolean validationEnabled){
            this(new CustomResourceDefinitionVersion(), validationEnabled);
    }
    public CustomResourceDefinitionVersionBuilder(CustomResourceDefinitionVersionFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceDefinitionVersionBuilder(CustomResourceDefinitionVersionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceDefinitionVersion(), validationEnabled);
    }
    public CustomResourceDefinitionVersionBuilder(CustomResourceDefinitionVersionFluent<?> fluent,CustomResourceDefinitionVersion instance){
            this(fluent, instance, true);
    }
    public CustomResourceDefinitionVersionBuilder(CustomResourceDefinitionVersionFluent<?> fluent,CustomResourceDefinitionVersion instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            fluent.withName(instance.getName()); 
            fluent.withSchema(instance.getSchema()); 
            fluent.withServed(instance.getServed()); 
            fluent.withStorage(instance.getStorage()); 
            fluent.withSubresources(instance.getSubresources()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionVersionBuilder(CustomResourceDefinitionVersion instance){
            this(instance,true);
    }
    public CustomResourceDefinitionVersionBuilder(CustomResourceDefinitionVersion instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            this.withName(instance.getName()); 
            this.withSchema(instance.getSchema()); 
            this.withServed(instance.getServed()); 
            this.withStorage(instance.getStorage()); 
            this.withSubresources(instance.getSubresources()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionVersionBuilder(Validator validator){
            this(new CustomResourceDefinitionVersion(), true);
    }
    public CustomResourceDefinitionVersionBuilder(CustomResourceDefinitionVersionFluent<?> fluent,CustomResourceDefinitionVersion instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            fluent.withName(instance.getName()); 
            fluent.withSchema(instance.getSchema()); 
            fluent.withServed(instance.getServed()); 
            fluent.withStorage(instance.getStorage()); 
            fluent.withSubresources(instance.getSubresources()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceDefinitionVersionBuilder(CustomResourceDefinitionVersion instance,Validator validator){
            this.fluent = this; 
            this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            this.withName(instance.getName()); 
            this.withSchema(instance.getSchema()); 
            this.withServed(instance.getServed()); 
            this.withStorage(instance.getStorage()); 
            this.withSubresources(instance.getSubresources()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceDefinitionVersion build(){
            CustomResourceDefinitionVersion buildable = new CustomResourceDefinitionVersion(fluent.getAdditionalPrinterColumns(),fluent.getName(),fluent.getSchema(),fluent.isServed(),fluent.isStorage(),fluent.getSubresources());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionVersionBuilder that = (CustomResourceDefinitionVersionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
