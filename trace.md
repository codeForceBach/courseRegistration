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
https://www.baeldung.com/hibernate-lazy-eager-loading
fetchType.lazy - unless specify to bring cascade entity from database it would excludes the other entity that has relationship. 

(01:33:01) Uni & Bi directional relationship
when fetching an entity(course) we also want to fetch other entity that has a relationship (such as courseMaterial) as well.
to achive that set bi directional relationship to the entity(course) since only courseMaterial defined relationship with course.
instanciate courseMaterial instance in course class,
set @OneToOne with mappedby = [course]

(01:37:24) JPA One-To-Many Relationship
add teacher entity to explain one(teacher) to many(course) relationship.
in teacher entity, establishes @OneToMany relationship with course by 
adding @JoinColumn links between teacher and course by teacher_id and references the teacherId

(01:50:08) JPA Many-To-One Relationship
redefined relationship from Teacher with @OneToMany to Course 
instead establish @ManyToOne relationship from Course to Teacher
https://thorben-janssen.com/best-practices-many-one-one-many-associations-mappings/
https://www.coderscampus.com/hibernate-manytoone-unidirectional-tutorial/


(02:07:05) JPA Many-To-Many Relationship
ran into error for findAllPageNationCourseTest()
org.hibernate.LazyInitializationException: failed to lazily initialize a collection of role: com.richardP.springJpa.courceRegistration.entities.Course.students, could not initialize proxy - no Session
find reference that explain the cause but not able to fix it.
https://www.baeldung.com/hibernate-initialize-proxy-exception
Otherwise the new @ManyToMany works.

Moving forward
complete all the repository and service layer with complete code and test classes to validate all the method.
expend with front-End React application to make full featured application.

