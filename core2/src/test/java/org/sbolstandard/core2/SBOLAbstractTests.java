package org.sbolstandard.core2;

import static uk.ac.ncl.intbio.core.datatree.Datatree.NamedProperty;
import static uk.ac.ncl.intbio.core.datatree.Datatree.NamespaceBinding;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;

import org.junit.Test;
import org.sbolstandard.core.SBOLValidationException;
/**
 * @author Tramy Nguyen
 *
 */
public abstract class SBOLAbstractTests {

	String VERSION_1_0 = "1.0";

	@Test
	public void test_labhost_All_File() throws Exception
	{
		String fileName = "test/data/SBOL1/labhost_All.xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileName, "rdf");
			runTest("test/data/labhost_All.rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileName, e);
		}
	}

	@Test
	public void test_labhost_Aspergillus_nidulans() throws Exception
	{
		String filename = "labhost_Aspergillus_nidulans";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Bacillus_subtilis() throws Exception
	{
		String filename = "labhost_Bacillus_subtilis";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Drosophila_melanogaster() throws Exception
	{
		String filename = "labhost_Drosophila_melanogaster";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Escherichia_Coli() throws Exception
	{
		String filename = "labhost_Escherichia_Coli";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Gramnegative_bacteria() throws Exception
	{
		String filename = "labhost_Gram-negative_bacteria";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Insect_Cells() throws Exception
	{
		String filename = "labhost_Insect_Cells";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Kluyveromyces_lactis() throws Exception
	{
		String filename = "labhost_Kluyveromyces_lactis";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Mammalian_Cells() throws Exception
	{
		String filename = "labhost_Mammalian_Cells";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Pichia_pastoris() throws Exception
	{
		String filename = "labhost_Pichia_pastoris";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Plant_Cells() throws Exception
	{
		String filename = "labhost_Plant_Cells";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Saccharomyces_cerevisiae() throws Exception
	{
		String filename = "labhost_Saccharomyces_cerevisiae";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Schizosaccharomyces_pombe() throws Exception
	{
		String filename = "labhost_Schizosaccharomyces_pombe";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_labhost_Unspecified() throws Exception
	{
		String filename = "labhost_Unspecified";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	//	@Test
	//	public void test_miRNA_sbol() throws Exception
	//	{
	//		//TODO: This file is not parsing for some reason...
	//		String filename = "miRNA_sbol";
	//		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";
	//
	//		try
	//		{
	//			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
	//			runTest("test/data/" + filename + ".rdf", actual, "rdf");
	//		}
	//		catch (SBOLValidationException e)
	//		{
	//			throw new AssertionError("Failed for " + fileDirectory, e);
	//		}
	//	}

	@Test
	public void test_partial_pIKE_left_cassette() throws Exception
	{
		String filename = "partial_pIKE_left_cassette";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_partial_pIKE_right_casette() throws Exception
	{
		String filename = "partial_pIKE_right_casette";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_partial_pIKE_right_cassette() throws Exception
	{
		String filename = "partial_pIKE_right_cassette";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_partial_pTAK_left_cassette() throws Exception
	{
		String filename = "partial_pTAK_left_cassette";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_partial_pTAK_right_cassette() throws Exception
	{
		String filename = "partial_pTAK_right_cassette";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_pIKE_pTAK_cassettes_2() throws Exception
	{
		String filename = "pIKE_pTAK_cassettes 2";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_pIKE_pTAK_cassettes() throws Exception
	{
		String filename = "pIKE_pTAK_cassettes";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_pIKE_pTAK_left_right_cassettes() throws Exception
	{
		String filename = "pIKE_pTAK_left_right_cassettes";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}

	@Test
	public void test_pIKE_pTAK_toggle_switches() throws Exception
	{
		String filename = "pIKE_pTAK_toggle_switches";
		String fileDirectory = "test/data/SBOL1/" + filename + ".xml";

		try
		{
			SBOLDocument actual = SBOLTestUtils.convertSBOL1(fileDirectory, "rdf");
			runTest("test/data/" + filename + ".rdf", actual, "rdf");
		}
		catch (SBOLValidationException e)
		{
			throw new AssertionError("Failed for " + fileDirectory, e);
		}
	}


	@Test
	public void test_JSONFile() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		runTest("test/data/emptyJSONFile.json", document, "json");

	}

	//	@Test
	//	public void test_TurtleFile() throws Exception
	//	{
	//		SBOLDocument document = new SBOLDocument();
	//		//TODO: this is not passing for some reason...
	//		runTest("test/data/emptyTurtleFile.ttl", document, "turtle");
	//	}


	@Test
	public void test_memberAnnotations() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		String id    	= "someModel";
		URI source 		= URI.create(id + "_source");
		URI language    = URI.create(id + "_language");
		URI framework   = URI.create(id + "_framework");

		Collection myParts = document.createCollection("myParts", VERSION_1_0);
		myParts.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));

		Model someModel = document.createModel(id, VERSION_1_0, source, language, framework);
		someModel.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));

		ModuleDefinition someModDef = document.createModuleDefinition("someModuleDef", VERSION_1_0);
		someModDef.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));

		Set<URI> interactionType = new HashSet<URI>();
		interactionType.add(URI.create("DNA"));
		Interaction someInteraction = someModDef.createInteraction("someInteraction", interactionType);
		//		someModDef.createFunctionalComponent("someFunctionalComponent", AccessType.PUBLIC, "componentDef", VERSION_1_0, DirectionType.INOUT); //TODO replace componentDef
		//		someInteraction.createParticipation("someParticipation", "someFunctionalComponent");

		Module someModule = someModDef.createModule("someModule", "someModuleDef", VERSION_1_0);
		String someMapsTo_id = "someMapsTo";
		//		MapsTo someMapsTo = someModule.createMapsTo(someMapsTo_id, RefinementType.USELOCAL, "someModule", someMapsTo_id +"_remote");

		String seq_id = "someSeq";
		Sequence someSeq = document.createSequence(seq_id, VERSION_1_0, seq_id + "_element", URI.create("http://encodings.org/encoding"));
		someSeq.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));

		Set<URI> types = new HashSet<URI>();
		types.add(URI.create("someCompDef_type"));
		ComponentDefinition someCompDef = document.createComponentDefinition("someCompDef", VERSION_1_0, types);
		someCompDef.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));

		Component someComponent = someCompDef.createComponent("someComponent", AccessType.PUBLIC, "someCompDef", VERSION_1_0);
		someComponent.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));

		SequenceAnnotation someSequenceAnnotation = someCompDef.createSequenceAnnotation("someSequenceAnnotation", "cut", 1, 10);
		someSequenceAnnotation.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));
		SequenceAnnotation someSequenceAnnotation2 = someCompDef.createSequenceAnnotation("someSequenceAnnotation2", "cut", 1, OrientationType.INLINE);

		//		someSequenceAnnotation.setLocation(); //TODO range, multiRange, cut - how to access?

		SequenceConstraint someSequenceConstraint = someCompDef.createSequenceConstraint("someSequenceConstraint", RestrictionType.PRECEDES, "someComponent", "someComponent");
		someSequenceConstraint.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));

		GenericTopLevel someGenericTopLevel = document.createGenericTopLevel("someGenericTopLevel", VERSION_1_0, new QName("urn:bbn.com:tasbe:grn", "RegulatoryReaction", "grn"));
		someGenericTopLevel.addAnnotation(new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"), "turtleString")));


		runTest("test/data/memberAnnotations.rdf", document, "rdf");
	}


	@Test
	public void test_CreateAndRemoveCollections() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		Collection c = document.createCollection("myParts", VERSION_1_0);
		document.removeCollection(c); //size of collection should be 0

		for(int i = 1; i < 4; i++)
		{
			document.createCollection("myParts" + i, VERSION_1_0);
		}

		document.clearCollections();
		document.createCollection("myParts", VERSION_1_0);
		runTest("test/data/CreateAndRemoveCollections.rdf", document, "rdf");
	}

	@Test
	public void test_CreateAndRemoveComponentDefintion() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		Set<URI> types = new HashSet<URI>();
		types.add((URI.create("someType")));
		ComponentDefinition cd = document.createComponentDefinition("someCompDef", VERSION_1_0, types);
		document.removeComponentDefinition(cd);

		for(int i = 1; i < 4; i++)
		{
			//TODO check to see if having the same type for diff. object is valid.
			document.createComponentDefinition("someCompDef" + i, VERSION_1_0, types);
		}

		document.clearComponentDefinitions();
		document.createComponentDefinition("someCompDef", VERSION_1_0, types);
		runTest("test/data/CreateAndRemoveComponentDefinition.rdf", document, "rdf");
	}

	@Test
	public void test_CreateAndRemoveModuleDefintion() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		ModuleDefinition md = document.createModuleDefinition("someModDef", VERSION_1_0);
		document.removeModuleDefinition(md);

		for(int i = 1; i < 4; i++)
		{
			document.createModuleDefinition("someModDef"+i, VERSION_1_0);
		}

		document.clearModuleDefinitions();
		document.createModuleDefinition("someModDef", VERSION_1_0);

		runTest("test/data/CreateAndRemoveModuleDefinition.rdf", document, "rdf");
	}

