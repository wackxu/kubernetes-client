package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageSignatureBuilder extends ImageSignatureFluentImpl<ImageSignatureBuilder> implements VisitableBuilder<ImageSignature,ImageSignatureBuilder>{

    ImageSignatureFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageSignatureBuilder(){
            this(true);
    }
    public ImageSignatureBuilder(Boolean validationEnabled){
            this(new ImageSignature(), validationEnabled);
    }
    public ImageSignatureBuilder(ImageSignatureFluent<?> fluent){
            this(fluent, true);
    }
    public ImageSignatureBuilder(ImageSignatureFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ImageSignature(), validationEnabled);
    }
    public ImageSignatureBuilder(ImageSignatureFluent<?> fluent,ImageSignature instance){
            this(fluent, instance, true);
    }
    public ImageSignatureBuilder(ImageSignatureFluent<?> fluent,ImageSignature instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withContent(instance.getContent()); 
            fluent.withCreated(instance.getCreated()); 
            fluent.withImageIdentity(instance.getImageIdentity()); 
            fluent.withIssuedBy(instance.getIssuedBy()); 
            fluent.withIssuedTo(instance.getIssuedTo()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSignedClaims(instance.getSignedClaims()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageSignatureBuilder(ImageSignature instance){
            this(instance,true);
    }
    public ImageSignatureBuilder(ImageSignature instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withContent(instance.getContent()); 
            this.withCreated(instance.getCreated()); 
            this.withImageIdentity(instance.getImageIdentity()); 
            this.withIssuedBy(instance.getIssuedBy()); 
            this.withIssuedTo(instance.getIssuedTo()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSignedClaims(instance.getSignedClaims()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageSignatureBuilder(Validator validator){
            this(new ImageSignature(), true);
    }
    public ImageSignatureBuilder(ImageSignatureFluent<?> fluent,ImageSignature instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withContent(instance.getContent()); 
            fluent.withCreated(instance.getCreated()); 
            fluent.withImageIdentity(instance.getImageIdentity()); 
            fluent.withIssuedBy(instance.getIssuedBy()); 
            fluent.withIssuedTo(instance.getIssuedTo()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSignedClaims(instance.getSignedClaims()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageSignatureBuilder(ImageSignature instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withContent(instance.getContent()); 
            this.withCreated(instance.getCreated()); 
            this.withImageIdentity(instance.getImageIdentity()); 
            this.withIssuedBy(instance.getIssuedBy()); 
            this.withIssuedTo(instance.getIssuedTo()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSignedClaims(instance.getSignedClaims()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ImageSignature build(){
            ImageSignature buildable = new ImageSignature(fluent.getApiVersion(),fluent.getConditions(),fluent.getContent(),fluent.getCreated(),fluent.getImageIdentity(),fluent.getIssuedBy(),fluent.getIssuedTo(),fluent.getKind(),fluent.getMetadata(),fluent.getSignedClaims(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageSignatureBuilder that = (ImageSignatureBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
