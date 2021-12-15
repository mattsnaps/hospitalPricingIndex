### Week - December 12th - 15th
The core aspects of the program are finished. Just finishing up some of the last touches before 
turning in. Did add more functionality to the user profile. There's still not much there but it's a starting point
and down the line can add more in later versions. I'm on vacation this week so had to transfer
my dev environment over to a mac and work remote. Haven't run into too big of issues.

### Week December 5th - 11th
Did quite a bit of work this week. Worked a lot on testing so when I created the jsp and servlets 
it was a little easier. Created most of the servlets and jsps that I think I'll need for the final project. 
Got the google api to work and print out. It works well and exited to use it. 

### Week Novemeber 28th - December 4th
Spent a lot of time reworking the daos and hibernate relationships. Just making sure how I have the code is
the best way. Make sure the mapping is good. The many-to-many relationship is weird and a little complex to 
code for. I redid some of it. Just did a lot of experimenting with hibernate, but I feel more comfortable 
now with how I have it. 

Decided to use a google api to fulfill api requirment. Going to use serpapi. Also spent quite a long time 
in mysql workbench trying to figure out how to normalize the large datasets that I plan on using. Wrote 
a sql script that should quickly normalize the data. Will probably copare 3 hospitals. 

### Week Novemeber 21st - 27th
Worked getting cognito to work on project and pushed the project up to AWS for the first time.
had some trouble figuring out how to create the necessary ssl security certificate on windows. 
but eventually figured it out and got everything to work. 

### Week 5 & 6
10/13/21

Week 5 was the first week that I really began working on this project in earnest.
I did create an indie project repository prior to knowing what my project would be,
so I remade it with better suited names. Since then, I'm happy with the progress I've made.

I've caught up with some design documents, but have more to finish. I think getting into the 
coding has given me a better idea about what the end result will be. Especially on the UI front.

Coding wise i think i've made good progress. I setup a mySQL database and schema. I also created three Daos representing the 
three tables in the database. In the future I do plan on increasing the number of columns in the hospital and procedure 
tables inorder to hold more data. For the time being, I've kept it simple in order to get it going.
I've also created some sample data for testing purposes. Log4J, Hibernate, and Lombok are all set up and working.

Biggest challenge was setting up the Many-to-Many relationship between Hospital and Procedure. The 
added challenge was that I have additional columns, not just the two foreign keys that would go into
the new associative table. I mostly followed the tutorial here: https://mkyong.com/tutorials/hibernate-tutorials/
but also googled when I had issues. Created a new entity class PriceId in order to
get the composite primary key for the Price table(associative table). 

Getting the dao tests to run took the longest.I initially had troubles because 'procedure' is a reserved
word in mySQL. When I figured that out, things went better. Getting the PriceDao test to run was challenging,
but eventually got a better handle on how to find entries based on a composite key. 


