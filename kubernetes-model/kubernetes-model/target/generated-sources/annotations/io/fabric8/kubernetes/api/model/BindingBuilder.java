package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BindingBuilder extends BindingFluentImpl<BindingBuilder> implements VisitableBuilder<Binding,BindingBuilder>{

    BindingFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BindingBuilder(){
            this(true);
    }
    public BindingBuilder(Boolean validationEnabled){
            this(new Binding(), validationEnabled);
    }
    public BindingBuilder(BindingFluent<?> fluent){
            this(fluent, true);
    }
    public BindingBuilder(BindingFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Binding(), validationEnabled);
    }
    public BindingBuilder(BindingFluent<?> fluent,Binding instance){
            this(fluent, instance, true);
    }
    public BindingBuilder(BindingFluent<?> fluent,Binding instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withTarget(instance.getTarget()); 
            this.validationEnabled = validationEnabled; 
    }
    public BindingBuilder(Binding instance){
            this(instance,true);
    }
    public BindingBuilder(Binding instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withTarget(instance.getTarget()); 
            this.validationEnabled = validationEnabled; 
    }
    public BindingBuilder(Validator validator){
            this(new Binding(), true);
    }
    public BindingBuilder(BindingFluent<?> fluent,Binding instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withTarget(instance.getTarget()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BindingBuilder(Binding instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withTarget(instance.getTarget()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Binding build(){
            Binding buildable = new Binding(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getTarget());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BindingBuilder that = (BindingBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
