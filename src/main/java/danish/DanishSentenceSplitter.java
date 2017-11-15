/*
 * Copyright (c) 1995-2016, The University of Sheffield. See the file
 * COPYRIGHT.txt in the software or at http://gate.ac.uk/gate/COPYRIGHT.txt
 * 
 * This file is part of GATE (see http://gate.ac.uk/), and is free software,
 * licenced under the GNU Library General Public License, Version 2, June 1991
 * (in the distribution as file licence.html, and also available at
 * http://gate.ac.uk/gate/licence.html).
 * 
 * Mark A. Greenwood, 4/02/2016
 */


package danish;

import gate.creole.ResourceReference;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;
import gate.creole.splitter.SentenceSplitter;

@CreoleResource(name = "Danish Sentence Splitter")
public class DanishSentenceSplitter extends SentenceSplitter {

  private static final long serialVersionUID = 1586310609083220339L;

  @Override
  @CreoleParameter(defaultValue="resources/sentences/lists.def")
  public void setGazetteerListsURL(ResourceReference newGazetteerListsURL) {
    super.setGazetteerListsURL(newGazetteerListsURL);
  }
  
  @Override
  @CreoleParameter(defaultValue="resources/sentences/main-single-nl.jape")
  public void setTransducerURL(ResourceReference newTransducerURL) {
    super.setTransducerURL(newTransducerURL);
  }
}
