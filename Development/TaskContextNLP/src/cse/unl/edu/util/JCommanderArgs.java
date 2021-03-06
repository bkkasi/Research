package cse.unl.edu.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.internal.Lists;

public class JCommanderArgs {
	@Parameter
	public List<String> parameters = Lists.newArrayList();

	@Parameter(names = "-type", description = "Type of experiment to run, s: search, n: nlp")
	public String experimentType = "s";
	
	@Parameter(names = "-seedSize", description = "No of files in seed set")
	public int seedSize = 3;

	@Parameter(names = "-ids", description = "Comma-separated list of tasks to be analyzed")
	public String taskIds = "";

	@Parameter(names = "-tagger", description = "Path of Maxent tagger to use for NLP")
	public String taggerPath = "taggers/left3words-wsj-0-18.tagger";
	
	@Parameter(names = "-nominal", description = "Return nominal or decimal representation of tasks")
	public String nominal;
	
	@Parameter(names = "-dbPrefix", description = "Which of teh prfix to use [mylyn|derby|hbase]")
	public String dbPrefix;
	
	@Parameter(names = "--help", help = true)
	private boolean help;
	
	

	//@DynamicParameter(names = "-D", description = "Dynamic parameters go here")
	//public Map<String, String> dynamicParams = new HashMap<String, String>();

}
