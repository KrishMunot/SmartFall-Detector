SmartFall Detector [[![Status](https://rawgit.com/krish/krishunot.github.io/master/images/inactive.svg)](#)
====================

Krish Munot

This is the design document for AngelHack:

### Overview
Our application tackles the problem of an unattended aging user being unable to contact help during an immediate fall or severe injury. 


### Features
* Our design aims at contacting an emergency member under two conditions: <br/>
	1. If the user is unable to verify their condition after eight (8) minutes upon an immediate fall <br/>
	2. If the phone is left unintended for a user-set number of hours
<br/>
* Utilizes simple large words and recognizable color-coded icons for the elderly. 

**Fall Detection**
* Accelerometer Detects Fall: Prompts "Trigger Message"
* 180 Seconds (Inactivity): Phone vibration, audio alarm, 'flash' screen 
* 300 Seconds (Inactivity): Increase all alerts
* 480 Seconds (Inactivity): Send picture, audio, and location data to contacts
    * **Emergency contacts alerted**
    
**Immobilized Detection**
* If mobile phone detects no activity for a user-defined number of hour(s)
* 180 Seconds (Inactivity): Phone vibration, audio alarm, 'flash' screen 
* 300 Seconds (Inactivity): Increase all alerts
* 480 Seconds (Inactivity): Send picture, audio, and location data to contacts
    * **Emergency contacts alerted**
