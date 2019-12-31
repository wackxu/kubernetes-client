package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ListMetaBuilder extends ListMetaFluentImpl<ListMetaBuilder> implements VisitableBuilder<ListMeta,ListMetaBuilder>{

    ListMetaFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ListMetaBuilder(){
            this(true);
    }
    public ListMetaBuilder(Boolean validationEnabled){
            this(new ListMeta(), validationEnabled);
    }
    public ListMetaBuilder(ListMetaFluent<?> fluent){
            this(fluent, true);
    }
    public ListMetaBuilder(ListMetaFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ListMeta(), validationEnabled);
    }
    public ListMetaBuilder(ListMetaFluent<?> fluent,ListMeta instance){
            this(fluent, instance, true);
    }
    public ListMetaBuilder(ListMetaFluent<?> fluent,ListMeta instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withContinue(instance.getContinue()); 
            fluent.withResourceVersion(instance.getResourceVersion()); 
            fluent.withSelfLink(instance.getSelfLink()); 
            this.validationEnabled = validationEnabled; 
    }
    public ListMetaBuilder(ListMeta instance){
            this(instance,true);
    }
    public ListMetaBuilder(ListMeta instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withContinue(instance.getContinue()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withSelfLink(instance.getSelfLink()); 
            this.validationEnabled = validationEnabled; 
    }
    public ListMetaBuilder(Validator validator){
            this(new ListMeta(), true);
    }
    public ListMetaBuilder(ListMetaFluent<?> fluent,ListMeta instance,Validator validator){
            this.fluent = fluent; 
            fluent.withContinue(instance.getContinue()); 
            fluent.withResourceVersion(instance.getResourceVersion()); 
            fluent.withSelfLink(instance.getSelfLink()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ListMetaBuilder(ListMeta instance,Validator validator){
            this.fluent = this; 
            this.withContinue(instance.getContinue()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withSelfLink(instance.getSelfLink()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ListMeta build(){
            ListMeta buildable = new ListMeta(fluent.getContinue(),fluent.getResourceVersion(),fluent.getSelfLink());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ListMetaBuilder that = (ListMetaBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
