package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageImportStatus extends ImageImportStatusFluentImpl<DoneableImageImportStatus> implements Doneable<ImageImportStatus>{

    private final ImageImportStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageImportStatus,ImageImportStatus> function;

    public DoneableImageImportStatus(io.fabric8.kubernetes.api.builder.Function<ImageImportStatus,ImageImportStatus> function){
            super();this.builder=new ImageImportStatusBuilder(this);this.function=function;
    }
    public DoneableImageImportStatus(ImageImportStatus item,io.fabric8.kubernetes.api.builder.Function<ImageImportStatus,ImageImportStatus> function){
            super(item);this.builder=new ImageImportStatusBuilder(this, item);this.function=function;
    }
    public DoneableImageImportStatus(ImageImportStatus item){
            super(item);this.builder=new ImageImportStatusBuilder(this, item);this.function=new Function<ImageImportStatus, ImageImportStatus>() {
    public ImageImportStatus apply(ImageImportStatus item) {
        return item;
    }
}
;
    }

    public ImageImportStatus done(){
             return function.apply(builder.build());
    }




}
