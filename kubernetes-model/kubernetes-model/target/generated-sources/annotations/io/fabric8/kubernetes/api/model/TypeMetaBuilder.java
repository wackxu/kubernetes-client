package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TypeMetaBuilder extends TypeMetaFluentImpl<TypeMetaBuilder> implements VisitableBuilder<TypeMeta,TypeMetaBuilder>{

    TypeMetaFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TypeMetaBuilder(){
            this(true);
    }
    public TypeMetaBuilder(Boolean validationEnabled){
            this(new TypeMeta(), validationEnabled);
    }
    public TypeMetaBuilder(TypeMetaFluent<?> fluent){
            this(fluent, true);
    }
    public TypeMetaBuilder(TypeMetaFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TypeMeta(), validationEnabled);
    }
    public TypeMetaBuilder(TypeMetaFluent<?> fluent,TypeMeta instance){
            this(fluent, instance, true);
    }
    public TypeMetaBuilder(TypeMetaFluent<?> fluent,TypeMeta instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            this.validationEnabled = validationEnabled; 
    }
    public TypeMetaBuilder(TypeMeta instance){
            this(instance,true);
    }
    public TypeMetaBuilder(TypeMeta instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.validationEnabled = validationEnabled; 
    }
    public TypeMetaBuilder(Validator validator){
            this(new TypeMeta(), true);
    }
    public TypeMetaBuilder(TypeMetaFluent<?> fluent,TypeMeta instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TypeMetaBuilder(TypeMeta instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TypeMeta build(){
            TypeMeta buildable = new TypeMeta(fluent.getApiVersion(),fluent.getKind());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TypeMetaBuilder that = (TypeMetaBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
