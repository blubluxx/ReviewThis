# Project Description

ReviewThis© is a system for user reviews of individual episodes, entire seasons and series. Users can write reviews and give ratings. Also they can like or dislike other user reviews.

## Table of contests

- [Functional requirements](#functional-requirements)
- [Entities](#entities)
    - [Users](#users)
    - [Episodes](#episodes)
    - [Seasons](#seasons)
    - [Series](#series)
    - [Reviews](#reviews)
    - [Comments](#comments)
- [Public part](#public-part)
- [Private part](#private-part)
- [Administrative part](#administrative-part)
- [Optional](#optional)
- [Surprise](#surprise)


## Functional requirements

The system should support the following functionality:

### Entities

- #### Users:
    - Each user <font color="red">must</font> have a **username**, **password**, **first name**, **last name** and <font color="green">could</font> have an **email**.
        - **Username** <font color="red">must</font> be unique in the system.
        - **Password** <font color="red">must</font> be at least 8 characters long.
        - **Password** <font color="green">could</font> have additional requirement like one upper case character, digit, special symbol.
        - <font color="green">**Email**</font> <font color="red">must</font> be unique in the system.

[Back to top](#project-description)

- #### Episodes:
    - Each episode <font color="red">must</font> have a **title**, **genre**, **duration**, **rating**, **reviews** and <font color="orange">should</font> have **cast members**.
        - **Title** <font color="red">must</font> be between 2 and 30 characters long.
        - **Genre** <font color="green">could</font> be a list of genres.
        - **Duration** <font color="red">must</font> be a whole number in minutes.
        - **Rating** <font color="red">must</font> be rounded up to one digit after the decimal point.
        - **Reviews** <font color="red">must</font> be a list of reviews.
        - <font color="orange">**Cast members**</font> <font color="red">must</font> be a list of cast members.

[Back to top](#project-description)

- #### Seasons:
    - Each season <font color="red">must</font> have a **number**, **genre**, **rating**, **number of episodes**, **reviews**, **episodes**, <font color="orange">should</font> have **cast members** and <font color="green">could</font> have a **title**.
        - **Title** <font color="red">must</font> be between 2 and 30 characters long.
        - **Genre** <font color="green">could</font> be a list of genres.
        - **Rating** <font color="red">must</font> be rounded up to one digit after the decimal point.
        - **Reviews** <font color="red">must</font> be a list of reviews.
        - **Episodes** <font color="red">must</font> be a list of episodes.
        - <font color="orange">**Cast members**</font> <font color="red">must</font> be a list of cast members.

[Back to top](#project-description)

- #### Series:
    - Each series <font color="red">must</font> have a **title**, **genre**, **rating**, **number of seasons**, **number of episodes**, **seasons**, **episodes**, **reviews** and <font color="orange">should</font> have **cast members**.
        - **Title** <font color="red">must</font> be between 2 and 30 characters long.
        - **Genre** <font color="green">could</font> be a list of genres.
        - **Rating** <font color="red">must</font> be rounded up to one digit after the decimal point.
        - **Seasons** <font color="red">must</font> be a list of seasons.
        - **Episodes** <font color="red">must</font> be a list of episodes.
        - **Reviews** <font color="red">must</font> be a list of reviews.
        - <font color="orange">**Cast members**</font> <font color="red">must</font> be a list of cast members.

[Back to top](#project-description)

- #### Reviews:
    - Each review <font color="red">must</font> have a **title**, **rating**, **contents**, **likes**, **dislikes**, **author** and <font color="green">could</font> have **comments**.
        - **Title** <font color="red">must</font> be between 2 and 30 characters long.
        - **Rating** for the sereis, season, episode <font color="red">must</font> be a whole number.
        - **Contents** <font color="red">must</font> be between 10 and 500 characters long.
        - **Likes** <font color="red">must</font> be a whole number.
        - **Dislikes** <font color="red">must</font> be a whole number.
        - <font color="green">**Comments**</font> <font color="red">must</font> be a list of comments.

[Back to top](#project-description)

- #### <font color="green">Comments</font>:
    - Each comment <font color="red">must</font> have a **title**, **contents** and **author**.
        - **Title** <font color="red">must</font> be between 2 and 20 characters long.
        - **Contents** <font color="red">must</font> be between 10 and 100 characters long.

[Back to top](#project-description)

### Public part:

- The public part <font color="red">must</font> be accessible without authentication.
- Anonymous users <font color="red">must</font> be able to register and login.
- Anonymous users <font color="red">must</font> be able to search for series based on title, genre or rating.
- Anonymous users <font color="green">could</font> be able to search for seasons based on title, genre or rating.
- Anonymous users <font color="green">could</font> be able to search for episodes based on title, genre or rating.
- Anonymous users <font color="green">could</font> be able to search for cast members.
- Anonymous users <font color="red">must</font> be able to see all series.
- Anonymous users <font color="red">must</font> be able to see series' seasons, episodes and reviews.
- Anonymous users <font color="red">must</font> be able to see individual season's episodes and reviews.
- Anonymous users <font color="red">must</font> be able to see individual episodes and reviews.

[Back to top](#project-description)

### Private part:

- The private part <font color="red">must</font> be accessible only after login.
- Logged-in users <font color="red">must</font> be able to do everything anonymous users can.
- Logged-in users <font color="red">must</font> be able to edit their first name, last name and <font color="green">email</font>.
- Logged-in users <font color="red">must</font> be able to write reviews for series, seasons and episodes.
- Logged-in users <font color="red">must</font> be able to rate series, seasons and episodes.
- Logged-in users <font color="green">could</font> be able to write <font color="green">comments</font> on reviews.
- Logged-in users <font color="red">must</font> be able to like or dislike a review.
- Logged-in users <font color="orange">should</font> be able to edit their reviews or comments.
- Logged-in users <font color="orange">should</font> be able to delete their reviews or comments.
- Logged-in users <font color="orange">should</font> be able to remove their rating for series, seasons and episodes.

[Back to top](#project-description)

### Administrative part:

- The administrative part <font color="red">must</font> be accessible only to admins.
- Admins <font color="red">must</font> be able to do everything logged-in users can.
- Admins <font color="red">must</font> be able to promote other users to admins.
- Admins <font color="red">must</font> be able to ban users.
- Admins <font color="red">must</font> be able to delete reviews and comments.
- Admins <font color="red">must</font> be able to add and delete series, seasons, episodes, cast members.

### Optional

- The system <font color="green">could</font> save it's data in files.

[Back to top](#project-description)