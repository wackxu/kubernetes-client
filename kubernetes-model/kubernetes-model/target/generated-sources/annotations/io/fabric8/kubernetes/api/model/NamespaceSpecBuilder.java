package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamespaceSpecBuilder extends NamespaceSpecFluentImpl<NamespaceSpecBuilder> implements VisitableBuilder<NamespaceSpec,NamespaceSpecBuilder>{

    NamespaceSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamespaceSpecBuilder(){
            this(true);
    }
    public NamespaceSpecBuilder(Boolean validationEnabled){
            this(new NamespaceSpec(), validationEnabled);
    }
    public NamespaceSpecBuilder(NamespaceSpecFluent<?> fluent){
            this(fluent, true);
    }
    public NamespaceSpecBuilder(NamespaceSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NamespaceSpec(), validationEnabled);
    }
    public NamespaceSpecBuilder(NamespaceSpecFluent<?> fluent,NamespaceSpec instance){
            this(fluent, instance, true);
    }
    public NamespaceSpecBuilder(NamespaceSpecFluent<?> fluent,NamespaceSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFinalizers(instance.getFinalizers()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamespaceSpecBuilder(NamespaceSpec instance){
            this(instance,true);
    }
    public NamespaceSpecBuilder(NamespaceSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFinalizers(instance.getFinalizers()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamespaceSpecBuilder(Validator validator){
            this(new NamespaceSpec(), true);
    }
    public NamespaceSpecBuilder(NamespaceSpecFluent<?> fluent,NamespaceSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFinalizers(instance.getFinalizers()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamespaceSpecBuilder(NamespaceSpec instance,Validator validator){
            this.fluent = this; 
            this.withFinalizers(instance.getFinalizers()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NamespaceSpec build(){
            NamespaceSpec buildable = new NamespaceSpec(fluent.getFinalizers());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamespaceSpecBuilder that = (NamespaceSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
