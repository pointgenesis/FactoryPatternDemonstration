# FactoryPatternDemonstration
Basic demonstration of how to return an object via a factory pattern.

## com.travis.collaboration.factory

### BasePersistor.java

    //TODO:

### EncodedTextPersistor.java

    //TODO:

### PersistorFactory.java

    //TODO:

### PersistorType.java

    //TODO:

### PlainTextPersistor.java

    //TODO:

## Test code under test.java folder

    //TODO:
    
## JUnit Console Output
    21:09:45.634 [main] INFO  com.travis.collaboration.factory.BasePersistor - Constructed an EncodedTextPersistor object.
    21:09:45.663 [main] INFO  com.travis.collaboration.factory.BasePersistor - value: SGVsbG8gdGhlcmU= was saved successfully to filename: ./src/test/resources/encodedtext.file.
    21:09:45.664 [main] INFO  com.travis.collaboration.factory.BasePersistor - Constructed a PlainTextPersistor
    21:09:45.666 [main] INFO  com.travis.collaboration.factory.BasePersistor - value: Hello there was saved successfully to filename: ./src/test/resources/plaintext.file.
    21:09:45.666 [main] INFO  com.travis.collaboration.factory.BasePersistor - Constructed a PlainTextPersistor
    21:09:45.666 [main] INFO  com.travis.collaboration.factory.BasePersistor - Constructed an EncodedTextPersistor object.
