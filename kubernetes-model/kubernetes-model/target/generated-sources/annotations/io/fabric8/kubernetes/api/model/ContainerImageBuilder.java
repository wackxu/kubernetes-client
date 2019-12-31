package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContainerImageBuilder extends ContainerImageFluentImpl<ContainerImageBuilder> implements VisitableBuilder<ContainerImage,ContainerImageBuilder>{

    ContainerImageFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContainerImageBuilder(){
            this(true);
    }
    public ContainerImageBuilder(Boolean validationEnabled){
            this(new ContainerImage(), validationEnabled);
    }
    public ContainerImageBuilder(ContainerImageFluent<?> fluent){
            this(fluent, true);
    }
    public ContainerImageBuilder(ContainerImageFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ContainerImage(), validationEnabled);
    }
    public ContainerImageBuilder(ContainerImageFluent<?> fluent,ContainerImage instance){
            this(fluent, instance, true);
    }
    public ContainerImageBuilder(ContainerImageFluent<?> fluent,ContainerImage instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withNames(instance.getNames()); 
            fluent.withSizeBytes(instance.getSizeBytes()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerImageBuilder(ContainerImage instance){
            this(instance,true);
    }
    public ContainerImageBuilder(ContainerImage instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withNames(instance.getNames()); 
            this.withSizeBytes(instance.getSizeBytes()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerImageBuilder(Validator validator){
            this(new ContainerImage(), true);
    }
    public ContainerImageBuilder(ContainerImageFluent<?> fluent,ContainerImage instance,Validator validator){
            this.fluent = fluent; 
            fluent.withNames(instance.getNames()); 
            fluent.withSizeBytes(instance.getSizeBytes()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContainerImageBuilder(ContainerImage instance,Validator validator){
            this.fluent = this; 
            this.withNames(instance.getNames()); 
            this.withSizeBytes(instance.getSizeBytes()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ContainerImage build(){
            ContainerImage buildable = new ContainerImage(fluent.getNames(),fluent.getSizeBytes());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerImageBuilder that = (ContainerImageBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
