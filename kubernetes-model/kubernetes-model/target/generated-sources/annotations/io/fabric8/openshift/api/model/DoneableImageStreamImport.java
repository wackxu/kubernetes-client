package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStreamImport extends ImageStreamImportFluentImpl<DoneableImageStreamImport> implements Doneable<ImageStreamImport>{

    private final ImageStreamImportBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStreamImport,ImageStreamImport> function;

    public DoneableImageStreamImport(io.fabric8.kubernetes.api.builder.Function<ImageStreamImport,ImageStreamImport> function){
            super();this.builder=new ImageStreamImportBuilder(this);this.function=function;
    }
    public DoneableImageStreamImport(ImageStreamImport item,io.fabric8.kubernetes.api.builder.Function<ImageStreamImport,ImageStreamImport> function){
            super(item);this.builder=new ImageStreamImportBuilder(this, item);this.function=function;
    }
    public DoneableImageStreamImport(ImageStreamImport item){
            super(item);this.builder=new ImageStreamImportBuilder(this, item);this.function=new Function<ImageStreamImport, ImageStreamImport>() {
    public ImageStreamImport apply(ImageStreamImport item) {
        return item;
    }
}
;
    }

    public ImageStreamImport done(){
             return function.apply(builder.build());
    }




}
