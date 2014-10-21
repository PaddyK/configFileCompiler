configFileCompiler
==================
This repositories is cloesly related and used to my [StudyWorks](https://github.com/PaddyK/StudyWorks) project. In general this program allows you to specify configuration files for weka experiments.

## Dependencies
* [ANTLR 4](http://www.antlr.org/download.html)
* [Weka](http://www.cs.waikato.ac.nz/ml/weka/downloading.html)
* [ANT](http://ant.apache.org/srcdownload.cgi), [ANT Installation Guide](http://ant.apache.org/manual/index.html#installing)

## Installation
1. Clone this repo
2. Set up ANT
3. Get ANTLR Jar (I used 4.4)
4. in the file `build.xml` specify the path to the antlr jar by adapting property in line 8 `<property name="antlrLib" value="../put/your/path/here" />`
5. Call `ant package` to build the jar and then `ant run` to check working (adapt property configfile in line 3`

## Config file structure
````xml
<experiment>
  <ressources>
    <resource name="resource1" value="val"/>
    ...
  </ressources>
  <classifier name="RandomForest" />
  <classifier name="some classifier from weka">
    <attribute name="attr name" value="val/>
    ..
    <attribute name="W">
      <classifier name="subsequent classifier" /> <!-- it is possible to nest this arbitrarily deep ..>
    </attribute>
  </classifier>
</experiment>
````

## Usage
In the program you wanna use this put the following snipped somewhere:
````Java
List<ExperimentSetup> setups = null;
try {
			ANTLRFileStream			stream = new ANTLRFileStream(configFile);
			WekaConfigGrammarLexer	lexer  = new WekaConfigGrammarLexer(stream);
			CommonTokenStream		ts     = new CommonTokenStream(lexer);
			WekaConfigGrammarParser	parser = new WekaConfigGrammarParser(ts);
			setups = parser.configfile().f.interpret();

		} catch(Exception e) {
			e.printStackTrace();
		}
````
To retrieve a resource do the following:
````Java
ExperimentSetup setup = setups.get(0);
setup.getResource("resource name");
````

In order to retrieve the settings for the classifier, do the following:
````Java
List<ClassifierSetups> csetups = setup.getClassifierSetups();
ClassifierSetup csetup = csetups.get(0);
csetup.getOptionAsArray();
csetup.getClassifierName();
````
The `getOptionAsArray()`function returns an array with the options. This is similar to the use of weka on the command line.

