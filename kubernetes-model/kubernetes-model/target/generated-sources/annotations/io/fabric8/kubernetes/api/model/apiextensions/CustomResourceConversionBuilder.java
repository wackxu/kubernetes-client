package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceConversionBuilder extends CustomResourceConversionFluentImpl<CustomResourceConversionBuilder> implements VisitableBuilder<CustomResourceConversion,CustomResourceConversionBuilder>{

    CustomResourceConversionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceConversionBuilder(){
            this(true);
    }
    public CustomResourceConversionBuilder(Boolean validationEnabled){
            this(new CustomResourceConversion(), validationEnabled);
    }
    public CustomResourceConversionBuilder(CustomResourceConversionFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceConversionBuilder(CustomResourceConversionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceConversion(), validationEnabled);
    }
    public CustomResourceConversionBuilder(CustomResourceConversionFluent<?> fluent,CustomResourceConversion instance){
            this(fluent, instance, true);
    }
    public CustomResourceConversionBuilder(CustomResourceConversionFluent<?> fluent,CustomResourceConversion instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withWebhookClientConfig(instance.getWebhookClientConfig()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceConversionBuilder(CustomResourceConversion instance){
            this(instance,true);
    }
    public CustomResourceConversionBuilder(CustomResourceConversion instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withStrategy(instance.getStrategy()); 
            this.withWebhookClientConfig(instance.getWebhookClientConfig()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceConversionBuilder(Validator validator){
            this(new CustomResourceConversion(), true);
    }
    public CustomResourceConversionBuilder(CustomResourceConversionFluent<?> fluent,CustomResourceConversion instance,Validator validator){
            this.fluent = fluent; 
            fluent.withStrategy(instance.getStrategy()); 
            fluent.withWebhookClientConfig(instance.getWebhookClientConfig()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceConversionBuilder(CustomResourceConversion instance,Validator validator){
            this.fluent = this; 
            this.withStrategy(instance.getStrategy()); 
            this.withWebhookClientConfig(instance.getWebhookClientConfig()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceConversion build(){
            CustomResourceConversion buildable = new CustomResourceConversion(fluent.getStrategy(),fluent.getWebhookClientConfig());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceConversionBuilder that = (CustomResourceConversionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
