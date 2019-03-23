# Festicket-Task

#Instructions:
Clone the project from GitHub to your local machine. 
Step 1: On github navigate to the main page of repository.
Step 2: Under repository name, click Clone or download.
Step 3: In the Cone with HTTPs section, copy the clone url for the repository.
Step 4: Go to command Prompt on windows (or) Terminal on mac.
Step 5: Change the current working directory to the location where you want the cloned directory to be made.
Step 6: Type git clone https://github.com/maheshvadd/Festicket-Task.git and press enter
Step 7: After cloning is done, from command prompt change the working directory to project directory.
Step 8: Type mvn test and enter to run the project. (As the project is created using maven, it automatically downloads all dependencies to
your local machine and runs the tests)

#Analysis:
Challenges I have faced:
When driver is on login page and trying to enter the username and password, it was failing due to the page load 
time out. I resolved this by giving implicit wait and page load time out.

Areas to Improve: 
When I get more time: When I was verifying whether the correct user is logged in or not, i hardcoded the values in the test script.
but in real time scenario, we retrive the data from database and assert against that.

Other test cases i could automate: 
when user is on login page we could check whether he is on correct page by verifying the the title of page.
we could also verify with homepage title, after logout we could also check user logged out or not.

Dependencies used: 
Selenium webdriver Java - To use browser native methods
TestNG: To write test cases and to add assertions

Design Pattern:
i have used page object model as design pattern for easy readability, reusabilty, easy maintenance.



