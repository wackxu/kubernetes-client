package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamedAuthInfoBuilder extends NamedAuthInfoFluentImpl<NamedAuthInfoBuilder> implements VisitableBuilder<NamedAuthInfo,NamedAuthInfoBuilder>{

    NamedAuthInfoFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamedAuthInfoBuilder(){
            this(true);
    }
    public NamedAuthInfoBuilder(Boolean validationEnabled){
            this(new NamedAuthInfo(), validationEnabled);
    }
    public NamedAuthInfoBuilder(NamedAuthInfoFluent<?> fluent){
            this(fluent, true);
    }
    public NamedAuthInfoBuilder(NamedAuthInfoFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NamedAuthInfo(), validationEnabled);
    }
    public NamedAuthInfoBuilder(NamedAuthInfoFluent<?> fluent,NamedAuthInfo instance){
            this(fluent, instance, true);
    }
    public NamedAuthInfoBuilder(NamedAuthInfoFluent<?> fluent,NamedAuthInfo instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedAuthInfoBuilder(NamedAuthInfo instance){
            this(instance,true);
    }
    public NamedAuthInfoBuilder(NamedAuthInfo instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedAuthInfoBuilder(Validator validator){
            this(new NamedAuthInfo(), true);
    }
    public NamedAuthInfoBuilder(NamedAuthInfoFluent<?> fluent,NamedAuthInfo instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withUser(instance.getUser()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamedAuthInfoBuilder(NamedAuthInfo instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withUser(instance.getUser()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NamedAuthInfo build(){
            NamedAuthInfo buildable = new NamedAuthInfo(fluent.getName(),fluent.getUser());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedAuthInfoBuilder that = (NamedAuthInfoBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
