# ZooContainers

ZooContainers shows how to populate a RecyclerView and ListView with String data from a list.
**This application is under construction***

*************************


1. Advantages of RecyclerView:

Has a ViewHolder pattern by default.
Easy to animate
Supports horizontal , vertical and  grid and staggered layouts


Advantages of listView:
Decouples list from its container - so at runtime list items can easily be used in the different containers.
Easy to add dividers and to implement overall

Lazy loading is a technique for loading content (usually asynchronously from the web) when it's needed rather than all at once.
An example of this is an infinite scroll with an EndlessRecyclerView 

3. An item decorator will beable to create divider and other features you wish to add to the app which can be customizable.

4. 4. What is the View Holder Pattern?
ViewHolder design pattern is used for rendering of the RecyclerView / ListView -
for better performance. findViewById uses DOM parsing and can cause overhead in performance, each time it's used a View is rendered, it must traverse through the layout hierarchy along with instantiating objects.



5. How do you implement a item touch helper for the RecyclerView?

extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener

Feature to add swiping and dismiss drag and drops on the RecyclerViews. This class has been depricated 
