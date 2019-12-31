package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IdentityListBuilder extends IdentityListFluentImpl<IdentityListBuilder> implements VisitableBuilder<IdentityList,IdentityListBuilder>{

    IdentityListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IdentityListBuilder(){
            this(true);
    }
    public IdentityListBuilder(Boolean validationEnabled){
            this(new IdentityList(), validationEnabled);
    }
    public IdentityListBuilder(IdentityListFluent<?> fluent){
            this(fluent, true);
    }
    public IdentityListBuilder(IdentityListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new IdentityList(), validationEnabled);
    }
    public IdentityListBuilder(IdentityListFluent<?> fluent,IdentityList instance){
            this(fluent, instance, true);
    }
    public IdentityListBuilder(IdentityListFluent<?> fluent,IdentityList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public IdentityListBuilder(IdentityList instance){
            this(instance,true);
    }
    public IdentityListBuilder(IdentityList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public IdentityListBuilder(Validator validator){
            this(new IdentityList(), true);
    }
    public IdentityListBuilder(IdentityListFluent<?> fluent,IdentityList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IdentityListBuilder(IdentityList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public IdentityList build(){
            IdentityList buildable = new IdentityList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IdentityListBuilder that = (IdentityListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
