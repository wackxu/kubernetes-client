package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamespaceBuilder extends NamespaceFluentImpl<NamespaceBuilder> implements VisitableBuilder<Namespace,NamespaceBuilder>{

    NamespaceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamespaceBuilder(){
            this(true);
    }
    public NamespaceBuilder(Boolean validationEnabled){
            this(new Namespace(), validationEnabled);
    }
    public NamespaceBuilder(NamespaceFluent<?> fluent){
            this(fluent, true);
    }
    public NamespaceBuilder(NamespaceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Namespace(), validationEnabled);
    }
    public NamespaceBuilder(NamespaceFluent<?> fluent,Namespace instance){
            this(fluent, instance, true);
    }
    public NamespaceBuilder(NamespaceFluent<?> fluent,Namespace instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamespaceBuilder(Namespace instance){
            this(instance,true);
    }
    public NamespaceBuilder(Namespace instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamespaceBuilder(Validator validator){
            this(new Namespace(), true);
    }
    public NamespaceBuilder(NamespaceFluent<?> fluent,Namespace instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamespaceBuilder(Namespace instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Namespace build(){
            Namespace buildable = new Namespace(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamespaceBuilder that = (NamespaceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
