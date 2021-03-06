package org.teachingkidsprogramming.recipes.completed.section06modelviewcontroller;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.utils.Viewer;
import org.teachingextensions.windows.MessageBox;

public class AdLibsRtfVariation
{
  public static class Words
  {
    public String adverb;
    public String edVerb;
    public String bodyPart;
  }
  public static void main(String[] args)
  {
    Words word = new Words();
    word.adverb = MessageBox.askForTextInput("What is the adverb?");
    word.edVerb = MessageBox.askForTextInput("What is the -ed verb?");
    word.bodyPart = MessageBox.askForTextInput("What is the body part?");
    String currentStory = Parser.parseRtfFile("view.rtf", word);
    Viewer.displayRtfFile(currentStory);
  }
}