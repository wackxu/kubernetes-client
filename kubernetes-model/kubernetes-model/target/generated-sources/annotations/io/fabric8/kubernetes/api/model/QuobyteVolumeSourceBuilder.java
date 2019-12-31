package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class QuobyteVolumeSourceBuilder extends QuobyteVolumeSourceFluentImpl<QuobyteVolumeSourceBuilder> implements VisitableBuilder<QuobyteVolumeSource,QuobyteVolumeSourceBuilder>{

    QuobyteVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public QuobyteVolumeSourceBuilder(){
            this(true);
    }
    public QuobyteVolumeSourceBuilder(Boolean validationEnabled){
            this(new QuobyteVolumeSource(), validationEnabled);
    }
    public QuobyteVolumeSourceBuilder(QuobyteVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public QuobyteVolumeSourceBuilder(QuobyteVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new QuobyteVolumeSource(), validationEnabled);
    }
    public QuobyteVolumeSourceBuilder(QuobyteVolumeSourceFluent<?> fluent,QuobyteVolumeSource instance){
            this(fluent, instance, true);
    }
    public QuobyteVolumeSourceBuilder(QuobyteVolumeSourceFluent<?> fluent,QuobyteVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGroup(instance.getGroup()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withRegistry(instance.getRegistry()); 
            fluent.withUser(instance.getUser()); 
            fluent.withVolume(instance.getVolume()); 
            this.validationEnabled = validationEnabled; 
    }
    public QuobyteVolumeSourceBuilder(QuobyteVolumeSource instance){
            this(instance,true);
    }
    public QuobyteVolumeSourceBuilder(QuobyteVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGroup(instance.getGroup()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withRegistry(instance.getRegistry()); 
            this.withUser(instance.getUser()); 
            this.withVolume(instance.getVolume()); 
            this.validationEnabled = validationEnabled; 
    }
    public QuobyteVolumeSourceBuilder(Validator validator){
            this(new QuobyteVolumeSource(), true);
    }
    public QuobyteVolumeSourceBuilder(QuobyteVolumeSourceFluent<?> fluent,QuobyteVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGroup(instance.getGroup()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withRegistry(instance.getRegistry()); 
            fluent.withUser(instance.getUser()); 
            fluent.withVolume(instance.getVolume()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public QuobyteVolumeSourceBuilder(QuobyteVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withGroup(instance.getGroup()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withRegistry(instance.getRegistry()); 
            this.withUser(instance.getUser()); 
            this.withVolume(instance.getVolume()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public QuobyteVolumeSource build(){
            QuobyteVolumeSource buildable = new QuobyteVolumeSource(fluent.getGroup(),fluent.isReadOnly(),fluent.getRegistry(),fluent.getUser(),fluent.getVolume());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            QuobyteVolumeSourceBuilder that = (QuobyteVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
