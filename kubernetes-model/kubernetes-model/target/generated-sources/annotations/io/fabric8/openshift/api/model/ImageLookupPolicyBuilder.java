package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageLookupPolicyBuilder extends ImageLookupPolicyFluentImpl<ImageLookupPolicyBuilder> implements VisitableBuilder<ImageLookupPolicy,ImageLookupPolicyBuilder>{

    ImageLookupPolicyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageLookupPolicyBuilder(){
            this(true);
    }
    public ImageLookupPolicyBuilder(Boolean validationEnabled){
            this(new ImageLookupPolicy(), validationEnabled);
    }
    public ImageLookupPolicyBuilder(ImageLookupPolicyFluent<?> fluent){
            this(fluent, true);
    }
    public ImageLookupPolicyBuilder(ImageLookupPolicyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageLookupPolicy(), validationEnabled);
    }
    public ImageLookupPolicyBuilder(ImageLookupPolicyFluent<?> fluent,ImageLookupPolicy instance){
            this(fluent, instance, true);
    }
    public ImageLookupPolicyBuilder(ImageLookupPolicyFluent<?> fluent,ImageLookupPolicy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLocal(instance.getLocal()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageLookupPolicyBuilder(ImageLookupPolicy instance){
            this(instance,true);
    }
    public ImageLookupPolicyBuilder(ImageLookupPolicy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLocal(instance.getLocal()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageLookupPolicyBuilder(Validator validator){
            this(new ImageLookupPolicy(), true);
    }
    public ImageLookupPolicyBuilder(ImageLookupPolicyFluent<?> fluent,ImageLookupPolicy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLocal(instance.getLocal()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageLookupPolicyBuilder(ImageLookupPolicy instance,Validator validator){
            this.fluent = this; 
            this.withLocal(instance.getLocal()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageLookupPolicy build(){
            ImageLookupPolicy buildable = new ImageLookupPolicy(fluent.isLocal());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageLookupPolicyBuilder that = (ImageLookupPolicyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
