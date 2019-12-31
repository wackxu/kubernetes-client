package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodSecurityPolicyListBuilder extends PodSecurityPolicyListFluentImpl<PodSecurityPolicyListBuilder> implements VisitableBuilder<PodSecurityPolicyList,PodSecurityPolicyListBuilder>{

    PodSecurityPolicyListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodSecurityPolicyListBuilder(){
            this(true);
    }
    public PodSecurityPolicyListBuilder(Boolean validationEnabled){
            this(new PodSecurityPolicyList(), validationEnabled);
    }
    public PodSecurityPolicyListBuilder(PodSecurityPolicyListFluent<?> fluent){
            this(fluent, true);
    }
    public PodSecurityPolicyListBuilder(PodSecurityPolicyListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodSecurityPolicyList(), validationEnabled);
    }
    public PodSecurityPolicyListBuilder(PodSecurityPolicyListFluent<?> fluent,PodSecurityPolicyList instance){
            this(fluent, instance, true);
    }
    public PodSecurityPolicyListBuilder(PodSecurityPolicyListFluent<?> fluent,PodSecurityPolicyList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSecurityPolicyListBuilder(PodSecurityPolicyList instance){
            this(instance,true);
    }
    public PodSecurityPolicyListBuilder(PodSecurityPolicyList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSecurityPolicyListBuilder(Validator validator){
            this(new PodSecurityPolicyList(), true);
    }
    public PodSecurityPolicyListBuilder(PodSecurityPolicyListFluent<?> fluent,PodSecurityPolicyList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodSecurityPolicyListBuilder(PodSecurityPolicyList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodSecurityPolicyList build(){
            PodSecurityPolicyList buildable = new PodSecurityPolicyList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodSecurityPolicyListBuilder that = (PodSecurityPolicyListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
