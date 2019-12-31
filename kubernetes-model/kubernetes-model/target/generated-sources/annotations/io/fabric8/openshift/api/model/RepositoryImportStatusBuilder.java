package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RepositoryImportStatusBuilder extends RepositoryImportStatusFluentImpl<RepositoryImportStatusBuilder> implements VisitableBuilder<RepositoryImportStatus,RepositoryImportStatusBuilder>{

    RepositoryImportStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RepositoryImportStatusBuilder(){
            this(true);
    }
    public RepositoryImportStatusBuilder(Boolean validationEnabled){
            this(new RepositoryImportStatus(), validationEnabled);
    }
    public RepositoryImportStatusBuilder(RepositoryImportStatusFluent<?> fluent){
            this(fluent, true);
    }
    public RepositoryImportStatusBuilder(RepositoryImportStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RepositoryImportStatus(), validationEnabled);
    }
    public RepositoryImportStatusBuilder(RepositoryImportStatusFluent<?> fluent,RepositoryImportStatus instance){
            this(fluent, instance, true);
    }
    public RepositoryImportStatusBuilder(RepositoryImportStatusFluent<?> fluent,RepositoryImportStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAdditionalTags(instance.getAdditionalTags()); 
            fluent.withImages(instance.getImages()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public RepositoryImportStatusBuilder(RepositoryImportStatus instance){
            this(instance,true);
    }
    public RepositoryImportStatusBuilder(RepositoryImportStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAdditionalTags(instance.getAdditionalTags()); 
            this.withImages(instance.getImages()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public RepositoryImportStatusBuilder(Validator validator){
            this(new RepositoryImportStatus(), true);
    }
    public RepositoryImportStatusBuilder(RepositoryImportStatusFluent<?> fluent,RepositoryImportStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAdditionalTags(instance.getAdditionalTags()); 
            fluent.withImages(instance.getImages()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RepositoryImportStatusBuilder(RepositoryImportStatus instance,Validator validator){
            this.fluent = this; 
            this.withAdditionalTags(instance.getAdditionalTags()); 
            this.withImages(instance.getImages()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RepositoryImportStatus build(){
            RepositoryImportStatus buildable = new RepositoryImportStatus(fluent.getAdditionalTags(),fluent.getImages(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RepositoryImportStatusBuilder that = (RepositoryImportStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
