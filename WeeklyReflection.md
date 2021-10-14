###Week 5 & 6
10/13/21

Week 5 was the first week that I really began working on this project in earnest.
I did create an indie project repository prior to knowing what my project would be,
so I remade it with better suited names. Since then, I'm happy with the progress I've made.

I've caught up with some of the design documents, but have more to create. I think getting into the 
coding had given me a better ideas when I comes to design and planning.

Coding wise i think i've made good progress. I setup a mySQL database and schema. I also created three Daos representing the 
three tables in the database. In the future I do plan on increasing the number of columns in the hospital and procedure 
tables inorder to hold more data. For the time being, I've kept it simple in order to get it going.
I've also created some sample data for testing purposes. Log4J, Hibernate, and Lombok are all set up and working.

Biggest challenge was setting up the Many-to-Many relationship between Hospital and Procedure. The 
added challenge was that I have additional columns, not just the two foreign keys that would go into
the new associative table. I mostly followed the tutorial here: https://mkyong.com/tutorials/hibernate-tutorials/
in order to get it going but also googled when I had issues. Created a new entity class PriceId in order to
get the composite primary key for the Price table(associative table). 

Getting the dao tests to run took the longest.I initially had troubles because 'procedure' is a reserved
word in mySQL. When I figured that out, things went better. Getting the PriceDao test to run was challenging,
but eventually got a better handle on how to find entries based on a composite key. 


