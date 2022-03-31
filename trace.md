https://www.youtube.com/watch?v=XszpXoII9Sg

Issues 1 -
spring boot initializer spring boot 2.6.5 is not available -> switched to 2.6.4

(19:11) Different JPA Annotations
https://www.baeldung.com/jpa-strategies-when-set-primary-key
https://www.baeldung.com/jpa-unique-constraints
-> reference for joined entity
defining constraint in combination of columns in a table to achive composite key
https://www.baeldung.com/jpa-many-to-many
https://www.baeldung.com/jpa-join-column

(27:56) Understanding Repositories and their methods
test basic Repository & student( error with @Data NullPointException)

(38:51) @Embeddable and @Embedded
utilzed @Embedable( for seperate entity) and @Embedded (entity that is belong to another entity)  in order to store a seperate entity in a single database table, instead of creating seperate table 
@AttributeOverrides


(01:27:58) Cascade Types
https://www.baeldung.com/jpa-cascade-types

(01:30:08) Fetch Types
fetchType.lazy - unless specify to bring cascade entity from database it would excludes the other entity that has relationship. 
