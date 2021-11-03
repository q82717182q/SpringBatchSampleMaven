package com.yiibai;

import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.batch.item.ItemProcessor;
import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

/**
 * Created by Jack Yao on 2021/10/28 10:03 下午
 */
public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {
	
	private final static Logger log = Logger.getLogger(CustomItemProcessor.class);
/*CSV TO XML*/	
    @Override
    public Tutorial process(Tutorial item) throws Exception {   
        log.info(" - VVVVV - process - OOOOO - ");
        System.out.println("Processing..." + item); 
    	log.info(" - _____ - return item - XXXXX - ");
        return item;
    }
	
	
/*
    public static void drawTable(PDPage page, PDPageContentStream contentStream, float y, float margin,
                                 String[][] content) throws IOException {
        final int rows = content.length;
        final int cols = content[0].length;
        final float rowHeight = 50;
        final float tableWidth = page.getMediaBox().getWidth() - (2 * margin);
        final float tableHeight = rowHeight * rows;
        final float colWidth = tableWidth / (float) cols;
        final float cellMargin = 5f;

        // draw the rows
        float nexty = y;
        for (int i = 0; i <= rows; i++) {
            contentStream.drawLine(margin, nexty, margin + tableWidth, nexty);
            nexty -= rowHeight;
        }

        // draw the columns
        float nextx = margin;
        for (int i = 0; i <= cols; i++) {
            contentStream.drawLine(nextx, y, nextx, y - tableHeight);
            nextx += colWidth;
        }

        // now add the text
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

        float textx = margin + cellMargin;
        float texty = y - 15;
        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++) {
                String text = content[i][j];
                contentStream.beginText();
                contentStream.moveTextPositionByAmount(textx, texty);
                contentStream.drawString(text);
                contentStream.endText();
                textx += colWidth;
            }

            texty -= rowHeight;
            textx = margin + cellMargin;
        }
    }
*/

}
