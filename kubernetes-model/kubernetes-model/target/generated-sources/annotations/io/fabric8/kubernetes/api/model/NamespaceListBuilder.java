package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamespaceListBuilder extends NamespaceListFluentImpl<NamespaceListBuilder> implements VisitableBuilder<NamespaceList,NamespaceListBuilder>{

    NamespaceListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamespaceListBuilder(){
            this(true);
    }
    public NamespaceListBuilder(Boolean validationEnabled){
            this(new NamespaceList(), validationEnabled);
    }
    public NamespaceListBuilder(NamespaceListFluent<?> fluent){
            this(fluent, true);
    }
    public NamespaceListBuilder(NamespaceListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NamespaceList(), validationEnabled);
    }
    public NamespaceListBuilder(NamespaceListFluent<?> fluent,NamespaceList instance){
            this(fluent, instance, true);
    }
    public NamespaceListBuilder(NamespaceListFluent<?> fluent,NamespaceList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamespaceListBuilder(NamespaceList instance){
            this(instance,true);
    }
    public NamespaceListBuilder(NamespaceList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamespaceListBuilder(Validator validator){
            this(new NamespaceList(), true);
    }
    public NamespaceListBuilder(NamespaceListFluent<?> fluent,NamespaceList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamespaceListBuilder(NamespaceList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NamespaceList build(){
            NamespaceList buildable = new NamespaceList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamespaceListBuilder that = (NamespaceListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
