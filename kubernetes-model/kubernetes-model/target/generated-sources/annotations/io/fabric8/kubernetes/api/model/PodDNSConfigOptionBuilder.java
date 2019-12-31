package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodDNSConfigOptionBuilder extends PodDNSConfigOptionFluentImpl<PodDNSConfigOptionBuilder> implements VisitableBuilder<PodDNSConfigOption,PodDNSConfigOptionBuilder>{

    PodDNSConfigOptionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodDNSConfigOptionBuilder(){
            this(true);
    }
    public PodDNSConfigOptionBuilder(Boolean validationEnabled){
            this(new PodDNSConfigOption(), validationEnabled);
    }
    public PodDNSConfigOptionBuilder(PodDNSConfigOptionFluent<?> fluent){
            this(fluent, true);
    }
    public PodDNSConfigOptionBuilder(PodDNSConfigOptionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodDNSConfigOption(), validationEnabled);
    }
    public PodDNSConfigOptionBuilder(PodDNSConfigOptionFluent<?> fluent,PodDNSConfigOption instance){
            this(fluent, instance, true);
    }
    public PodDNSConfigOptionBuilder(PodDNSConfigOptionFluent<?> fluent,PodDNSConfigOption instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDNSConfigOptionBuilder(PodDNSConfigOption instance){
            this(instance,true);
    }
    public PodDNSConfigOptionBuilder(PodDNSConfigOption instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDNSConfigOptionBuilder(Validator validator){
            this(new PodDNSConfigOption(), true);
    }
    public PodDNSConfigOptionBuilder(PodDNSConfigOptionFluent<?> fluent,PodDNSConfigOption instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodDNSConfigOptionBuilder(PodDNSConfigOption instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodDNSConfigOption build(){
            PodDNSConfigOption buildable = new PodDNSConfigOption(fluent.getName(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDNSConfigOptionBuilder that = (PodDNSConfigOptionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
