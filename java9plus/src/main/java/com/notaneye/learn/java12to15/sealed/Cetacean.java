package com.notaneye.learn.java12to15.sealed;


/**
 * Cetacean is also {@code sealed}, and so declares its own set of permitted
 * extenders.
 */
public sealed class Cetacean implements Mammal permits BelugaWhale, BottleNoseDolphin {

}
