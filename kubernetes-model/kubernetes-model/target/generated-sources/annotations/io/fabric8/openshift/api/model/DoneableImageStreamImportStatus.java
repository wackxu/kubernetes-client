package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStreamImportStatus extends ImageStreamImportStatusFluentImpl<DoneableImageStreamImportStatus> implements Doneable<ImageStreamImportStatus>{

    private final ImageStreamImportStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStreamImportStatus,ImageStreamImportStatus> function;

    public DoneableImageStreamImportStatus(io.fabric8.kubernetes.api.builder.Function<ImageStreamImportStatus,ImageStreamImportStatus> function){
            super();this.builder=new ImageStreamImportStatusBuilder(this);this.function=function;
    }
    public DoneableImageStreamImportStatus(ImageStreamImportStatus item,io.fabric8.kubernetes.api.builder.Function<ImageStreamImportStatus,ImageStreamImportStatus> function){
            super(item);this.builder=new ImageStreamImportStatusBuilder(this, item);this.function=function;
    }
    public DoneableImageStreamImportStatus(ImageStreamImportStatus item){
            super(item);this.builder=new ImageStreamImportStatusBuilder(this, item);this.function=new Function<ImageStreamImportStatus, ImageStreamImportStatus>() {
    public ImageStreamImportStatus apply(ImageStreamImportStatus item) {
        return item;
    }
}
;
    }

    public ImageStreamImportStatus done(){
             return function.apply(builder.build());
    }




}
