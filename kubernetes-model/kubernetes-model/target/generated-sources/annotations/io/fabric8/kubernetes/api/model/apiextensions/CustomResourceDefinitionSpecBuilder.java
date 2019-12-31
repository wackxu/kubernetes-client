package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceDefinitionSpecBuilder extends CustomResourceDefinitionSpecFluentImpl<CustomResourceDefinitionSpecBuilder> implements VisitableBuilder<CustomResourceDefinitionSpec,CustomResourceDefinitionSpecBuilder>{

    CustomResourceDefinitionSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceDefinitionSpecBuilder(){
            this(true);
    }
    public CustomResourceDefinitionSpecBuilder(Boolean validationEnabled){
            this(new CustomResourceDefinitionSpec(), validationEnabled);
    }
    public CustomResourceDefinitionSpecBuilder(CustomResourceDefinitionSpecFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceDefinitionSpecBuilder(CustomResourceDefinitionSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceDefinitionSpec(), validationEnabled);
    }
    public CustomResourceDefinitionSpecBuilder(CustomResourceDefinitionSpecFluent<?> fluent,CustomResourceDefinitionSpec instance){
            this(fluent, instance, true);
    }
    public CustomResourceDefinitionSpecBuilder(CustomResourceDefinitionSpecFluent<?> fluent,CustomResourceDefinitionSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            fluent.withConversion(instance.getConversion()); 
            fluent.withGroup(instance.getGroup()); 
            fluent.withNames(instance.getNames()); 
            fluent.withScope(instance.getScope()); 
            fluent.withSubresources(instance.getSubresources()); 
            fluent.withValidation(instance.getValidation()); 
            fluent.withVersion(instance.getVersion()); 
            fluent.withVersions(instance.getVersions()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionSpecBuilder(CustomResourceDefinitionSpec instance){
            this(instance,true);
    }
    public CustomResourceDefinitionSpecBuilder(CustomResourceDefinitionSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            this.withConversion(instance.getConversion()); 
            this.withGroup(instance.getGroup()); 
            this.withNames(instance.getNames()); 
            this.withScope(instance.getScope()); 
            this.withSubresources(instance.getSubresources()); 
            this.withValidation(instance.getValidation()); 
            this.withVersion(instance.getVersion()); 
            this.withVersions(instance.getVersions()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionSpecBuilder(Validator validator){
            this(new CustomResourceDefinitionSpec(), true);
    }
    public CustomResourceDefinitionSpecBuilder(CustomResourceDefinitionSpecFluent<?> fluent,CustomResourceDefinitionSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            fluent.withConversion(instance.getConversion()); 
            fluent.withGroup(instance.getGroup()); 
            fluent.withNames(instance.getNames()); 
            fluent.withScope(instance.getScope()); 
            fluent.withSubresources(instance.getSubresources()); 
            fluent.withValidation(instance.getValidation()); 
            fluent.withVersion(instance.getVersion()); 
            fluent.withVersions(instance.getVersions()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceDefinitionSpecBuilder(CustomResourceDefinitionSpec instance,Validator validator){
            this.fluent = this; 
            this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            this.withConversion(instance.getConversion()); 
            this.withGroup(instance.getGroup()); 
            this.withNames(instance.getNames()); 
            this.withScope(instance.getScope()); 
            this.withSubresources(instance.getSubresources()); 
            this.withValidation(instance.getValidation()); 
            this.withVersion(instance.getVersion()); 
            this.withVersions(instance.getVersions()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceDefinitionSpec build(){
            CustomResourceDefinitionSpec buildable = new CustomResourceDefinitionSpec(fluent.getAdditionalPrinterColumns(),fluent.getConversion(),fluent.getGroup(),fluent.getNames(),fluent.getScope(),fluent.getSubresources(),fluent.getValidation(),fluent.getVersion(),fluent.getVersions());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionSpecBuilder that = (CustomResourceDefinitionSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
