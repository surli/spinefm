SpineFM
=======

## Author

* [Simon Urli](http://simonurli.fr) : urli [at] i3s [dot] unice [dot] fr 

## About 

SpineFM is a tooled approach which aims to describe a software product line with a domain model related to multiple interrelated feature models. It uses a propagation algorithm of configuration actions in order to provide a free-order process for product derivation. 

## Requirements 

* Maven version 3
* Java 1.7 or up
* [Eclipse Modeling Tool](https://eclipse.org/modeling/) with maven integration

## How to use it? 

! Work in progress

### Setup Eclipse 

1. In a console, go to the spinefm root directory and type the following command: `cd spinefm-p2 && mvn clean install`
2. Open eclipse modeling tool in a new workspace project and install maven integration if it's not done yet
![Install maven integration](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/1-install-maven-integration.png)
3. Import maven project in eclipse and select directory spinefm (the root of this repository)
4. Open spinefm-root project and open file target.target inside it
5. Click on "Set as target platform" (link in the top right of target definition view) and wait for eclipse to resolve dependencies
6. Test the setup by launching spinefm-core tests: all tests must pass (be careful that you must use java 1.7 to launch tests)

### Create your own domain model

#### Creation of the domain model
1. Create a new project in eclipse and create a directory "model"
2. Open the file "MetamodelSpineFM.ecore" contained in directory "model" of project spinefm-core
3. Open the hierarchy spinefm/MSPLModel, select "MultipleSoftwareProductLine" right click, select "Create dynamic instance" and create the instance inside your new project under directory "model"
4. Open your newly created model with the Ecore editor view and display property view
5. Give an ID to the MultipleSoftwareProductLine concept 

#### Definition of concepts

#### Definition of associations

#### Definition of restrictions

### Use your domain model

#### Via a Java program

#### Via TOCSIN configuration interface

#### Via the RESTlike API 

