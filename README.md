# Libre-Cal



**Mission statement**

We yearn to provide an open source alternative to current calender applications while keeping the open source comminty great always.


**Features**
- Add an event
- delete an event 
- Change an event
- Reminder


**Installation and Build Scripts**

Please read the [installation and build scripts](https://github.com/qariane/Libre-Cal/wiki/Installation-and-Build-Scripts) located in our wiki.

**Testing**

Please read [Testing](https://github.com/qariane/Libre-Cal/wiki/TESTING) located in our wiki for more details.


**License**

This project is licensed under the GPL license  please read [license.md](https://github.com/qariane/Libre-Cal/blob/master/LICENSE.md)  for details.


**Contribution**

Please read [CONTRIBUTING.md](https://github.com/qariane/Libre-Cal/blob/master/contribution.md) for details on our code of conduct, and the process for submitting pull requests to us.


**FAQS**

For any questions please read our [FAQS](https://github.com/qariane/Libre-Cal/wiki/FAQS) located in our wiki.


**IRC Channel**: #LibreCalendar 

**Code Documentation**:
// THis program is used to build and create the Libre Cal Application //

/* This class is intended to display the day, week, month (as default), 
and year of the calendar and uses the methods get appointments and get holidays */
DISPLAY CLASS:{
use switch statement:
display day
display week
display month - default
display year 
Methods (get appointments, get holidays)
}

/* This is the class that creates the objects known as either day, week, month, or year.
This class also uses the methods get date and get time. */
CREATE CLASS: {
create day
create week
create month 
create year
Methods (get date, get time)
}
/* This class displays the date and time and uses the methods get date and get time
which results in the methods display date and display time to be called using the provided information */
DATE CLASS: {
get date
get time
display date
display time 
}
/* This class is used to create separate calanders that can overlay events from different calendars,
and by doing so creating one visual calendar with mulitple events across it. */
ADDITIONAL CALENDARS CLASS: {
create additional calendars (think outlook overlay)
	- multiple color options
display additional calendars (sidebar)
}

/* This class is used to create a new appointment and uses the methods get date and get time to do so.
It is capable of displaying the newly created appointment as well as other appointments. */
APPOINTMENT CLASS: {

create new appointment
	- get date
	- get time
display new appointment
display multiple appointments
}


/* This class is used to pull dates that are recognized as holidays and mark them uniquely on the calendar */
HOLIDAY CLASS: {
get holidays
display holidays	
- set different color than calendar availability
}
/* This class is used to set and display an alert for an appointment that can be set to multiple intervals of time
ranging from 5 minute warnings to 1 day warnings. */
ALERT CLASS: {
create alert
display alert
	- multiple options for time 
	- make it possible to set multiple alerts
}
/* This class is used to determine the location of the user in order to display relevant information 
including the use of the Sunrise/Sunset class */
LOCATION CLASS: {
Set Location
Display Location
}

/* This class is used to diplay the time of day the sun will rise and the time it will set.
It uses the methods get date and get location  to determine the times the sun will rise and set */
SUNRISE/SUNSET CLASS: {
Set time
Display time
Methods (get date, get location)
}

