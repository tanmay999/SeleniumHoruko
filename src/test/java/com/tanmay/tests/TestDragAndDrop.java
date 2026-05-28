package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.DragAndDropPages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDragAndDrop extends BaseTest {

    @Test
    public void testDragAndDrop() throws InterruptedException {
        DragAndDropPages dragAndDropPages = new DragAndDropPages();
        dragAndDropPages.navigate();
        Assert.assertEquals(dragAndDropPages.getBoxAHeaderText(), "A", "data miismatch");
        Assert.assertEquals(dragAndDropPages.getBoxBHeaderText(), "B", "data mismatch");
        dragAndDropPages.dragAtoB();
        Assert.assertEquals(dragAndDropPages.getBoxAHeaderText(), "B", "data miismatch");
        Assert.assertEquals(dragAndDropPages.getBoxBHeaderText(), "A", "data mismatch");



    }
}
