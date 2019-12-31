package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IngressListBuilder extends IngressListFluentImpl<IngressListBuilder> implements VisitableBuilder<IngressList,IngressListBuilder>{

    IngressListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IngressListBuilder(){
            this(true);
    }
    public IngressListBuilder(Boolean validationEnabled){
            this(new IngressList(), validationEnabled);
    }
    public IngressListBuilder(IngressListFluent<?> fluent){
            this(fluent, true);
    }
    public IngressListBuilder(IngressListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IngressList(), validationEnabled);
    }
    public IngressListBuilder(IngressListFluent<?> fluent,IngressList instance){
            this(fluent, instance, true);
    }
    public IngressListBuilder(IngressListFluent<?> fluent,IngressList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressListBuilder(IngressList instance){
            this(instance,true);
    }
    public IngressListBuilder(IngressList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public IngressListBuilder(Validator validator){
            this(new IngressList(), true);
    }
    public IngressListBuilder(IngressListFluent<?> fluent,IngressList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IngressListBuilder(IngressList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IngressList build(){
            IngressList buildable = new IngressList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressListBuilder that = (IngressListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
