Which Hibernate FetchMode should I use?
(cf. https://www.solidsyntax.be/2013/10/17/fetching-collections-hibernate/)

Which FetchMode to use depends heavily on the application, environment and typical usage. The following guideline should be seen as a rough indication of where to start. Try to play with the setting to see what works best in your application / environment:

FetchMode SELECT
This is best to use when we want faster response on accessing single entity.
It loads additional data only when its required.

BatchSize
BatchSize is useful when have a fixed set of data.
Example : When we have a batch processing of say 10 Users at a time.
BatchSize of 10 will drastically reduces the number of queries required.

FetchMode JOIN
In this case, we know that data will be loaded even before we use it but it creates a least number of queries.
Sometime Single Join is faster than multiple Selects but Joining will not be good choice if it involves too much of data.
We can prefer this mode whenever we have less data in the collections.
It will be faster while accessing the collections as its already loaded everything in one shot.

FetchMode SUBSELECT
If you’ve got an entity of which you know that there aren’t that many of them, and almost all of them are in the session, then SUBSELECT should be a good choice. Just keep in mind that all collections are fetched, even if the parent is not in the session. A SUBSELECT when having a single Customer in session while there are 1000+ in the database will be wasteful.