package com.amalto.workbench.detailtabs.sections.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xsd.XSDComponent;

public abstract class LanguageInfoCollection implements ISubmittable {

    private List<LanguageInfo> languageInfos = new ArrayList<LanguageInfo>();

    private XSDComponent sourceXSDComponent;

    public LanguageInfoCollection(XSDComponent sourceXSDComponent, LanguageInfo[] initLanguageInfos) {

        this.sourceXSDComponent = sourceXSDComponent;

        for (LanguageInfo eachLangInfo : initLanguageInfos)
            languageInfos.add(eachLangInfo);
    }

    public LanguageInfoCollection(XSDComponent sourceXSDComponent, Collection<LanguageInfo> initLanguageInfos) {
        this(sourceXSDComponent, initLanguageInfos.toArray(new LanguageInfo[0]));
    }

    public LanguageInfo[] getLanguageInfos() {
        return languageInfos.toArray(new LanguageInfo[0]);
    }

    public XSDComponent getSourceXSDComponent() {
        return sourceXSDComponent;
    }

    public Map<String, LanguageInfo> getLangCode2LangInfo() {

        Map<String, LanguageInfo> result = new HashMap<String, LanguageInfo>();

        for (LanguageInfo eachLangInfo : getLanguageInfos()) {
            result.put(eachLangInfo.getLanguageISOCode(), eachLangInfo);
        }

        return result;
    }

    public boolean isLabelInfo() {
        return false;
    }

    public boolean isDescriptionInfo() {
        return false;
    }

    public static LanguageInfoCollection createLabelInfoCollection(XSDComponent sourceXSDComponent,
            LanguageInfo[] initLanguageInfos) {
        return new LableInfoCollection(sourceXSDComponent, initLanguageInfos);
    }

    public static LanguageInfoCollection createLabelInfoCollection(XSDComponent sourceXSDComponent,
            Collection<LanguageInfo> initLanguageInfos) {
        return new LableInfoCollection(sourceXSDComponent, initLanguageInfos);
    }

    public static LanguageInfoCollection createDescriptionInfoCollection(XSDComponent sourceXSDComponent,
            LanguageInfo[] initLanguageInfos) {
        return new DescriptionInfoCollection(sourceXSDComponent, initLanguageInfos);
    }

    public static LanguageInfoCollection createDescriptionInfoCollection(XSDComponent sourceXSDComponent,
            Collection<LanguageInfo> initLanguageInfos) {
        return new DescriptionInfoCollection(sourceXSDComponent, initLanguageInfos);
    }
}