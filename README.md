SpineFM ![Build status](https://travis-ci.org/surli/spinefm.svg?branch=master)
=======

## Author

* [Simon Urli](http://simonurli.fr) : urli [at] i3s [dot] unice [dot] fr 

## About 

SpineFM is a tooled approach which aims to describe a software product line with a domain model related to multiple interrelated feature models. It uses a propagation algorithm of configuration actions in order to provide a free-order process for product derivation. 
Reading [our SPLC'14 paper](https://hal.archives-ouvertes.fr/hal-01023553/document) is a good first step before starting use this tool.

## Requirements 

* Maven version 3
* Java 1.7 or up
* [Eclipse Modeling Tool](https://eclipse.org/modeling/) with maven integration

## How to use it? 

! Work in progress

### Setup Eclipse 

1. In a console, go to the spinefm root directory and type the following command: `cd spinefm-p2 && mvn clean install`
2. Open eclipse modeling tool in a new workspace project and install maven integration if it's not done yet
![Install maven integration](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/1-install-maven-integration.png =250x)
3. Import maven project in eclipse and select directory spinefm (the root of this repository)
4. Open spinefm-root project and open file target.target inside it
5. Click on "Set as target platform" (link in the top right of target definition view) and wait for eclipse to resolve dependencies
![Set as target platform](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/2-set-target-platform.png)
6. Test the setup by launching spinefm-core tests: all tests must pass (be careful that you must use java 1.7 to launch tests)

### Create your own domain model

#### Creation of the domain model

1. Create a new project in eclipse and create a directory "model"
2. Open the file "MetamodelSpineFM.ecore" contained in directory "model" of project spinefm-core
3. Open the hierarchy spinefm/MSPLModel, select "MultipleSoftwareProductLine" right click, select "Create dynamic instance" and create the instance inside your new project under directory "model"
![Create new model](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/3-start-domain-model.png)
4. Open your newly created model with the Ecore editor view and display property view
![Open Ecore editor](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/4-open-ecore-editor.png)
![Open Property View](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/5-open-property-view.png)
5. Give an ID to the MultipleSoftwareProductLine concept 
![Set MSPL ID](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/6-set-mspl-id.png)

In the next steps we are trying to create the following domain model : 
![Domain Model](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/domain-model.png)


#### Definition of concepts

1. Select the MSPL instance, right click, go in "New child" menu and select "Domain element"
![Create new concept](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/7-create-concept.png)

2. Define the ID of the newly created domain element

3. Define a multiplicity element of the concept, by right clicking on it, and by selected "multiplicity element" in "New Child" menu
![Create new concept](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/8-create-concept-multiplicity.png)

4. The current implementation of SpineFM only support the following multiplicities : 
* [0..1]
* [1..1]
* [1..*]
* [0..*]

Lower and upper bound properties of the multiplicity elements are used to define the range. 
Please note that the `*` is considered with the rule `-1`.
![Create new concept](https://raw.githubusercontent.com/surli/spinefm/master/documentation/images/9-define-concept-multiplicity.png)


#### Definition of associations

#### Definition of restrictions

### Use your domain model

#### Via a Java program

#### Via TOCSIN configuration interface

#### Via the RESTlike API 

