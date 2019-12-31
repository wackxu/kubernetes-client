package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceDefinitionNamesBuilder extends CustomResourceDefinitionNamesFluentImpl<CustomResourceDefinitionNamesBuilder> implements VisitableBuilder<CustomResourceDefinitionNames,CustomResourceDefinitionNamesBuilder>{

    CustomResourceDefinitionNamesFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceDefinitionNamesBuilder(){
            this(true);
    }
    public CustomResourceDefinitionNamesBuilder(Boolean validationEnabled){
            this(new CustomResourceDefinitionNames(), validationEnabled);
    }
    public CustomResourceDefinitionNamesBuilder(CustomResourceDefinitionNamesFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceDefinitionNamesBuilder(CustomResourceDefinitionNamesFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceDefinitionNames(), validationEnabled);
    }
    public CustomResourceDefinitionNamesBuilder(CustomResourceDefinitionNamesFluent<?> fluent,CustomResourceDefinitionNames instance){
            this(fluent, instance, true);
    }
    public CustomResourceDefinitionNamesBuilder(CustomResourceDefinitionNamesFluent<?> fluent,CustomResourceDefinitionNames instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCategories(instance.getCategories()); 
            fluent.withKind(instance.getKind()); 
            fluent.withListKind(instance.getListKind()); 
            fluent.withPlural(instance.getPlural()); 
            fluent.withShortNames(instance.getShortNames()); 
            fluent.withSingular(instance.getSingular()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionNamesBuilder(CustomResourceDefinitionNames instance){
            this(instance,true);
    }
    public CustomResourceDefinitionNamesBuilder(CustomResourceDefinitionNames instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCategories(instance.getCategories()); 
            this.withKind(instance.getKind()); 
            this.withListKind(instance.getListKind()); 
            this.withPlural(instance.getPlural()); 
            this.withShortNames(instance.getShortNames()); 
            this.withSingular(instance.getSingular()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionNamesBuilder(Validator validator){
            this(new CustomResourceDefinitionNames(), true);
    }
    public CustomResourceDefinitionNamesBuilder(CustomResourceDefinitionNamesFluent<?> fluent,CustomResourceDefinitionNames instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCategories(instance.getCategories()); 
            fluent.withKind(instance.getKind()); 
            fluent.withListKind(instance.getListKind()); 
            fluent.withPlural(instance.getPlural()); 
            fluent.withShortNames(instance.getShortNames()); 
            fluent.withSingular(instance.getSingular()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceDefinitionNamesBuilder(CustomResourceDefinitionNames instance,Validator validator){
            this.fluent = this; 
            this.withCategories(instance.getCategories()); 
            this.withKind(instance.getKind()); 
            this.withListKind(instance.getListKind()); 
            this.withPlural(instance.getPlural()); 
            this.withShortNames(instance.getShortNames()); 
            this.withSingular(instance.getSingular()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceDefinitionNames build(){
            CustomResourceDefinitionNames buildable = new CustomResourceDefinitionNames(fluent.getCategories(),fluent.getKind(),fluent.getListKind(),fluent.getPlural(),fluent.getShortNames(),fluent.getSingular());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionNamesBuilder that = (CustomResourceDefinitionNamesBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
