package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BitbucketWebHookCauseBuilder extends BitbucketWebHookCauseFluentImpl<BitbucketWebHookCauseBuilder> implements VisitableBuilder<BitbucketWebHookCause,BitbucketWebHookCauseBuilder>{

    BitbucketWebHookCauseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BitbucketWebHookCauseBuilder(){
            this(true);
    }
    public BitbucketWebHookCauseBuilder(Boolean validationEnabled){
            this(new BitbucketWebHookCause(), validationEnabled);
    }
    public BitbucketWebHookCauseBuilder(BitbucketWebHookCauseFluent<?> fluent){
            this(fluent, true);
    }
    public BitbucketWebHookCauseBuilder(BitbucketWebHookCauseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BitbucketWebHookCause(), validationEnabled);
    }
    public BitbucketWebHookCauseBuilder(BitbucketWebHookCauseFluent<?> fluent,BitbucketWebHookCause instance){
            this(fluent, instance, true);
    }
    public BitbucketWebHookCauseBuilder(BitbucketWebHookCauseFluent<?> fluent,BitbucketWebHookCause instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public BitbucketWebHookCauseBuilder(BitbucketWebHookCause instance){
            this(instance,true);
    }
    public BitbucketWebHookCauseBuilder(BitbucketWebHookCause instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public BitbucketWebHookCauseBuilder(Validator validator){
            this(new BitbucketWebHookCause(), true);
    }
    public BitbucketWebHookCauseBuilder(BitbucketWebHookCauseFluent<?> fluent,BitbucketWebHookCause instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSecret(instance.getSecret()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BitbucketWebHookCauseBuilder(BitbucketWebHookCause instance,Validator validator){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BitbucketWebHookCause build(){
            BitbucketWebHookCause buildable = new BitbucketWebHookCause(fluent.getRevision(),fluent.getSecret());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BitbucketWebHookCauseBuilder that = (BitbucketWebHookCauseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
