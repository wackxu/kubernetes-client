package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ImageBuilder extends ImageFluentImpl<ImageBuilder> implements VisitableBuilder<Image,ImageBuilder>{

    ImageFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ImageBuilder(){
            this(true);
    }
    public ImageBuilder(Boolean validationEnabled){
            this(new Image(), validationEnabled);
    }
    public ImageBuilder(ImageFluent<?> fluent){
            this(fluent, true);
    }
    public ImageBuilder(ImageFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Image(), validationEnabled);
    }
    public ImageBuilder(ImageFluent<?> fluent,Image instance){
            this(fluent, instance, true);
    }
    public ImageBuilder(ImageFluent<?> fluent,Image instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDockerImageConfig(instance.getDockerImageConfig()); 
            fluent.withDockerImageLayers(instance.getDockerImageLayers()); 
            fluent.withDockerImageManifest(instance.getDockerImageManifest()); 
            fluent.withDockerImageManifestMediaType(instance.getDockerImageManifestMediaType()); 
            fluent.withDockerImageMetadata(instance.getDockerImageMetadata()); 
            fluent.withDockerImageMetadataVersion(instance.getDockerImageMetadataVersion()); 
            fluent.withDockerImageReference(instance.getDockerImageReference()); 
            fluent.withDockerImageSignatures(instance.getDockerImageSignatures()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSignatures(instance.getSignatures()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageBuilder(Image instance){
            this(instance,true);
    }
    public ImageBuilder(Image instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDockerImageConfig(instance.getDockerImageConfig()); 
            this.withDockerImageLayers(instance.getDockerImageLayers()); 
            this.withDockerImageManifest(instance.getDockerImageManifest()); 
            this.withDockerImageManifestMediaType(instance.getDockerImageManifestMediaType()); 
            this.withDockerImageMetadata(instance.getDockerImageMetadata()); 
            this.withDockerImageMetadataVersion(instance.getDockerImageMetadataVersion()); 
            this.withDockerImageReference(instance.getDockerImageReference()); 
            this.withDockerImageSignatures(instance.getDockerImageSignatures()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSignatures(instance.getSignatures()); 
            this.validationEnabled = validationEnabled; 
    }
    public ImageBuilder(Validator validator){
            this(new Image(), true);
    }
    public ImageBuilder(ImageFluent<?> fluent,Image instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDockerImageConfig(instance.getDockerImageConfig()); 
            fluent.withDockerImageLayers(instance.getDockerImageLayers()); 
            fluent.withDockerImageManifest(instance.getDockerImageManifest()); 
            fluent.withDockerImageManifestMediaType(instance.getDockerImageManifestMediaType()); 
            fluent.withDockerImageMetadata(instance.getDockerImageMetadata()); 
            fluent.withDockerImageMetadataVersion(instance.getDockerImageMetadataVersion()); 
            fluent.withDockerImageReference(instance.getDockerImageReference()); 
            fluent.withDockerImageSignatures(instance.getDockerImageSignatures()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSignatures(instance.getSignatures()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ImageBuilder(Image instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDockerImageConfig(instance.getDockerImageConfig()); 
            this.withDockerImageLayers(instance.getDockerImageLayers()); 
            this.withDockerImageManifest(instance.getDockerImageManifest()); 
            this.withDockerImageManifestMediaType(instance.getDockerImageManifestMediaType()); 
            this.withDockerImageMetadata(instance.getDockerImageMetadata()); 
            this.withDockerImageMetadataVersion(instance.getDockerImageMetadataVersion()); 
            this.withDockerImageReference(instance.getDockerImageReference()); 
            this.withDockerImageSignatures(instance.getDockerImageSignatures()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSignatures(instance.getSignatures()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Image build(){
            Image buildable = new Image(fluent.getApiVersion(),fluent.getDockerImageConfig(),fluent.getDockerImageLayers(),fluent.getDockerImageManifest(),fluent.getDockerImageManifestMediaType(),fluent.getDockerImageMetadata(),fluent.getDockerImageMetadataVersion(),fluent.getDockerImageReference(),fluent.getDockerImageSignatures(),fluent.getKind(),fluent.getMetadata(),fluent.getSignatures());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageBuilder that = (ImageBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
