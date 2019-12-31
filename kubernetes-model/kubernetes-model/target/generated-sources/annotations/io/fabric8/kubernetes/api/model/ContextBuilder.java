package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContextBuilder extends ContextFluentImpl<ContextBuilder> implements VisitableBuilder<Context,ContextBuilder>{

    ContextFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContextBuilder(){
            this(true);
    }
    public ContextBuilder(Boolean validationEnabled){
            this(new Context(), validationEnabled);
    }
    public ContextBuilder(ContextFluent<?> fluent){
            this(fluent, true);
    }
    public ContextBuilder(ContextFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Context(), validationEnabled);
    }
    public ContextBuilder(ContextFluent<?> fluent,Context instance){
            this(fluent, instance, true);
    }
    public ContextBuilder(ContextFluent<?> fluent,Context instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCluster(instance.getCluster()); 
            fluent.withExtensions(instance.getExtensions()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContextBuilder(Context instance){
            this(instance,true);
    }
    public ContextBuilder(Context instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCluster(instance.getCluster()); 
            this.withExtensions(instance.getExtensions()); 
            this.withNamespace(instance.getNamespace()); 
            this.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContextBuilder(Validator validator){
            this(new Context(), true);
    }
    public ContextBuilder(ContextFluent<?> fluent,Context instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCluster(instance.getCluster()); 
            fluent.withExtensions(instance.getExtensions()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withUser(instance.getUser()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContextBuilder(Context instance,Validator validator){
            this.fluent = this; 
            this.withCluster(instance.getCluster()); 
            this.withExtensions(instance.getExtensions()); 
            this.withNamespace(instance.getNamespace()); 
            this.withUser(instance.getUser()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Context build(){
            Context buildable = new Context(fluent.getCluster(),fluent.getExtensions(),fluent.getNamespace(),fluent.getUser());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContextBuilder that = (ContextBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