	@Test
	public void test_CreateAndRemoveGenericTopLevel() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		GenericTopLevel gen = document.createGenericTopLevel("someGenTopLev", VERSION_1_0, new QName("urn:bbn.com:tasbe:grn", "RegulatoryReaction", "grn"));
		document.removeGenericTopLevel(gen);

		for(int i = 1; i < 4; i++)
		{
			document.createGenericTopLevel("someGenTopLev"+i, VERSION_1_0, new QName("urn:bbn.com:tasbe:grn", "RegulatoryReaction", "grn"));
		}

		document.clearGenericTopLevels();
		document.createGenericTopLevel("someGenTopLev", VERSION_1_0, new QName("urn:bbn.com:tasbe:grn", "RegulatoryReaction", "grn"));

		runTest("test/data/CreateAndRemoveGenericTopLevel.rdf", document, "rdf");
	}

	@Test
	public void test_CreateAndRemoveModel() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		Sequence s = document.createSequence("someSequence", VERSION_1_0, "someSeq_element", URI.create("someSeq_encoding"));
		document.removeSequence(s); //size of sequence should be 0


		for(int i = 1; i < 4; i++)
		{
			document.createCollection("someSequence" + i, VERSION_1_0);
		}

		document.clearSequences(); //clear all sequence. Size = 0
		//add the same object that was removed
		document.createSequence("someSequence", VERSION_1_0, "someSeq_element", URI.create("someSeq_encoding"));
		runTest("test/data/CreateAndRemoveModel.rdf", document, "rdf");
	}

	@Test
	public void test_singleCollection() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		document.createCollection("myParts", VERSION_1_0);
		runTest("test/data/singleCollection.rdf", document, "rdf");
	}


	@Test
	public void test_multipleCollections_no_Members() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		document.createCollection("myPart1", VERSION_1_0);
		document.createCollection("myPart2", VERSION_1_0);
		document.createCollection("myPart3", VERSION_1_0);

		runTest("test/data/multipleCollections_no_Members.rdf", document, "rdf");
	}

	@Test
	public void test_singleGenericTopLevel() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		document.createGenericTopLevel("GenericTopLevel", VERSION_1_0, new QName("urn:bbn.com:tasbe:grn", "RegulatoryReaction", "grn"));
		runTest("test/data/singleGenericTopLevel.rdf", document, "rdf");
	}

	@Test
	public void test_multipleGenericTopLevel() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		document.createGenericTopLevel("GenericTopLevel1", VERSION_1_0, new QName("urn:bbn.com:tasbe:grn", "RegulatoryReaction1", "grn"));
		document.createGenericTopLevel("GenericTopLevel2", VERSION_1_0, new QName("urn:bbn.com:tasbe:grn", "RegulatoryReaction2", "grn"));
		document.createGenericTopLevel("GenericTopLevel3", VERSION_1_0, new QName("urn:bbn.com:tasbe:grn", "RegulatoryReaction3", "grn"));

		runTest("test/data/multipleGenericTopLevel.rdf", document, "rdf");
	}

	@Test
	public void test_singleModel() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		String id = "ToggleModel";
		document.createModel( id, VERSION_1_0, URI.create(id + "_source"), URI.create(id + "_language"), URI.create(id + "_framework"));

		runTest("test/data/singleModel.rdf", document, "rdf");
	}


	@Test
	public void test_singleSequence() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		String id = "pLacSeq";
		document.createSequence(id, VERSION_1_0, id + "_elements", URI.create(id + "_encoding"));

		runTest("test/data/singleSequence.rdf", document, "rdf");
	}

	@Test
	public void test_multipleSquences() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		String id = "pLacSeq";
		String id2 = "tetRSeq";
		String id3 = "pLactetRSeq";

		document.createSequence(id, VERSION_1_0, id + "_elements", URI.create(id + "_encoding"));
		document.createSequence(id2, VERSION_1_0, id2 + "_elements", URI.create(id2 + "_encoding"));
		document.createSequence(id3, VERSION_1_0, id3 + "_elements", URI.create(id3 + "_encoding"));

		runTest("test/data/multipleSequences.rdf", document, "rdf");
	}

	@Test
	public void test_single_emptyModuleDefinition() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		Set<URI> roles = SBOLTestUtils.getSetPropertyURI("Inverter");
		ModuleDefinition LacI_Inv = document.createModuleDefinition("LacI_Inv", VERSION_1_0);
		LacI_Inv.setRoles(roles);

		runTest("test/data/singleModuleDefinition.rdf", document, "rdf");
	}

	@Test
	public void test_singleComponentDefinition() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		Set<URI> type = SBOLTestUtils.getSetPropertyURI("DNA");
		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Promoter");
		ComponentDefinition pLac = document.createComponentDefinition("pLac", VERSION_1_0, type);
		pLac.setRoles(role);

		runTest("test/data/singleComponentDefinition.rdf", document, "rdf");
	}

	@Test
	public void test_singleCompDef_withSeq() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		Set<URI> type = SBOLTestUtils.getSetPropertyURI("DNA");
		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Promoter");
		ComponentDefinition pLac = document.createComponentDefinition("pLac", VERSION_1_0, type);
		pLac.setRoles(role);
		//		pLac.setSequence("pLacSeq", VERSION_1_0); //TODO unable to call createSequence for this.

		runTest("test/data/singleCompDef_withSeq.rdf", document, "rdf");
	}

	@Test
	public void test_singleFunctionalComponent() throws Exception
	{
		SBOLDocument document = new SBOLDocument();
		document.setComplete(true);
		document.setDefaultURIprefix("http://www.async.ece.utah.edu");

		document.addNamespaceBinding(NamespaceBinding("http://myannotation.org", "annot"));
		document.addNamespaceBinding(NamespaceBinding("urn:bbn.com:tasbe:grn", "grn"));

		Set<URI> type = SBOLTestUtils.getSetPropertyURI("Protein");
		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Transcriptionfactor");
		ComponentDefinition LacIIn = document.createComponentDefinition("LacIIn", VERSION_1_0, type);
		String compDef_id = LacIIn.getDisplayId();
		LacIIn.createComponent("funcComp", AccessType.PUBLIC, compDef_id, VERSION_1_0);


		runTest("test/data/singleFunctionalComponent.rdf", document, "rdf");
	}

	//	|------------------------------------TOGGLE SWITCH------------------------------------|
	//	|		- double check on correct use of URIs										  |
	//	|																					  |
	//	|-------------------------------------------------------------------------------------|
	//	@Test
	//	public void test_ToggleSwitch() throws Exception
	//	{
	//		SBOLDocument document = new SBOLDocument();
	//		document.addNameSpaceBinding(URI.create("http://myannotation.org"), "annot");
	//		document.addNameSpaceBinding(URI.create("urn:bbn.com:tasbe:grn"), "grn");
	//
	//		List<Annotation> annotations = new ArrayList<Annotation>();
	//		Annotation a = new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"),
	//				"TurtleString"));
	//		annotations.add(a);
	//
	//		//Sequence
	//		URI pLacSeq_id = SBOLTestUtils.createSequence(document,"pLacSeq").getIdentity();
	//		URI tetRSeq_id = SBOLTestUtils.createSequence(document,"tetRSeq").getIdentity();
	//		URI pLactetRSeq_id = SBOLTestUtils.createSequence(document,"pLactetRSeq").getIdentity();
	//
	//		URI ptetSeq_id = SBOLTestUtils.createSequence(document,"ptetSeq").getIdentity();
	//		URI lacISeq_id = SBOLTestUtils.createSequence(document,"lacISeq").getIdentity();
	//		URI ptetlacISeq_id = SBOLTestUtils.createSequence(document,"ptetlacISeq").getIdentity();
	//
	//		//ComponentDefintion
	//		URI pLac_id = get_pLac(document, pLacSeq_id).getIdentity();
	//		URI tetR_id = get_tetR(document, tetRSeq_id).getIdentity();
	//		URI pLactetR_id = get_pLactetR(document, pLac_id, tetR_id, pLactetRSeq_id).getIdentity();
	//
	//		URI LacI_id = get_LacI(document).getIdentity();
	//		URI TetR_id = get_TetR(document).getIdentity();
	//
	//		URI ptet_id = get_ptet(document, ptetSeq_id).getIdentity();
	//		URI lacI_id = get_lacI(document, lacISeq_id).getIdentity();
	//		URI ptetlacI_id = get_ptetlacI(document, ptet_id, lacI_id, ptetlacISeq_id).getIdentity();
	//
	//		//ModuleDefinition
	//		//		get_LacIIn(document, ptetlacI_id);
	//		//		URI LacI_Inv_id = get_LacI_Inv(document, LacI_id, pLactetR_id, TetR_id, ptetlacI_id).getIdentity();
	//
	//		Collection myParts = SBOLTestUtils.createCollection(document, "myParts", annotations);
	//		myParts.addMember(pLacSeq_id);
	//		myParts.addMember(tetRSeq_id);
	//		myParts.addMember(pLactetRSeq_id);
	//
	//		myParts.addMember(pLac_id);
	//		myParts.addMember(tetR_id);
	//		myParts.addMember(pLactetR_id);
	//
	//		//		myParts.addMember(LacI_Inv_id); //TODO
	//
	//		myParts.addMember(LacI_id);
	//		myParts.addMember(TetR_id);
	//
	//		myParts.addMember(ptetSeq_id);
	//		myParts.addMember(lacISeq_id);
	//		myParts.addMember(ptetlacISeq_id);
	//
	//		myParts.addMember(ptet_id);
	//		myParts.addMember(lacI_id);
	//		myParts.addMember(ptetlacI_id);
	//
	//		//		myParts.addMember(get_TetR_Inv(SBOL2Doc_test).getIdentity());
	//		//
	//		//		myParts.addMember(get_Toggle(SBOL2Doc_test).getIdentity());
	//		//		myParts.addMember(get_ToggleModel(SBOL2Doc_test).getIdentity());
	//
	//		myParts.addMember(SBOLTestUtils.createGenericTopLevel(document, "GenericTopLevel").getIdentity());
	//
	//		runTest("test/data/sampleToggleSwitch.rdf", document);
	//	}

	public ComponentDefinition get_pLac(SBOLDocument document, URI pLacSeq_id)
	{
		Set<URI> type = SBOLTestUtils.getSetPropertyURI("DNA");
		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Promoter");
		return SBOLTestUtils.createComponentDefinition(document, "pLac", type, role,
				pLacSeq_id, null, null, null, null);
	}

	public ComponentDefinition get_tetR(SBOLDocument document, URI tetRSeq_id)
	{
		Set<URI> type = SBOLTestUtils.getSetPropertyURI("DNA");
		Set<URI> role = SBOLTestUtils.getSetPropertyURI("CDS");
		return SBOLTestUtils.createComponentDefinition(document, "tetR", type, role,
				tetRSeq_id, null, null, null, null);
	}

	public ComponentDefinition get_pLactetR(SBOLDocument document, URI pLac_id, URI tetR_id, URI pLactetRSeq_id)
	{
		Set<URI> type = SBOLTestUtils.getSetPropertyURI("DNA");
		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Gene");

		List<Component> subComponents = new ArrayList<Component>();
		//get_P & get_C 319
		Component P = SBOLTestUtils.createComponent("P", AccessType.PUBLIC, pLac_id, null);
		Component C = SBOLTestUtils.createComponent("C", AccessType.PUBLIC, tetR_id, null);
		subComponents.add(P);
		subComponents.add(C);

		List<SequenceConstraint> sequenceConstraints = new ArrayList<SequenceConstraint>();
		//get_struct_constraint 321
		SequenceConstraint struct_constraint =
				SBOLTestUtils.createSequenceConstraint("struct_constraint",
						P.getIdentity(), C.getIdentity(), RestrictionType.PRECEDES, null);
		sequenceConstraints.add(struct_constraint);

		return SBOLTestUtils.createComponentDefinition(document, "pLactetR", type, role,
				pLactetRSeq_id, null, sequenceConstraints, subComponents, null);
	}
	//
	//	public ComponentDefinition get_LacI(SBOLDocument document)
	//	{
	//		Set<URI> type = SBOLTestUtils.getSetPropertyURI("Protein");
	//		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Transcriptionfactor");
	//
	//		return SBOLTestUtils.createComponentDefinition(document, "LacI", type, role,
	//				null, null, null, null);
	//	}
	//
	//	public ComponentDefinition get_TetR(SBOLDocument document)
	//	{
	//		Set<URI> type = SBOLTestUtils.getSetPropertyURI("Protein");
	//		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Transcriptionfactor");
	//
	//		return SBOLTestUtils.createComponentDefinition(document, "TetR", type, role,
	//				null, null, null, null);
	//	}
	//
	//	public ComponentDefinition get_ptet(SBOLDocument document, URI ptetSeq_id)
	//	{
	//		Set<URI> type = SBOLTestUtils.getSetPropertyURI("DNA");
	//		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Promoter");
	//		return SBOLTestUtils.createComponentDefinition(document, "ptet", type, role,
	//				ptetSeq_id, null, null, null);
	//	}
	//
	//	public ComponentDefinition get_lacI(SBOLDocument document, URI tetRSeq_id)
	//	{
	//		Set<URI> type = SBOLTestUtils.getSetPropertyURI("DNA");
	//		Set<URI> role = SBOLTestUtils.getSetPropertyURI("CDS");
	//		return SBOLTestUtils.createComponentDefinition(document, "lacI", type, role,
	//				null, null, null, null);
	//	}
	//
	//	public ComponentDefinition get_ptetlacI(SBOLDocument document, URI ptet_id, URI lacI_id, URI ptetlacISeq_id)
	//	{
	//		Set<URI> type = SBOLTestUtils.getSetPropertyURI("DNA");
	//		Set<URI> role = SBOLTestUtils.getSetPropertyURI("Gene");
	//
	//		List<Component> subComponents = new ArrayList<Component>();
	//		//get_T & get_L 514
	//		Component T = SBOLTestUtils.createComponent("T", AccessType.PUBLIC, ptet_id);
	//		Component L = SBOLTestUtils.createComponent("L", AccessType.PUBLIC, lacI_id);
	//		subComponents.add(T);
	//		subComponents.add(L);
	//
	//		List<SequenceAnnotation> sequenceAnnotations = new ArrayList<SequenceAnnotation>();
	//
	//		Range r1 = new Range(URI.create("p2_structAnnotate_range"), 0, 10);
	//		Range r2 = new Range(URI.create("c2_structAnnotate_range"), 11, 20);
	//		r1.setOrientation(Sbol2Terms.Orientation.inline);
	//		r2.setOrientation(Sbol2Terms.Orientation.inline);
	//
	//		SequenceAnnotation t_structAnnotate =
	//				SBOLTestUtils.createSequenceAnnotation("p2_structAnnotate", r1);
	//		SequenceAnnotation l_structAnnotate =
	//				SBOLTestUtils.createSequenceAnnotation("c2_structAnnotate", r2);
	//
	//		sequenceAnnotations.add(t_structAnnotate);
	//		sequenceAnnotations.add(l_structAnnotate);
	//
	//		return SBOLTestUtils.createComponentDefinition(document, "ptetlacI", type, role,
	//				ptetlacISeq_id, sequenceAnnotations, null, subComponents);
	//	}
	//
	//	public FunctionalComponent get_LacIIn(SBOLDocument document, URI LacI_id)
	//	{
	//		return SBOLTestUtils.createFunctionalComponent("LacIIn",
	//				AccessType.PUBLIC, DirectionType.INPUT, LacI_id);
	//	}
	//
	//	public FunctionalComponent get_LacInv(SBOLDocument document, URI pLactetR_id)
	//	{
	//		return SBOLTestUtils.createFunctionalComponent("LacInv",
	//				AccessType.PUBLIC, DirectionType.INPUT, pLactetR_id);
	//	}
	//
	//	public FunctionalComponent get_TetROut(SBOLDocument document, URI TetR_id)
	//	{
	//		return SBOLTestUtils.createFunctionalComponent("TetROut",
	//				AccessType.PUBLIC, DirectionType.OUTPUT, TetR_id);
	//	}
	//
	//	public FunctionalComponent get_TetRInv(SBOLDocument document, URI ptetlacI_id)
	//	{
	//		return SBOLTestUtils.createFunctionalComponent("TetRInv",
	//				AccessType.PRIVATE, DirectionType.NONE, ptetlacI_id);
	//	}


	//TODO:
	//	public ModuleDefinition get_LacI_Inv(SBOLDocument document,
	//			List<FunctionalComponent> functionalComponents,
	//			URI LacI_id, URI pLactetR_id,
	//			URI TetR_id, URI ptetlacI_id)
	//	{
	//		Set<URI> roles = SBOLTestUtils.getSetPropertyURI("Inverter");
	//
	//		List<Interaction> interactions = new ArrayList<Interaction>();
	//
	//		Set<URI> p1a_roles = SBOLTestUtils.getSetPropertyURI("repressor"); //365
	//		Set<URI> p2a_roles = SBOLTestUtils.getSetPropertyURI("repressed"); //373
	//		Set<URI> p3a_roles = SBOLTestUtils.getSetPropertyURI("produced");
	//		Set<URI> p4a_roles = SBOLTestUtils.getSetPropertyURI("producer");
	//
	//		Set<URI> interact1a_type = SBOLTestUtils.getSetPropertyURI("repression");
	//		Set<URI> interact2a_type = SBOLTestUtils.getSetPropertyURI("production");
	//
	//		//TODO: remove these and past in it's id to the method
	//		URI p1a_FuncComp_id =
	//				SBOLTestUtils.createFunctionalComponent("LacIIn",
	//						AccessType.PUBLIC, DirectionType.INPUT, LacI_id).getIdentity();
	//		URI p2a_FuncComp_id =
	//				SBOLTestUtils.createFunctionalComponent("LacInv",
	//						AccessType.PUBLIC, DirectionType.INPUT, pLactetR_id).getIdentity();
	//		URI p3a_FuncComp_id =
	//				SBOLTestUtils.createFunctionalComponent("TetROut",
	//						AccessType.PUBLIC, DirectionType.OUTPUT, TetR_id).getIdentity();
	//		URI p4a_FuncComp_id =
	//				SBOLTestUtils.createFunctionalComponent("TetRInv",
	//						AccessType.PRIVATE, DirectionType.NONE, ptetlacI_id).getIdentity();
	//
	//		List<Participation> interact1a_participations = new ArrayList<Participation>();
	//		Participation p1a = SBOLTestUtils.createParticipation("p1a", p1a_roles, p1a_FuncComp_id);
	//		Participation p2a = SBOLTestUtils.createParticipation("p2a", p2a_roles, p2a_FuncComp_id);
	//		interact1a_participations.add(p1a);
	//		interact1a_participations.add(p2a);
	//
	//		List<Participation> interact2a_participations = new ArrayList<Participation>(); //409
	//		Participation p3a = SBOLTestUtils.createParticipation("p3a", p3a_roles, p3a_FuncComp_id);
	//		Participation p4a = SBOLTestUtils.createParticipation("p4a", p4a_roles, p4a_FuncComp_id);
	//		interact2a_participations.add(p1a);
	//		interact2a_participations.add(p2a);
	//
	//		//get_interact1a & get_interact2a 424
	//		Interaction interact1a = SBOLTestUtils.createInteraction("interact1", interact1a_type, interact1a_participations);
	//		Interaction interact2a = SBOLTestUtils.createInteraction("interact2a", interact2a_type, interact2a_participations);
	//		interactions.add(interact1a);
	//		interactions.add(interact2a);
	//
	//		List<Annotation> annotations = new ArrayList<Annotation>();
	//		Annotation a = new Annotation(NamedProperty(new QName("http://myannotation.org", "thisAnnotation", "annot"),
	//				"TurtleString"));
	//		annotations.add(a);
	//
	//		return SBOLTestUtils.createModuleDefinition(document, "LacI_Inv",
	//				roles,
	//				functionalComponents,
	//				interactions,
	//				null,
	//				null,
	//				annotations);
	//
	//	}


	public abstract void runTest(final String fileName, final SBOLDocument expected, String fileType)
			throws Exception;

}
