package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TemplateListBuilder extends TemplateListFluentImpl<TemplateListBuilder> implements VisitableBuilder<TemplateList,TemplateListBuilder>{

    TemplateListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TemplateListBuilder(){
            this(true);
    }
    public TemplateListBuilder(Boolean validationEnabled){
            this(new TemplateList(), validationEnabled);
    }
    public TemplateListBuilder(TemplateListFluent<?> fluent){
            this(fluent, true);
    }
    public TemplateListBuilder(TemplateListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TemplateList(), validationEnabled);
    }
    public TemplateListBuilder(TemplateListFluent<?> fluent,TemplateList instance){
            this(fluent, instance, true);
    }
    public TemplateListBuilder(TemplateListFluent<?> fluent,TemplateList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public TemplateListBuilder(TemplateList instance){
            this(instance,true);
    }
    public TemplateListBuilder(TemplateList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public TemplateListBuilder(Validator validator){
            this(new TemplateList(), true);
    }
    public TemplateListBuilder(TemplateListFluent<?> fluent,TemplateList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TemplateListBuilder(TemplateList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TemplateList build(){
            TemplateList buildable = new TemplateList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TemplateListBuilder that = (TemplateListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
