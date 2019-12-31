package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodDNSConfigBuilder extends PodDNSConfigFluentImpl<PodDNSConfigBuilder> implements VisitableBuilder<PodDNSConfig,PodDNSConfigBuilder>{

    PodDNSConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodDNSConfigBuilder(){
            this(true);
    }
    public PodDNSConfigBuilder(Boolean validationEnabled){
            this(new PodDNSConfig(), validationEnabled);
    }
    public PodDNSConfigBuilder(PodDNSConfigFluent<?> fluent){
            this(fluent, true);
    }
    public PodDNSConfigBuilder(PodDNSConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodDNSConfig(), validationEnabled);
    }
    public PodDNSConfigBuilder(PodDNSConfigFluent<?> fluent,PodDNSConfig instance){
            this(fluent, instance, true);
    }
    public PodDNSConfigBuilder(PodDNSConfigFluent<?> fluent,PodDNSConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withNameservers(instance.getNameservers()); 
            fluent.withOptions(instance.getOptions()); 
            fluent.withSearches(instance.getSearches()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDNSConfigBuilder(PodDNSConfig instance){
            this(instance,true);
    }
    public PodDNSConfigBuilder(PodDNSConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withNameservers(instance.getNameservers()); 
            this.withOptions(instance.getOptions()); 
            this.withSearches(instance.getSearches()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDNSConfigBuilder(Validator validator){
            this(new PodDNSConfig(), true);
    }
    public PodDNSConfigBuilder(PodDNSConfigFluent<?> fluent,PodDNSConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withNameservers(instance.getNameservers()); 
            fluent.withOptions(instance.getOptions()); 
            fluent.withSearches(instance.getSearches()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodDNSConfigBuilder(PodDNSConfig instance,Validator validator){
            this.fluent = this; 
            this.withNameservers(instance.getNameservers()); 
            this.withOptions(instance.getOptions()); 
            this.withSearches(instance.getSearches()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodDNSConfig build(){
            PodDNSConfig buildable = new PodDNSConfig(fluent.getNameservers(),fluent.getOptions(),fluent.getSearches());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDNSConfigBuilder that = (PodDNSConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
