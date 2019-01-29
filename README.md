# projectOne

## Goals
- To introduce distributed thinking (without involving the network--yet)
- To check up on prerequisites
- To improve collaboration skills

### Introduction
The most important prerequisite for this class is actually OO knowledge. We’re going to make extensive use of object-oriented thinking throughout the semester. Knowing how to work with classes and objects and identify common interfaces will be crucial to doing this first assignment.

As you probably know, smart devices (i.e. Internet of Things) are here to stay. I recently purchased some smart outlets/devices from TP-Link and Meross (for an outdoor outlet to control the Christmas trees and patio lights).

### Premise
In our assignment, we are going to simulate some smart devices, focusing on how to maintain state and control one or more of them. To make things interesting, we will also have background “threads” that support timers (to turn the device off after a certain amount of elapsed time) and events (on at certain time, off at certain time).  We will also have reporting (logs) that allow us to see all events and usage information associated with these smart devices.

### Objectives
Here are the devices you will support:
Smart light bulbs with on/off switch, dimming, and (optional) color capabilities
Smart outlets and/or switches with up to 7 individually-controllable outlets (TP-Link sells these in 1, 2, and power strip versions).
Other smart devices (doorbells) that can trigger events.

The assignment is to work with a partner to develop/design an OO API that allows you to do the following:
- Create a smart device instance
- Add/remove/update delete the smart device in a group of devices
- Move devices between groups
- Turn on/off a device
- Show the state of all devices
- Set a timer for a device with a simple trigger (on/off), i.e. turn off device 30 minutes after it was turned on.
- Set a schedule for a device (on/off), i.e. turn on a device at 12:30.

### Grading Criteria
- Good design, with proper documentation (README or design diagram)
- Your README should be detailed enough so anyone can open your repo and understand what your project is
- Good use of classes/interfaces
- Unit tests--lots of them!
- Use of GitHub from day one
- You should be committing everyday
- Simple interface (text or GUI) to start the smart network and support the various functions described above.
- Being a good teammate
- This can be shown through use of Basecamp and GitHub commits
- Organization
- It shouldn’t be difficult to find your deliverables


Your solution must not be implemented as a web service or web app. It must be a standalone solution where we are using objects in collections to interact as if they were on the network. In a second assignment, you will build a networked implementation where these objects can be located at different IP addresses (using Linux containers, eventually the cloud?)
