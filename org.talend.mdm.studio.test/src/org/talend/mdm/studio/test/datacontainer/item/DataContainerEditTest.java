// ============================================================================
//
// Copyright (C) 2006-2010 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.studio.test.datacontainer.item;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.mdm.studio.test.TalendSWTBotForMDM;

/**
 * DOC rhou class global comment. Detailled comment
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class DataContainerEditTest extends TalendSWTBotForMDM {

    private SWTBotTreeItem dataContainerItem;

    private SWTBotTreeItem newNode;

    @Before
    public void runBeforeEveryTest() {
        dataContainerItem = serverItem.getNode("Data Container");
        dataContainerItem.expand();

        dataContainerItem.contextMenu("New").click();
        SWTBotShell newDataContainerShell = bot.shell("New Data Container");
        newDataContainerShell.activate();
        SWTBotText text = bot.textWithLabel("Enter a name for the New Instance");
        text.setText("TestDataContainer");
        sleep();
        bot.buttonWithTooltip("Add").click();
        sleep();
        bot.button("OK").click();
        bot.textWithLabel("Description").setText("This is a test for data container");
        bot.activeEditor().save();
        sleep();
        bot.activeEditor().close();
        newNode = dataContainerItem.getNode("TestDataContainer");
        Assert.assertNotNull(newNode);
        sleep(2);
    }

    @Test
    public void dataContainerEditTest() {
        SWTBotMenu editMenu = newNode.contextMenu("Edit");
        sleep();
        editMenu.click();
        bot.textWithLabel("Description").setText("This is a test for edit function of data container");
        bot.activeEditor().save();
    }

    @After
    public void runAfterEveryTest() {
        dataContainerItem.getNode("TestDataContainer").contextMenu("Delete").click();
        sleep();
        bot.button("OK").click();
        sleep();

    }

}