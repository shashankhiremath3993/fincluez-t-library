package com.profinch.fincluez.finclueztlibrary.transformer;

import com.profinch.fincluez.finclueztlibrary.entities.martEntities.TransformationQueue;

public interface TransformerInterface {

    public TransformerOutputModel performTransformation(TransformationQueue transformationQueue);
}
