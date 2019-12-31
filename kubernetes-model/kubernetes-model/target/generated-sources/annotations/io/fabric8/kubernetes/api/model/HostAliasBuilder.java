package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HostAliasBuilder extends HostAliasFluentImpl<HostAliasBuilder> implements VisitableBuilder<HostAlias,HostAliasBuilder>{

    HostAliasFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HostAliasBuilder(){
            this(true);
    }
    public HostAliasBuilder(Boolean validationEnabled){
            this(new HostAlias(), validationEnabled);
    }
    public HostAliasBuilder(HostAliasFluent<?> fluent){
            this(fluent, true);
    }
    public HostAliasBuilder(HostAliasFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HostAlias(), validationEnabled);
    }
    public HostAliasBuilder(HostAliasFluent<?> fluent,HostAlias instance){
            this(fluent, instance, true);
    }
    public HostAliasBuilder(HostAliasFluent<?> fluent,HostAlias instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHostnames(instance.getHostnames()); 
            fluent.withIp(instance.getIp()); 
            this.validationEnabled = validationEnabled; 
    }
    public HostAliasBuilder(HostAlias instance){
            this(instance,true);
    }
    public HostAliasBuilder(HostAlias instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHostnames(instance.getHostnames()); 
            this.withIp(instance.getIp()); 
            this.validationEnabled = validationEnabled; 
    }
    public HostAliasBuilder(Validator validator){
            this(new HostAlias(), true);
    }
    public HostAliasBuilder(HostAliasFluent<?> fluent,HostAlias instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHostnames(instance.getHostnames()); 
            fluent.withIp(instance.getIp()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HostAliasBuilder(HostAlias instance,Validator validator){
            this.fluent = this; 
            this.withHostnames(instance.getHostnames()); 
            this.withIp(instance.getIp()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HostAlias build(){
            HostAlias buildable = new HostAlias(fluent.getHostnames(),fluent.getIp());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HostAliasBuilder that = (HostAliasBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
