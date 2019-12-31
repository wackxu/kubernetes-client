package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class MutatingWebhookConfigurationListBuilder extends MutatingWebhookConfigurationListFluentImpl<MutatingWebhookConfigurationListBuilder> implements VisitableBuilder<MutatingWebhookConfigurationList,MutatingWebhookConfigurationListBuilder>{

    MutatingWebhookConfigurationListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public MutatingWebhookConfigurationListBuilder(){
            this(true);
    }
    public MutatingWebhookConfigurationListBuilder(Boolean validationEnabled){
            this(new MutatingWebhookConfigurationList(), validationEnabled);
    }
    public MutatingWebhookConfigurationListBuilder(MutatingWebhookConfigurationListFluent<?> fluent){
            this(fluent, true);
    }
    public MutatingWebhookConfigurationListBuilder(MutatingWebhookConfigurationListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new MutatingWebhookConfigurationList(), validationEnabled);
    }
    public MutatingWebhookConfigurationListBuilder(MutatingWebhookConfigurationListFluent<?> fluent,MutatingWebhookConfigurationList instance){
            this(fluent, instance, true);
    }
    public MutatingWebhookConfigurationListBuilder(MutatingWebhookConfigurationListFluent<?> fluent,MutatingWebhookConfigurationList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public MutatingWebhookConfigurationListBuilder(MutatingWebhookConfigurationList instance){
            this(instance,true);
    }
    public MutatingWebhookConfigurationListBuilder(MutatingWebhookConfigurationList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public MutatingWebhookConfigurationListBuilder(Validator validator){
            this(new MutatingWebhookConfigurationList(), true);
    }
    public MutatingWebhookConfigurationListBuilder(MutatingWebhookConfigurationListFluent<?> fluent,MutatingWebhookConfigurationList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public MutatingWebhookConfigurationListBuilder(MutatingWebhookConfigurationList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public MutatingWebhookConfigurationList build(){
            MutatingWebhookConfigurationList buildable = new MutatingWebhookConfigurationList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MutatingWebhookConfigurationListBuilder that = (MutatingWebhookConfigurationListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
